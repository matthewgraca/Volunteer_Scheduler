public class Judge
{
  //  data field
  private String name;
  private String school;
  private Team[] teamsJudged;
  private Team[] teamsConflict;
  private final int MAX_ROUNDS = 20;
  private final int MAX_DEBATE_TYPES = 5;
  private boolean[] debatePref;
  private DebateType debate;

  //  constructors
  /*
   *  Two-argument constructor: Class Judge
   *  ------------------------------------------------------------
   *    This constructor sets the school and the name of the 
   *      judge, and sets default values for all other fields
   *  ------------------------------------------------------------
   *  param
   *    String school: the school the judge represents
   *    String name: the name of the judge
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public Judge(String school, String name)
  {
    this.school = school;
    this.name = name;
    teamsJudged = new Team[MAX_ROUNDS];
    teamsConflict = new Team[MAX_ROUNDS];
    debatePref = new boolean[MAX_DEBATE_TYPES];    
  }

  //  ACCESSORS
  /*
   *  public String getName(): Class Judge 
   *  ------------------------------------------------------------
   *    This method gets the name of the judge
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    the name of the judge
  */
  public String getName()
  {
    return name;
  }
  /*
   *  public String getSchool(): Class Judge
   *  ------------------------------------------------------------
   *    This method gets the school the judge represents
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    the school the judge represents
  */
  public String getSchool()
  {
    return school;
  }
  /*
   *  public Team[] getTeamsJudged(): Class Judge
   *  ------------------------------------------------------------
   *    This method gets an array of Teams the judge has seen
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    an array of Teams the judge has seen
  */
  public Team[] getTeamsJudged()
  {
    return teamsJudged;
  }
  /*
   *  public Team[] getTeamsConflict(): Class Judge
   *  ------------------------------------------------------------
   *    This method gets an array of teams the judge has a 
   *      personal conflict with
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    an array of teams the judge can't judge
  */
  public Team[] getTeamsConflict()
  {
    return teamsConflict;
  }
  /*
   *  public boolean prefCongress(): Class Judge
   *  ------------------------------------------------------------
   *    This method returns true if the judge prefers congress; 
   *      false if they do not
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    true if the judge prefers congress, false if otherwise
  */
  public boolean prefCongress()
  {
    return debatePref[debate.CONGRESS.ordinal()];
  }
  /*
   *  public boolean prefParli(): Class Judge
   *  ------------------------------------------------------------
   *    This method returns true if the judge prefers 
   *      parliamentary; false if they do not
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    true if the judge prefers parliamentary; false if not
  */
  public boolean prefParli()
  {
    return debatePref[debate.PARLI.ordinal()];
  }
  /*
   *  public boolean prefPF(): Class Judge
   *  ------------------------------------------------------------
   *    This method returns true if the judge prefers public 
   *      forum; false if they do not
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    true if the judge prefers public forum, false if otherwise
  */
  public boolean prefPF()
  {
    return debatePref[debate.PF.ordinal()];
  }
  /*
   *  public boolean prefLD(): Class Judge
   *  ------------------------------------------------------------
   *    This method returns true if the judge prefers Lincoln 
   *      Douglas; false if they do not
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    true if the judge prefers Lincoln-Douglas, false if
   *      otherwise
  */
  public boolean prefLD()
  {
    return debatePref[debate.LD.ordinal()];
  }
  /*
   *  public boolean prefCX(): Class Judge
   *  ------------------------------------------------------------
   *    This method returns true if the judge prefers policy 
   *      debate (AKA cross-examination debate); false if they do 
   *      not
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    true if the judge prefers policy/CX, false if otherwise
  */
  public boolean prefCX()
  {
    return debatePref[debate.CX.ordinal()];
  }

  //  mutators
  public void setName(String name)
  {
    this.name = name;
  }
  public void setSchool(String school)
  {
    this.school = school;
  }
  public void addTeamJudged(Team team)
  {
    boolean failedToAddTeam = true;
    //  add the team to an empty slot
    for(int i = 0; i < teamsJudged.length; ++i)
    {
      if(teamsJudged[i] == null)
      {
        teamsJudged[i] = team;
        failedToAddTeam = false;
        i = teamsJudged.length;
      }
    }

    //  yell at user if team not added successfully
    if(failedToAddTeam)
    {
      throw new IllegalStateException("Team could not be added!");
    }
  }
  public void addTeamConflict(Team team)
  {
    boolean failedToAddTeam = true;
    //  add the team to an empty slot
    for(int i = 0; i < teamsConflict.length; ++i)
    {
      if(teamsConflict[i] == null)
      {
        teamsConflict[i] = team;
        failedToAddTeam = false;
        i = teamsConflict.length;
      }
    }

    //  yell at user if team not added successfully
    if(failedToAddTeam)
    {
      throw new IllegalStateException("Team could not be added!");
    }
  }
  public void addPref(DebateType type)
  {
    debatePref[type.ordinal()] = true;
  }

  //  helpers
  public boolean hasJudged(Team team1)
  {
    //  yell at user for giving an empty team object
    if(team1 == null)
    {
      throw new IllegalArgumentException("Team being checked does not exist.");
    }

    //  find the team passed through
    boolean teamFound = false;
    int i = 0;
    while(!teamFound && i < teamsJudged.length)
    {
      if(teamsJudged[i] == team1)
      {
        teamFound = true;
      }
      ++i;
    }
    return teamFound;
  }
  public boolean hasJudged(Team team1, Team team2)
  {
    return hasJudged(team1) || hasJudged(team2);
  }
  public boolean hasConflict(Team team1)
  {
    //  yell at user for giving an empty team object
    if(team1 == null)
    {
      throw new IllegalArgumentException("Team being checked does not exist.");
    }

    //  find the team passed through
    boolean teamFound = false;
    int i = 0;
    while(!teamFound && i < teamsConflict.length)
    {
      if(teamsConflict[i] == team1)
      {
        teamFound = true;
      }
      ++i;
    }
    return teamFound;
  }
  public boolean hasConflict(Team team1, Team team2)
  {
    return hasConflict(team1) || hasConflict(team2);
  }  
}

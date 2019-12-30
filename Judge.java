import java.util.ArrayList;

public class Judge
{
  //  data field
  private String name;
  private String school;
  /**
   * TODO: Refractor to use linked lists once learned
   **/
  private ArrayList<Team> teamsJudged;
  private ArrayList<Team> teamsConflict;
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
    teamsJudged = new ArrayList<Team>();
    teamsConflict = new ArrayList<Team>();
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
  public ArrayList<Team> getTeamsJudged()
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
  public ArrayList<Team> getTeamsConflict()
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
  /*
   *  public void setName(String name): Class Judge
   *  ------------------------------------------------------------
   *    This method sets the name of the judge
   *  ------------------------------------------------------------
   *  param
   *    String name: name of the judge
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public void setName(String name)
  {
    this.name = name;
  }
  /*
   *  public void setSchool(String school): Class Judge
   *  ------------------------------------------------------------
   *    This method sets the school of the judge
   *  ------------------------------------------------------------
   *  param
   *    String school: school of the judge
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public void setSchool(String school)
  {
    this.school = school;
  }
  /*
   *  public void addTeamJudged: Class Judge
   *  ------------------------------------------------------------
   *    This method adds a team to the array of teams the judge
   *      has seen. If a team is not added, it throws an
   *      exception.
   *  ------------------------------------------------------------
   *  param
   *    Team team: the team that the judge has seen
   *    ArrayList<Team> teamsInTourney: list of teams in the 
   *      tournament
   *  ------------------------------------------------------------
   *  return
   *    none
  */ 
  public void addTeamJudged(Team team, ArrayList<Team> teamsInTourney)
  {
    // Check if team exists in the tournament
    if (team.existsInTournament(teamsInTourney))
    {
      // If team exists, adds team judged to list
      teamsJudged.add(team);
    }
    // If team does not exist, throw an exception 
    else
    {
      throw new IllegalStateException("Team could not be added!");
    }
  }
  /*
   *  public void addTeamConflict: Class Judge
   *  ------------------------------------------------------------
   *    This method adds a team to the array of teams the judge
   *      has a conflict with. If a team is not added, it throws 
   *      an exception.
   *  ------------------------------------------------------------
   *  param
   *    Team team: the team that the judge has a conflict with
   *    ArrayList<Team> teamsInTourney: list of teams in the
   *      tournament
   *  ------------------------------------------------------------
   *  return
   *    none
  */  
  public void addTeamConflict(Team team, ArrayList<Team> teamsInTourney)
  {
    //  check if team exists in the tournament
    if (team.existsInTournament(teamsInTourney))
    {
      //  add the team the judge has a conflict with to the list
      teamsConflict.add(team);
    }
    //  if the team does not exist, throw an exception
    else
    {
      throw new IllegalStateException("Team could not be added!");
    }
  }
  public void addPref(DebateType type)
  {
    debatePref[type.ordinal()] = true;
  }

  //  helpers
  public boolean hasJudged(Team team, ArrayList<Team> teamsInTourney)
  {
    //  check if the team exists
    if (team.existsInTournament(teamsInTourney))
    {
      //  find out if the judge has judged that team
      return teamsJudged.contains(team);
    }
    //  if the team does not exist, throw an exception
    else
    {
      throw new IllegalArgumentException("Team being checked does not exist.");
    }
  }
  public boolean hasJudged(Team team1, Team team2, ArrayList<Team> teamsInTourney)
  {
    return hasJudged(team1, teamsInTourney) || hasJudged(team2, teamsInTourney);
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
    while(!teamFound && i < teamsConflict.size())
    {
      if(teamsConflict.get(i) == team1)
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

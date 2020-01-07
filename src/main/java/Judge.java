import java.util.ArrayList;

public class Judge
{
  //  data field
  private String name;    // name of judge
  private String school;  // school the judge represents
  /**
   * TODO: Refractor to use linked lists once learned
   **/
  private ArrayList<Team> teamsJudged;    // list of teams judged
  // list of teams the judge has a personal conflict with
  private ArrayList<Team> teamsConflict;
  private final int MAX_DEBATE_TYPES = 5;
  // array of preferences the judge has for specific debate types
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
   *  public void addTeamJudged(Team team, 
   *    ArrayList<team> teamsInTourney): Class Judge
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
  public void addTeamJudged(Team team,
      ArrayList<Team> teamsInTourney)
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
   *  public void addTeamConflict(Team team, 
   *    ArrayList<Team> teamsInTourney): Class Judge
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
  public void addTeamConflict(Team team, 
      ArrayList<Team> teamsInTourney)
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
  /*
   *  public void addPref(DebateType type): Class Judge
   *  ------------------------------------------------------------
   *    This method adds a judge's preference for a specific 
   *      debate type
   *  ------------------------------------------------------------
   *  param
   *    DebateType type: type of debate the judge prefers
   *  ------------------------------------------------------------
   *  return
   *    none
  */ 
  public void addPref(DebateType type)
  {
    debatePref[type.ordinal()] = true;
  }

  //  helpers
  /*
   *  public boolean hasJudged(Team team, 
   *    ArrayList<Team> teamsInTourney: Class Judge
   *  ------------------------------------------------------------
   *    This method checks if a judge has judged a given team 
   *      already
   *  ------------------------------------------------------------
   *  param
   *    Team team: the team being checked
   *    ArrayList<Team> teamsInTourney: all the teams in the
   *      tournament
   *  ------------------------------------------------------------
   *  return
   *    true if this judge has seen this team, false if not
  */ 
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
      throw new IllegalArgumentException("Team does not exist.");
    }
  }
  /*
   *  private boolean hasJudged(Team team) : Class Judge
   *  ------------------------------------------------------------
   *    This method checks if a judge has judged a given team 
   *      already. this is an internal version where we know 
   *      for sure that the team is in the tournament
   *  ------------------------------------------------------------
   *  param
   *    Team team: the team being checked
   *  ------------------------------------------------------------
   *  return
   *    true if this judge has seen this team, false if not
  */
  private boolean hasJudged(Team team)
  {
    return teamsJudged.contains(team);
  }
  /*
   *  public boolean hasJudged(Team team1, Team team2, 
   *    ArrayList<Team> teamsInTourney): Class Judge
   *  ------------------------------------------------------------
   *    This method checks if a judge has judged one of the two 
   *      teams in a given set of teams
   *  ------------------------------------------------------------
   *  param
   *    Team team1: the first team being checked
   *    Team team2: the second team being checked
   *    ArrayList<Team> teamsInTourney: all the teams in the
   *      tournament
   *  ------------------------------------------------------------
   *  return
   *    true if the judge has seen one of the teams, false if not
  */ 
  public boolean hasJudged(Team team1, Team team2, 
      ArrayList<Team> teamsInTourney)
  {
    return hasJudged(team1, teamsInTourney) || 
      hasJudged(team2, teamsInTourney);
  }
  /*
   *  public boolean hasConflict(Team team, 
   *    ArrayList<Team> teamsInTourney): Class Judge
   *  ------------------------------------------------------------
   *    This method checks if a judge has a personal conflict 
   *      with a team. Judges with the same school as the team 
   *      have an automatic conflict
   *  ------------------------------------------------------------
   *  param
   *    Team team: the team being checked
   *  ------------------------------------------------------------
   *  return
   *    true if the judge has a personal conflict with the team, 
   *      false if otherwise
  */ 
  public boolean hasConflict(Team team, ArrayList<Team> teamsInTourney)
  {
    if (team.existsInTournament(teamsInTourney))
    {
      return teamsConflict.contains(team) || school.contains(team.getSchool());
    }
    else
    {
      throw new IllegalArgumentException("Team does not exist.");
    }
  }
  /*
   *  public boolean hasConflict(Team team): Class Judge
   *  ------------------------------------------------------------
   *    This method checks if a judge has a personal conflict 
   *      with a team. Judges with the same school as the team 
   *      have an automatic conflict. this is an internal 
   *      version where we know for sure that the team is a 
   *      part of the tournament
   *  ------------------------------------------------------------
   *  param
   *    Team team: the team being checked
   *  ------------------------------------------------------------
   *  return
   *    true if the judge has a personal conflict with the team, 
   *      false if otherwise
  */ 
  private boolean hasConflict(Team team)
  {
    return teamsConflict.contains(team) || school.contains(team.getSchool());
  }
  /*
   *  public boolean hasConflict(Team team1, Team team2): Class Judge
   *  ------------------------------------------------------------
   *    This method checks if a judge has a personal conflict 
   *      with a set of two teams
   *  ------------------------------------------------------------
   *  param
   *    Team team1: the first team being checked
   *    Team team2: the second team being checked
   *  ------------------------------------------------------------
   *  return
   *    true if the judge has a personal conflict with one of the 
   *    teams, false if otherwise
  */ 
  public boolean hasConflict(Team team1, Team team2, 
      ArrayList<Team> teamsInTourney)
  {
    return hasConflict(team1, teamsInTourney) || 
      hasConflict(team2, teamsInTourney);
  } 
  /*
   *  public Team getValidTeamToJudge(ArrayList<Team> teamsInTourney)
   *    : Class Judge
   *  ------------------------------------------------------------
   *    This method finds a valid team for the judge to watch
   *  ------------------------------------------------------------
   *  param
   *    ArrayList<Team> teamsInTourney: teams in the tournament
   *  ------------------------------------------------------------
   *  return
   *    a valid team to judge. if there is no valid team, it 
   *      returns null
  */ 
  public Team getValidTeamToJudge(ArrayList<Team> teamsInTourney)
  {
    //  search for a valid team to judge in the list
    boolean teamFound = false;
    Team validTeam = null;
    int i = 0;
    while (!teamFound && i < teamsInTourney.size())
    {
      //  check if there is a personal conflict or they have been judged by this judge
      if (hasConflict(teamsInTourney.get(i)) || hasJudged(teamsInTourney.get(i)))
      {
        ++i;
      }
      else
      {
        //  if a valid team was found, store it as valid
        validTeam = teamsInTourney.get(i);
        //  check if that team comes from the same school as the teams the judge has seen

        teamFound = true;
      }
    }
    return validTeam;
  }
  /*
   *  private boolean teamSchoolAlreadySeen(Team team): Class Judge
   *  ------------------------------------------------------------
   *    This method determines whether or not a judge has judged 
   *      a team from the same school before
   *  ------------------------------------------------------------
   *  param
   *    Team team: the team being checked
   *  ------------------------------------------------------------
   *  return
   *    true if the judge has seen a team from the team's school 
   *      before, false if not
  */ 
  private boolean teamSchoolAlreadySeen(Team team)
  {
    boolean invalidTeam = false;
    int i = 0;
    while (!invalidTeam && i < teamsJudged.size())
    {
      if (team.getSchool().contains(teamsJudged.get(i).getSchool()))
      {
        invalidTeam = true;
      }
      else
      {
        ++i;
      }
    }

    return invalidTeam;
  }
  //  toString
  @Override
  public String toString()
  {
    return String.format("%s: %s", school, name);
  }
}

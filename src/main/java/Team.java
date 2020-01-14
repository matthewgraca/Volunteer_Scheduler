import java.util.ArrayList;

public class Team
{
  //  data field
  private String event;   // debate type the team is partcipating in
  private String school;  // school the team is representing
  private String name1;   // name of the first competitor
  private String name2;   // name of the second competitor

  //  constructors
  /*
   *  Three-argument constructor: Class Team
   *  ------------------------------------------------------------
   *    This constructor sets the event, school, and the name of 
   *    the team. For use with debate types with only one competitor
   *  ------------------------------------------------------------
   *  param
   *    String event: debate type the team is participating in
   *    String school: the school the team represents
   *    String name1: the name of the team
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public Team(String event, String school, String name1)
  {
    this.event = event;
    this.school = school;
    this.name1 = name1;
    name2 = null;
  }
  /*
   *  Four-argument constructor: Class Team
   *  ------------------------------------------------------------
   *    This constructor sets the event, school, and the names of 
   *    the team. For use with debate types with two competitors
   *  ------------------------------------------------------------
   *  param
   *    String event: debate type the team is participating in
   *    String school: the school the team represents
   *    String name1: the name of the first competitor
   *    String name2: the name of the second competitor
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public Team(String event, String school, String name1, String name2)
  {
    this(event, school, name1);
    this.name2 = name2;
  }

  //  accessors
  /*
   *  public String getEvent(): Class Team
   *  ------------------------------------------------------------
   *    This function returns the event the team is competing in
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    the event the team is competing in
  */
  public String getEvent()
  {
    return event;
  }
  /*
   *  public String getSchool(): Class Team
   *  ------------------------------------------------------------
   *    This function returns the school the team is representing
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    the school the team is representing
  */
  public String getSchool()
  {
    return school;
  }
  /*
   *  public String getNames(): Class Team
   *  ------------------------------------------------------------
   *    This function returns the names of the competitors
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    the event the names of the competitors
  */
  public String getNames()
  {
    if(name2 == null)
      return name1;
    else
      return String.format(name1 + " and " + name2);
  }

  //  mutators
  /*
   *  public void setEvent(): Class Team
   *  ------------------------------------------------------------
   *    This function sets the event the team is participating in
   *  ------------------------------------------------------------
   *  param
   *    String event: the event the team is participating in
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public void setEvent(String event)
  {
    this.event = event;
  }
  /*
   *  public void setSchool(): Class Team
   *  ------------------------------------------------------------
   *    This function sets the school the team is representing
   *  ------------------------------------------------------------
   *  param
   *    String school: the school the team is representing
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public void setSchool(String school)
  {
    this.school = school;
  }
  /*
   *  public void setFirstName(): Class Team
   *  ------------------------------------------------------------
   *    This function sets the name of the first competitor
   *  ------------------------------------------------------------
   *  param
   *    String name1: name of the first competitor
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public void setFirstName(String name1)
  {
    this.name1 = name1;
  }
  /*
   *  public void setSecondName(): Class Team
   *  ------------------------------------------------------------
   *    This function sets the name of the second competitor
   *  ------------------------------------------------------------
   *  param
   *    String name2: name of the second competitor
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public void setSecondName(String name2)
  {
    this.name2 = name2;
  }
  /*
   *  public void setNames(): Class Team
   *  ------------------------------------------------------------
   *    This function sets the name of the competitors
   *  ------------------------------------------------------------
   *  param
   *    String name1: name of the first competitor
   *    String name2: name of the second competitor
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public void setNames(String name1, String name2)
  {
    this.name1 = name1;
    this.name2 = name2;
  }

  //  helpers
  /*
   *  public boolean existssInTournament(ArrayList<Team> 
   *    teamsIntourney): Class Team
   *  ------------------------------------------------------------
   *    This function checks if a team is in a list of the teams 
   *      in the tournament
   *  ------------------------------------------------------------
   *  param
   *    ArrayList<Team> teamsInTourney: list of teams in the 
   *      tournament
   *  ------------------------------------------------------------
   *  return
   *    true if the team is in the tournament, false if not
  */
  public boolean existsInTournament(ArrayList<Team> teamsInTourney)
  {
    return teamsInTourney.contains(this);
  }
  /*
   *  public boolean equals(Team team): Class Team
   *  ------------------------------------------------------------
   *    This function checks if one team is the same as another
   *  ------------------------------------------------------------
   *  param
   *    Team team: the team being checked
   *  ------------------------------------------------------------
   *  return
   *    true if they're the same, false if not
  */
  public boolean equals(Team team)
  {
    boolean sameNames = false;
    boolean sameSchool = false;
    boolean sameEvent = false;

    //  check names
    if (getNames().equals(team.getNames()))
    {
      sameNames = true;
    }
    //  check schools
    if (getSchool().equals(team.getSchool()))
    {
      sameSchool = true;
    }
    //  check events
    if (getEvent().equals(team.getEvent()))
    {
      sameEvent = true;
    }
    return sameNames && sameSchool && sameEvent;
  }
  //  toString
  @Override
  public String toString()
  {
    if(name2 == null)
      return String.format("%s %s %s", event, school, name1);
    else
    {
      return String.format("%s %s %s and %s", event, school, name1, 
          name2);
    }
  }
}

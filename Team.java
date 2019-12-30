//  The Team class consists of:
//
//    *DATA*
//
//    event: the event that the team is participating in
//    school: the school the team is representing
//    name1: name of the student
//    name2: name of the student's partner
//
//    *METHODS*
//
//    CONSTRUCTORS:
//    Team(String event, String school, String name1)
//      creates a one-man team
//    Team(String event, String school, String name1, String name2)
//      creates a two-man team
//
//    MUTATORS:
//    void setEvent(String event)
//      sets the event the team is participating in
//    void setSchool(String school)
//      sets the school the team is participating for
//    void setFirstName(String name1)
//      sets the name of the first competitor of the team
//    void setSecondName(String name2)
//      sets the name of the second competitor of the team
//    void setNames(String name1, String name2)
//      sets the names of the two competitors of the team
//
//    ACCESSORS:
//    String getEvent()
//      returns the event the team is participating in
//    String getSchool()
//      returns the school the team is partcipating for
//    String getNames()
//      returns the names of the competitors
//    String toString()
//      returns a string representation of the Team class
//
//    HELPERS:
public class Team
{
  //  data field
  private String event;
  private String school;
  private String name1;
  private String name2;

  //  constructors
  public Team(String event, String school, String name1)
  {
    this.event = event;
    this.school = school;
    this.name1 = name1;
    name2 = null;
  }
  public Team(String event, String school, String name1, String name2)
  {
    this(event, school, name1);
    this.name2 = name2;
  }

  //  accessors
  public String getEvent()
  {
    return event;
  }
  public String getSchool()
  {
    return school;
  }
  public String getNames()
  {
    if(name2 == null)
      return name1;
    else
      return String.format(name1 + " and " + name2);
  }

  //  mutators
  public void setEvent(String event)
  {
    this.event = event;
  }
  public void setSchool(String school)
  {
    this.school = school;
  }
  public void setFirstName(String name1)
  {
    this.name1 = name1;
  }
  public void setSecondName(String name2)
  {
    this.name2 = name2;
  }
  public void setNames(String name1, String name2)
  {
    this.name1 = name1;
    this.name2 = name2;
  }

  //  toString
  @Override
  public String toString()
  {
    if(name2 == null)
      return String.format("%s %s %s", event, school, name1);
    else
      return String.format("%s %s %s and %s", event, school, name1, name2);
  }
}

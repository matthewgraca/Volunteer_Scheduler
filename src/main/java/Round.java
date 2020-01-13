public class Round
{
  //  data field
  private Team firstTeam;
  private String sideOfFirstTeam;
  private Team secondTeam;
  private String sideOfSecondTeam;
  private Judge judge;

  //  constructors
  /*
   *  Four-argument constructor: Class Round
   *  ------------------------------------------------------------
   *    This constructor sets the teams and their respective sides
   *  ------------------------------------------------------------
   *  param
   *    String side1: side of the first team
   *    Team team1: the first team
   *    String side2: side of the second team
   *    Team team2: the second team
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public Round(String side1, Team team1, String side2, Team team2)
  {
    sideOfFirstTeam = side1;
    this.firstTeam = team1;
    sideOfSecondTeam = side2;
    this.secondTeam = team2;
  }
  /*
   *  Five-argument constructor: Class Round
   *  ------------------------------------------------------------
   *    This constructor sets the teams and their respective sides, 
   *      and the judge of the round
   *  ------------------------------------------------------------
   *  param
   *    String side1: side of the first team
   *    Team team1: the first team
   *    String side2: side of the second team
   *    Team team2: the second team
   *    Judge judge: the judge that will be judging the round
   *  ------------------------------------------------------------
   *  return
   *    none
  */
  public Round(String side1, Team team1, String side2, Team team2, Judge judge)
  {
    this(side1, team1, side2, team2);
    this.judge = judge;
  }

  //  ACCESSORS
  /*
   *  public String getSideOfFirstTeam(): Class Round
   *  ------------------------------------------------------------
   *    This method gets the side of the first team
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    the side of the first team
  */
  public String getSideOfFirstTeam()
  {
    return sideOfFirstTeam;
  }
  /*
   *  public Team getFirstTeam(): Class Round
   *  ------------------------------------------------------------
   *    This method gets the first team
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    the first team
  */ 
  public Team getFirstTeam()
  {
    return firstTeam;
  }
  /*
   *  public String getSideOfSecondTeam(): Class Round
   *  ------------------------------------------------------------
   *    This method gets the side of the second team
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    the side of the second team
  */
  public String getSideOfSecondTeam()
  {
    return sideOfSecondTeam;
  }
  /*
   *  public Team getSecondTeam(): Class Round
   *  ------------------------------------------------------------
   *    This method gets the second team
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    the second team
  */ 
  public Team getSecondTeam()
  {
    return secondTeam;
  } 
  /*
   *  public Judge getJudge(): Class Round
   *  ------------------------------------------------------------
   *    This method gets the judge of the round
   *  ------------------------------------------------------------
   *  param
   *    none
   *  ------------------------------------------------------------
   *  return
   *    the judge
  */
  public Judge getJudge()
  {
    return judge;
  }

  //  MUTATORS
  /*
   *  public void setSideOfFirstTeam(String side1): Class Round
   *  ------------------------------------------------------------
   *    This method sets the side of the first team
   *  ------------------------------------------------------------
   *  param
   *    String side1: the side of the first team
   *  ------------------------------------------------------------
   *  return
   *    none
  */ 
  public void setSideOfFirstTeam(String side1)
  {
    sideOfFirstTeam = side1;
  }
  /*
   *  public void setFirstTeam(Team team1): Class Round
   *  ------------------------------------------------------------
   *    This method sets the first team
   *  ------------------------------------------------------------
   *  param
   *    Team team1: the first team
   *  ------------------------------------------------------------
   *  return
   *    none
  */ 
  public void setFirstTeam(Team team1)
  {
    firstTeam = team1;
  }
  /*
   *  public void setSideOfSecondTeam(String side2): Class Round
   *  ------------------------------------------------------------
   *    This method sets the side of the second team
   *  ------------------------------------------------------------
   *  param
   *    String side2: the side of the second team
   *  ------------------------------------------------------------
   *  return
   *    none
  */ 
  public void setSideOfSecondTeam(String side2)
  {
    sideOfSecondTeam = side2;
  }
  /*
   *  public void setSecondTeam(Team team2): Class Round
   *  ------------------------------------------------------------
   *    This method sets the second team
   *  ------------------------------------------------------------
   *  param
   *    Team team2: the second team
   *  ------------------------------------------------------------
   *  return
   *    none
  */ 
  public void setSecondTeam(Team team2)
  {
    secondTeam = team2;
  }
  /*
   *  public void setJudge(Judge judge): Class Round
   *  ------------------------------------------------------------
   *    This method sets the judge of the round
   *  ------------------------------------------------------------
   *  param
   *    Judge judge: the judge of the round
   *  ------------------------------------------------------------
   *  return
   *    none
  */ 
  public void setJudge(Judge judge)
  {
    this.judge = judge;
  }
}

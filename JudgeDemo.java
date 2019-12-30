public class JudgeDemo
{
  public static void main(String[] args)
  {
    //  initialize judges in the tourney
    //  initialize the teams in the tourney
    Judge test = new Judge("Gab", "Matt Graca");
    if(test.prefCX())
    {
      System.out.println("Prefers CX");
    }
    test.addPref(DebateType.LD);
    if(test.prefLD())
    {
      System.out.println("Prefers LD");
    }
  }
}

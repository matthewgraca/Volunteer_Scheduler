import java.util.ArrayList;
public class JudgeDemo
{
  public static void main(String[] args)
  {
    //  Team test
    //  testing constructors and toString
    System.out.println("Testing Team constructors and toString");
    Team teamTest = new Team("LD", "Gab", "Matt Graca");
    System.out.println(teamTest);
    teamTest = new Team("CX", "Gab", "Matt Graca", "Richard Ding");
    System.out.println(teamTest);

    //  Judge test
    //  testing constructors
    System.out.println("Testing Judge constructors and toString");
    Judge judgeTest = new Judge("Gab", "Jonathan Hu");
  }
}

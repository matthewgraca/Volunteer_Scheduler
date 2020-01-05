import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class JudgeDemo
{
  public static void main(String[] args) throws IOException
  {
    ArrayList<Team> tournamentRoster = new ArrayList<Team>();
    //  Team test
    //  testing constructors and toString
    System.out.println("Testing Team constructors and toString");
    Team teamTest = new Team("LD", "Gab", "Matt Graca");
    System.out.println(teamTest);
    teamTest = new Team("CX", "Gab", "Matt Graca", "Richard Ding");
    System.out.println(teamTest);
    System.out.println();

    //  Judge test
    //  testing constructors
    System.out.println("Testing Judge constructors and toString");
    Judge judgeTest = new Judge("Gab", "Jonathan Hu");
    System.out.println(judgeTest);
    System.out.println();

    //  filling the tournament roster
    System.out.println("Grabbing the PF tournament roster from a file, stuffing it into an array list, and outputting it.");
    File myFile = new File("PF_Roster.txt");
    Scanner inputFile = new Scanner(myFile);
    while (inputFile.hasNext())
    {
      tournamentRoster.add(new Team("PF", inputFile.next(), inputFile.next(), inputFile.next()));
    }
    inputFile.close();
    for (int i = 0; i < tournamentRoster.size(); ++i)
    {
      System.out.println(tournamentRoster.get(i));
    }
  }
}

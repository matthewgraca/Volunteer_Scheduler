import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class JudgeDemo
{
  public static void main(String[] args) throws IOException
  {
    ArrayList<Team> pofoTournamentRoster = new ArrayList<Team>();
    ArrayList<Judge> judgeRoster = new ArrayList<Judge>();
    //  Team test
    //  testing constructors and toString
    System.out.println("Testing Team constructors and toString");
    Team teamTest = new Team("LD", "Gabrielino", "Matt Graca");
    System.out.println(teamTest);
    teamTest = new Team("CX", "Gabrielino", "Matt Graca", "Richard Ding");
    System.out.println(teamTest);
    System.out.println();

    //  Judge test
    //  testing constructors
    System.out.println("Testing Judge constructors and toString");
    Judge judgeTest = new Judge("Gabrielino", "Jonathan Hu");
    System.out.println(judgeTest);
    System.out.println();

    //  filling the tournament roster
    System.out.println("Grabbing the PF tournament roster from a file, stuffing it into an array list, and outputting it.");
    File myFile = new File("PF_Roster.txt");
    Scanner inputFile = new Scanner(myFile);
    while (inputFile.hasNext())
    {
      pofoTournamentRoster.add(new Team("PF", inputFile.next(), inputFile.next(), inputFile.next()));
    }
    inputFile.close();

    //  print out the tournament roster
    for (int i = 0; i < pofoTournamentRoster.size(); ++i)
    {
      System.out.println(pofoTournamentRoster.get(i));
    }
    System.out.println();

    //  filling out the judge roster
    System.out.println("Filling out a judge roster and printing it out");
    judgeRoster.add(judgeTest);
    judgeRoster.add(new Judge("Arcadia", "John Doe"));
    judgeRoster.add(new Judge("Alhambra", "Jane Doe"));
    judgeRoster.add(new Judge("El Cerrito", "Action Jackson"));

    //  print out the judge roster
    for (int i = 0 ; i < judgeRoster.size(); ++i)
    {
      System.out.println(judgeRoster.get(i));
    }
    
    //  check out the judge checks
    System.out.println("\nTesting out the hasConflict method");
    if (judgeRoster.get(0).hasConflict(pofoTournamentRoster.get(2), pofoTournamentRoster))
    {
      System.out.println(judgeRoster.get(0) + " has a conflict with " + pofoTournamentRoster.get(2));
    }
    if (!judgeRoster.get(0).hasConflict(pofoTournamentRoster.get(1), pofoTournamentRoster))
    {
      System.out.println(judgeRoster.get(0) + " does not have a conflict with " + pofoTournamentRoster.get(1));
    }
    System.out.println();

    //  test getValidTeamToJudge()
    System.out.println("Testing getValidTeamToJudge()");
    System.out.println(judgeRoster.get(0) + " can judge " + judgeRoster.get(0).getValidTeamToJudge(pofoTournamentRoster));
  }
}

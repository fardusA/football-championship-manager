package footballchampionships;

import java.util.Random;
import java.util.Scanner;

public class FootballClub extends SportsClub
{
    // variables are private so that no outside classes can directly change them
    private int wins;
    private int defeats;
    private int draws;
    private int points;
    private int goalsScored;
    private int goalsReceived;
    private int matchesPlayed;
    
    
    public FootballClub()  //constructor to use Sportsclub constructor
   {
       super();
   }
    
    
   public FootballClub (String nameofClub, String locationofClub) //preset name of club and location*/
   {
     super(nameofClub,locationofClub);
   }
    
   
    public void randomStats() { //initialises random statistics 

        Random random = new Random();
        
        int winsR = random.nextInt(5) + 1;
        wins = winsR;
        int drawsR = random.nextInt(5) + 1;
        draws = drawsR;
        int defeatsR = random.nextInt(5) + 1;
        defeats = defeatsR;
        int goalsScoredR = random.nextInt(5) + 1;
        goalsScored = goalsScoredR;
        int goalsReceivedR = random.nextInt(5) + 1;
        goalsReceived = goalsReceivedR;
        int matchesPlayedR = random.nextInt(5)+ 1;
        matchesPlayed =  matchesPlayedR;
        int pointsR = ((wins *3) + (draws));// win = 3 points draw = 1 point
        points = pointsR;

    }

    
    public void clubStats(String clubName) //lets you view all the statistic of a certain club
    {
        
       if(clubName.contains(super.getClubname())) // if the clubname that the user inputted is equal to an existing club's name, then run the if statement
       {
          System.out.println("Club Name" + "\t" + "Wins" + "\t" + 
                               "Draws" + "\t" + "Defeats" + "\t" + 
                               "Goals Scored" + "\t" + "Goals Received" + "\t" + 
                               "Club Points"+"\t" + "MatchesPlayed");
           System.out.println(clubName + "\t" +"\t"+ wins + "\t" + 
                               draws + "\t" + 
                               defeats + "\t" + 
                               goalsScored + "\t" +"\t"+
                               goalsReceived + "\t"+"\t"+
                               points + "\t" + "\t"+ matchesPlayed
                              );
        } else { //else system will go back to menu
                System.console();
               }
  
    }
    
    
    public void setPlayedMatch(String teamName) //updates the matchesPlayed statistic
    {
        matchesPlayed = (this.matchesPlayed)+ 1;//adds one more matchesPlayed on to matchesPlayed
        System.out.println(teamName+ ":" + " played match, the total amount of played matches is: "+ matchesPlayed);
      
    }
   
    
    public void setGoalsReceived(int teamScore, String teamName) //updates goalsReceived statistic
    {
        goalsReceived = (this.goalsReceived)+ teamScore; //adds however many goals the opposing team scored onto the goalsReceived statistic
        System.out.println( teamName + ":" + " lost "+ teamScore +" goal/s to other team, the total amount of goals received is:  "+ goalsReceived );
    }
    
    
       public void setGoalsScored(int teamScore, String teamName) //updates goalsScored statistic
    {
        goalsScored = (this.goalsScored)+ teamScore; //adds however many goals the team scored onto their goalsScored statistic
        System.out.println( teamName + ":" + " scored " + teamScore + " goal/s, the total amount of goals scored is:  "+ goalsScored );
    }
    
    
    public void setWins(String teamName) //update wins statistic
    {
        wins = (this.wins)+1; //adds 1 more wins onto the wins statistic
        System.out.println( teamName + ":" + " won, 1 added to wins, total amount of wins is: "+ wins );
    }
    
    
      public void setDefeats(String teamName)
    {
        defeats = (this.defeats)+1;
        System.out.println(teamName + ":" +" lost, 1 defeat added, total amount of defeats is: "+ defeats);
    }
      
      
 public void setDraws(String teamName) //if both teams drawed, then add 1 to each club's draws statistic
    {
        draws = (this.draws) + 1; //updates draws statistic, adds 1 more draws on to the draws statistic
        System.out.println(teamName + ":" + " drawed, the total amount of draws are:  "+ draws);
    }
    
      
    public void setClubPointsWon(String teamName)
    {
        points = (this.wins)*3; // 3 points (club points) for every win
        System.out.println(teamName + ":" + " won, 3 points added, the total amount of points are:  " +  points);
    }
    
    
    public void setClubPointsDraw(String teamName) //set club points if both teams score the same amount of goals in match(i.e. match is a draw)
    {
        points = (this.draws)*1; // 1 point (club points) for every draw
        System.out.println(teamName + ":" + "  drawed, 1 points added, the total amount of points are:  " +  points);
    }
    
    
    public void setName(String name) //set the name of the new club 
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the footballclub's name: ");
        name = input.next();
        super.setClubname(name);
    }
   
    
   @Override
    public void setLocation (String location) //set the location of the new club
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the footballclub's location:");
        location = input.next();
        super.setClublocation(location);
    }
     
     
    public void addtoPremierLeague(String clubName, int points, int matchesPlayed) // the clubName and the points from the addtoPremierLeague method in premierLleagueManager class is passed in
    {  
        if (!clubName.contains(super.getClubname())) //if the clubName that is passed in from the previous method is not an existing club name 
          {
            System.out.println("this club does not exist");
           
          }else{ //else display the premier league table
                clubName=(super.getClubname());
                points= (this.points);
                matchesPlayed = (this.matchesPlayed);
                
                System.out.println( clubName+ ":"+ " Location: "+ super.getClublocation() + " Matches Played:  "+ matchesPlayed+" Points:  "+ points+"  will be added to Premier League");
               }
    }
    
     
    public void  getPremierLeagueTable() //get the premier League table (e.g. the name of the club, it's location and it's points)
    {
        System.out.println("Club Name:"+ super.getClubname() + " Location: "+ super.getClublocation()+ "  Matches Played: " + matchesPlayed+"  Points: "+ points);
       
    }

package footballchampionships;

import java.util.ArrayList;
import java.util.Scanner;

public class PremierLeagueManager implements LeagueManager {
    
    Scanner input = new Scanner (System.in);
    ArrayList <FootballClub> clubs = new ArrayList<FootballClub>(); //arraylist that will store all the clubs in the system
    ArrayList <FootballClub> premierLeagueClubs = new ArrayList <footballClub>();//arraylist will store the premier league clubs
     
    String clubName=""; 
    String clubLocation="";
    String choice= "";
    FootballClub fclub;//name of FootballClub object
    

    
    public  PremierLeagueManager()//constructor assigns elements to the clubs ArrayLlist
    {
        clubs.add(new FootballClub("Arsenal","London"));
        clubs.add(new FootballClub("Chelsea","London"));
        clubs.add(new FootballClub("Liverpool","Merseyside"));
        
    }
    
     
public void menuoption(){ //prints out the menu and also calls the other methods in this class
    
        PremierLeagueManager manager = new PremierLeagueManager();
        int Runprogram = 0; 
     
        while (Runprogram != '0')//the menu runs if runprogram element is not equal to 0
        { 
            System.out.println("-------------------------------------------------------------------------");
           System.out.println("Enter 1: To Add a new football team and also add it to the premier league");
           System.out.println("Enter 2: To view all the clubs in the system");
           System.out.println("Enter 3: To view a certain club's statistics");
           System.out.println("Enter 4: To view the Premier League Table");
           System.out.println("Enter 5: To delete a club from the Premier League Table");
           System.out.println("Enter 6: To add a played match with it's score");
            System.out.println("-------------------------------------------------------------------------");
      
           int choice;
           choice = input.nextInt();
         
            switch (choice) 
            {
                case 1:  
                    manager.addClub(); //adds a new football club to the system 
                    manager.addtoPremierLeagueTable(); //if the user says yes, then that football club is also added to the premier league 
                    break;
                case 2:
                    manager.viewallClubs(); //view all the football clubs in the system
                    break;
                case 3:
                    manager.viewStatistics(); //view a football club's individual statistics
                    break;  
                case 4:
                    manager.printPremierLeagueTable(); //view the premier league table
                    break;
                case 5:
                    manager.deletefromPremierLeagueTable(); //deletes a football club from the premier league 
                    break;
                case 6: 
                    manager.addPlayedMatch(); //add a played match and also update statistics of both clubs involved(wins,defeats,points,goalsScored,goalsReceived,matchesPlayed)
                    break;
            
            }//end of switch
   
        }//end of while
    }
    

public void addClub() //adds a new football club to the system 
{
            fclub = new FootballClub(); //new Footballclub object(fclub) created
            clubName= ""; //current name of the club which is nothing
            fclub.setName(clubName); //current name of the club is sent to method setName in order to add the club's name to the object
         
            clubLocation=""; //current location of the club is nothing
	    fclub.setLocation(clubLocation); //current location of the club is sent to method setName in order to add the club's name to the object
            fclub.randomStats(); //after adding a the name of the club + the location to the new fclub object, the footballclub is also given random statistics
            clubs.add(fclub); // the new fclub object with it's name/location/statistics is then added to the clubs array
       
}
            
       
public void viewallClubs() //view all the football clubs, their names and locations, in the system
{
        for (int v = 0 ; v < clubs.size(); v++)//for loop is initialised to the size of the clubs ArrayList in order to get all fclub objects out, in order of index
        {
            if (clubs.get(v).getClubname().equals("")&& clubs.get(v).getClublocation().equals(""))//if the clubs ArrayList does not contain any objects then print out the sout line 
            {
               System.out.println("no clubs added yet");
            } else //print out each object in the clubs ArrayList (e.g. print out all the football clubs that are in the system)
                  {
                    System.out.println( v +"."+ clubs.get(v).getClubname()+"  Location: "+ clubs.get(v).getClublocation());
                  }//end of else
            
        }//end of for loop
}
        

    
 public void viewStatistics() //view a football club's individual statistics
 {
        System.out.println("Which football team's statistics would you like to see? ");//ask use which football club's statistics they would like to see
        clubName = input.next();//user input is stored in variable clubName
        
        for (int s = 0; s < clubs.size() ; s++) //for loop is initialised to the size of the clubs ArrayList in order to get all fclub objects out with their statistics
        {
             clubs.get(s).clubStats(clubName); // variable with the user input is sent in parameters to the clubStats method in class footballClub
        
        }//end of for loop
}
 

@Override
public void addtoPremierLeagueTable() // view the premier league table(this method is run exactly after the previous addclub method)
{
        
        System.out.println("do you want to add the club to the premier league?"); //asks user if they would like to add the newly created footballClub to the premier league 
        choice = input.next(); //the user input is stored in the choice variable
        
        if (choice.equalsIgnoreCase("yes")) //if the user inputted 'yes' (either lowercase/ uppercase/both) the club will be added to the Premier League
        {
            clubName = fclub.getClubname(); //the previous club name inputed by the user in the addClub method will be retrieved and will be stored in variable clubName
            
            int points = 0; //the club points will be initialised to 0 at first 
            int matchesPlayed= 0; //the amount of matches played by the club will also be initialised to 0 at first
            
            fclub.addtoPremierLeague(clubName, points, matchesPlayed); //the clubName containing the input from addClub and the points variables will be passed to the addtoPremierLeague method in footballClub to get the club's points/matchesplayed/name
            premierLeagueClubs.add(fclub); //after getting the points/name/matchesPlayed, the fooballClub is added to the premierLeague including the information got            
        
        }else //if the user's choice is no or something other than yes, then the user is returned back to the menu option
              {
                System.console();
              }//end of else 
} 


    @Override
public void deletefromPremierLeagueTable() //deletes a football club from the premier league 
{
    
        System.out.println("Enter the name of the football club you would like to remove from the Premier League: "); 
        String nameChoice = input.next(); //user input for the name of the club is stored in the nameChoice variable
        
        System.out.println("Enter the location of the club you would like to remove from the Premier League: ");
        String locationChoice = input.next(); //user input for the location of the club is stored in the nameChoice variable
        
        for (int s = 0; s < premierLeagueClubs.size() ; s++) //for loop is initialised to the size of the premierLeagueClubs ArrayList in order to get the footballclubobjects that are stored in the premierLeagueClubs array
        {
           if (nameChoice.equals(premierLeagueClubs.get(s).getClubname()) && locationChoice.equals(premierLeagueClubs.get(s).getClublocation())) //checks if any of the footballclub objects have the club name and the location that the user inputted
            {
               premierLeagueClubs.remove(s); //if the statement returns true, then remove the football club object, that has both the name and the location that the user inputted, from the premierLeagueClubs ArrayList (i.e. emove from premier league) 
               System.out.println("The club has been removed from premierLeague, enter 4 to view updated list of premier league clubs");
               
            }else //if the statement returns false then run this
                {
                   System.out.println("club does not exist");
                   System.console();
                }
        }//end of for loop
    }

@Override
public void printPremierLeagueTable() //view the premier league table
{
        
        for (int v = 0 ; v < premierLeagueClubs.size(); v++)
        {
            if (premierLeagueClubs.equals(null))//if the premierLeagueClubs ArrayList is empty then print out that line
            {
               System.out.println("no clubs in premier league");
            }else //or if it's not, then print out all football club's in the premierLeagueClubs ArrayList
                { 
                   for(int plt = 0 ; plt < premierLeagueClubs.size(); plt++)
                   {
                     premierLeagueClubs.get(v).getPremierLeagueTable();
                    
                   }
                }
           
       }//end of for loop
 }
 
 public void addPlayedMatch() //add a played match and also update statistics of both clubs involved
 {
        System.out.println("Enter the name of the first team: "); 
        String team1= input.next();//the club that won will be stored in team1 variable
        System.out.println("Enter how many goals the team scored: ");
        int team1Score = input.nextInt(); //how many goals the club scored will be stored in here
        
        System.out.println("Enter the club second team: "); 
        String team2= input.next();//the losing club is stored in team2 variable
        System.out.println("Enter how many goals the team scored: ");
        int team2Score = input.nextInt(); // how many goals the scored will be stored in here
        
        System.out.println("--------NUMBER OF MATCHES PLAYED--------");
        fclub.setPlayedMatch(team1); //name of team1 is sent to setPlayedMmatch method n FootballClub class to update the matchesPlayes statistic(add 1 more to matchesPlayed)
        fclub.setPlayedMatch(team2); //name of team2 is sent to setPlayedMmatch method n FootballClub class to update the matchesPlayes statistic(add 1 more to matchesPlayed)
        System.out.println("\n");
        
        System.out.println("--------GOALS SCORED BY EACH TEAM--------");
        fclub.setGoalsScored(team1Score,team1);  //updates the goalsScored statisticfo team1 (add to goalsScored) 
        fclub.setGoalsScored(team2Score, team2); //updates the goalsScored statistic for team2 (add to goalsScored) 
        System.out.println("\n");
        
        if (team1Score > team2Score) //if team1 wins
        { 
            System.out.println("--------FIRST TEAM WON--------");
            fclub.setGoalsReceived(team1Score, team2); //However many goals team1 scored will be added to team2's goalsReceived
            fclub.setWins(team1); //update wins statistic for team1 (add 1 more wins)
            fclub.setClubPointsWon(team1); //update points statistic for team 1 (add 3 more to wins)
            fclub.setDefeats(team2);// update defeats statistic for team 2 (add 1 more to defeats)
            
        }else if ( team2Score > team1Score) //if team2 wins
           {
            System.out.println("--------SECOND TEAM WON--------");
            fclub.setGoalsReceived(team2Score, team1); //however many goals team2 scored will be added to team1's goalsRreceived
            fclub.setWins(team2); //update wins statistic for team2 (add 1 more wins)
            fclub.setClubPointsWon(team2); //update points statistic for team 2 (add 3 more to wins)
            fclub.setDefeats(team1);  // update defeats statistic for team 1 (add 1 more to defeats)
            
           }else if (team1Score == team2Score)
             {
                System.out.println("--------DRAW--------");
                fclub.setDraws(team1); //updates the draw statistic for team1 (adds 1 more to the draws statstic)
                fclub.setClubPointsDraw(team1);//update club points for team 1 (adds 1 more to the points statistic)
                
                fclub.setDraws(team2); //updates the draw statistic for team2 (adds 1 more to the draws statstic)
                fclub.setClubPointsDraw(team2); //update club points for team 2 (adds 1 more to the points statistic)
             }
        

}
}

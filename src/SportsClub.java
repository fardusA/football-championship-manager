
package footballchampionships;

public abstract class SportsClub {
  
    private String nameofClub;
    private String locationofClub;
    
   public SportsClub(){//constructor
   
        nameofClub= "";
        locationofClub ="";
    }
    
    public SportsClub(String name, String location){ //constructor
        nameofClub = name;
        locationofClub = location;
    }
    
    protected void setClubname(String name){ //overrides what is inside this.nameofClub to contain the one being sent through parameters(name)
       this.nameofClub= name;
    }
    
    protected String getClubname(){//return the value in nameofClub
        return nameofClub;
    }
    
    protected void setClublocation(String location){//overrides what is inside this.locationofClub to contain the one being sent through parameters(location)
        this.locationofClub = location;
    }
    
    protected String getClublocation (){//return the value in locationofClub
        return locationofClub;
    }
    
    public abstract void setName(String name); //declare abstract method which will be implemented in subclass (footballClub)
    public abstract void setLocation(String location); //declare abstract method which will be implemented in subclass (footballClub)
      
     
}

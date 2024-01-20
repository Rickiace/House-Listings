/**
 * HouseListing -- This is the HouseListing class containing Main which creates a menu using a do while loop to add, remove, print houses 
                 using input from user, and printing all houses in the linked list
 * @author    Ricki Ace Gaborno
 */


//Importing a Scanner to scan input from users
import java.util.Scanner;


public class HouseListing {

   public static void main(String args []) throws HouseException{
   
      //instance variables
      int i;
      int SIZE = 100;
      int userChoice = 5;
      int tmpMls = 10001;
      int tmpBedrooms = 1;
      double tmpPrice = 5;
      String tmpSeller = "tgh";
          
      //Calls House class to create a House called h1    
      House h1 = new House (tmpMls, tmpBedrooms, tmpPrice, tmpSeller);    
      
      //calls HList to create a new linked list
      HList List = new HList();
          
      //Create a scanner called scnr   
      Scanner scnr = new Scanner(System.in);
      
      // A do while loop containing menu and a switch 
      do {
         System.out.println("Menu");
         System.out.println("1. add a house");
         System.out.println("2. remove a house");
         System.out.println("3. print houses that cost less than a given price");
         System.out.println("4. print all the houses");
         System.out.println("0. end this program");
         System.out.println("Please Select The Number With The Option You Want To Execute");
         
         // Try Catch exception to catch wrong data type inputs & invalid options from user
         try {
            scnr = new Scanner(System.in);
            userChoice = scnr.nextInt();
         }
         catch (Exception e) {
            System.out.println("You didn't choose a number between 0 to 4");
            userChoice = 5;
            continue;
         }
         
         // A switch Statement that creates 4 cases and a default case that corresponds to user input
         switch(userChoice) {
            
            // Case 1 Creates a House object which is referenced into a node and then adds it into a list
            case 1:
               System.out.println("You Chose to add a house");
               
               while(true){
                  try {
                     System.out.println("Enter a listing number between 10001 and 99999");
                     scnr = new Scanner(System.in);
                     tmpMls = scnr.nextInt();
                     
                     h1.setMls(tmpMls);
                     
                  }
                  catch (HouseException me) {
                     System.out.println(me.getMessage());
                     continue;
                  }
                  catch (Exception e) {
                     System.out.println("You Entered An Invalid Data Type");
                     continue;
                  }
                  
                  break; 
               }
               
               while(true){
                  try {
                     System.out.println("Enter the amount of bedrooms between 1 to 5");
                     scnr = new Scanner(System.in);
                     tmpBedrooms = scnr.nextInt();
                     
                     h1.setBedrooms(tmpBedrooms);
                     
                  }
                  catch (HouseException me) {
                     System.out.println (me.getMessage());
                     continue;
                  }
                  catch (Exception e) {
                     System.out.println ("You entered an invalid Data Type");
                     continue;
                  }
                  break;
               }
               
               while(true){
                  try {
                     System.out.println("Enter a Price between $0 and $1,000,000");
                     scnr = new Scanner(System.in);
                     tmpPrice = scnr.nextDouble();
                     
                     h1.setPrice(tmpPrice);
                  }
                  catch (HouseException me) {
                     System.out.println (me.getMessage());
                     continue;
                  }
                  catch (Exception e) {
                     System.out.println ("You entered an invalid Data Type");
                     continue;
                  }
                  break;
               }  
                            
               while(true){
                  try {
                     System.out.println("Enter the seller name atleast 2 characters long");
                     scnr = new Scanner(System.in);
                     tmpSeller = scnr.nextLine();
                     
                  h1.setSeller(tmpSeller);
                  
                  }
                  catch (HouseException me) {
                     System.out.println (me.getMessage());
                     continue;
                  }
                  catch (Exception e){ 
                     System.out.println ("You entered an invalid Data type");
                     continue;
                  }
                  break;
               }

               List.add(h1);
               
                               
            break;
         
            // Case 2 Scans Mls number inputed by user then checks linked list for a node that has a house with entered listing number then removes it
            case 2:
               System.out.println("You chose to remove a House");
               scnr = new Scanner(System.in);
               
               while(true) {
               
                  System.out.println("Enter the listing number of the house you want to remove");
                  try {
                     scnr = new Scanner(System.in);
                     tmpMls = scnr.nextInt();
                  }
                  catch(Exception e) {
                     System.out.println ("You didn't enter a number between 10001 and 99999");
                     continue;
                  } 
                        
                  if( (10001 <= tmpMls) &&  (tmpMls <= 99999) ){
                     if( List.remove(tmpMls) == true) {
                        System.out.println( "You have successfully remove a house");
                        break;
                     }
                     else {
                        System.out.println("The house with the given mls doesn't exist");
                        
                     }
                  }
                  else {
                     System.out.println("You have entered an invalid Mls number");
                     continue;
                  }  
               break;                  
               }               
            break;         
         
            // Case 3 Scans an input from user for price then checks linked list for nodes for houses that have less than price entered
            case 3:
            
               System.out.println("You Chose to print all houses that cost less than given price");
               
               while(true){
                  System.out.println("Enter a Price between $0 and $1,000,000");
                  scnr = new Scanner(System.in);
                  
                  try {
                     tmpPrice = scnr.nextDouble();
                  }
                  catch (Exception e) {
                     System.out.println (" You didn't enter a valid price between $0 and $1,000,000");
                     continue;
                  }
                  
                  if( (0 < tmpPrice) && (tmpPrice <= 1000000) ){
                     break;
                  }
                  else {
                     System.out.println("You have entered an Invalid Price");
                     continue;
                  }
               }
                  
                  System.out.println("These are the house's that cost less than " + tmpPrice );
                  List.printHouseLessThan(tmpPrice, List.getFirst());
               break;
               
            //Case 4 Prints all the nodes inside of the linked list   
            case 4:               
            
            
            
               System.out.println("You chose to Print all Houses");
               
               List.printAllHouse(List.getFirst());
               
            break;
            
            // Default prints message if user chooses an invalid option   
            default:
               if (userChoice == 0) {
                  break;
               }
               else {
                  System.out.println("You Chose An Invalid Option");
               }
         
         
         
         
         }
         
         
         
         
         
         
         
         
         
         
         
         
      }while (userChoice != 0);
   
      System.out.println("Thank You");
   
   
   
   
   
   
   
   
   
   }
}
/**
 * HList -- A class that lists Nodes from HNode that contains House Objects. This class is used by the driver class to add, remove, and find specific House Objects
 * @author    Ricki Ace Gaborno
 */


public class HList {

   //instance variables
   private static int count;
   private HNode first = null;
   private HNode last = null;

   public HList() {
      count = 0;
   }
   
   //Adds a HNode and check of mls number is duplicated
   //Takes in House parameter
   public void add (House h) {
      try{
         House nHouse = new House(h.getMls(), h.getBedrooms(), h.getPrice(), h.getSeller()); 
         HNode n = new HNode(nHouse);
      
      if ( first == null) {
         n.setNext(first);
         first = n;
         count++;
      }
      else {
         HNode cursor = first;
         while (cursor != null) {
            if( (n.getHouse()).getMls() == (cursor.getHouse()).getMls() ){
               System.out.println ("House with the entered listing number already exists");
               break;
            }
            else if (cursor.getNext() == null){
               n.setNext(first);
               first = n;
               count++;
            }
            cursor = cursor.getNext();
            }
      
      
      
      
      }
      
      
      }
      catch (HouseException me) {
         System.out.println (me.getMessage());
      }
   }
  
   //Removes house with the entered listing number and returns true if it does
   public boolean remove(int mls) {
      boolean result = true;
      HNode cursor = first;
      if(first == null){
         
         System.out.println("test");
         result = false;
      }
      
      
      else {
         while (cursor != null) {
            if( mls == (cursor.getHouse()).getMls() ){
               cursor.setHouse(first.getHouse());
               delete();
               result = true;
            }
            cursor = cursor.getNext();
            }
            while (cursor != null) {
               if (mls != (cursor.getHouse()).getMls() ) {
                  cursor.setHouse(first.getHouse());
                  result = false;
               }
            
               cursor = cursor.getNext();
            }   
         }
       return result;   
      }
   
         
   //Prints all Nodes data that is inside of the linked list
   public void printAllHouse(HNode cursor) {
      if (cursor == null) {
         System.out.println("There are no Houses left to Print");
         return;
      }
      else {
         System.out.println(cursor.toString());
         printAllHouse(cursor.getNext());
         
      }         
   }
   
   //Prints all Nodes data with houses that are priced less than entered amount 
   public void printHouseLessThan(double price, HNode cursor) {
      if (cursor == null) {
         System.out.println("There are no Houses left to print");
         return;
      }
      else { 
         if (price > (cursor.getHouse()).getPrice()) {
            System.out.println(cursor.toString());
            printHouseLessThan(price, cursor.getNext());
         }
      }
   
   
   
   
   }
   
      //deletes first node of linked list
      public void delete() {
         if (first != null) {
            first = first.getNext();
         }  
      }
   
      
      public HNode getFirst() {
         return first;
      }
   

   
   
   
   
}







      
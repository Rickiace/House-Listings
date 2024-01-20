/**
 * HouseException -- This is a class that is used to create custom exceptions 
 * @author    Ricki Ace Gaborno
 */
 
 // Exception class to create a custom Exception
 public class HouseException extends Exception {
 
 
 
   private String message;
   

   // Default Constructor  
   HouseException(){
      setMessage("");
   }
   
   // A set method for Exception Message
   public void setMessage(String message) {
      this.message = message;
   }
   
   // Get method that returns set Message
   public String getMessage() {
      return this.message;
   }
   
   
}

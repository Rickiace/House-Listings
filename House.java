/**
 * House -- This is a class that contains Constructors, Set Methods and, Get Methods to set parameters for a House Object
 * @author    Ricki Ace Gaborno
 */
 
// Importing a Decimal Format Class to create a custom format pattern for Price
import java.text.DecimalFormat;

public class House {

   // Instance Variables With Required Details To Fill Constructor 
   
   private int mls;
   private int bedrooms;
   private double price;
   private String seller;
   
   // Create a Global Instance for exceptions in set methods
   
   HouseException me = new HouseException();
   
   
   //House Default Constructor 
 
   House() throws HouseException{
      setMls(10001);
      setBedrooms(1);
      setPrice(1);
      setSeller("tg");
   }
  
  
   // House Constructor with Set Paramaters 
   
   House ( int mls, int bedrooms, double price, String seller) throws HouseException{
      setMls(mls);
      setBedrooms(bedrooms);
      setPrice(price);
      setSeller(seller);
   }
   
   // Custom formatting pattern for House Price
   DecimalFormat newPrice = new DecimalFormat("$#,###,##0.00");
   
   
   
   
   // toString method that returns the mls number, number of bedrooms, the house price, and the seller name 
   
   public String toString() {
      return "The house with the listing number " + mls + " has " + bedrooms + " bedrooms " + "priced at " + newPrice.format(price) + " and it is being sold by " + seller;
   }    
   

   
   // A set method for the listing number (mls) 
   
   public void setMls(int mls) throws HouseException{
         if ( (10001 <= mls) &&  (mls <= 99999) ){
            this.mls = mls;
         }
         else {
         me.setMessage("Listing number is invalid please enter a listing number between 10001 and 99999");
         throw me;
         }
   }
   
   // A set method for the amount of Bedrooms
   public void setBedrooms(int bedrooms) throws HouseException{
      if ( (0 < bedrooms) && ( bedrooms <= 5) ) {
         this.bedrooms = bedrooms;
      }
      else {
         me.setMessage("Number of bedrooms is invalid please enter the number of bedrooms between 0 and 5");
         throw me;
      }
   }
   
   // A set method for the Price of the house
   public void setPrice(double price) throws HouseException{
      if ( ( 0 < price) && ( price <= 1000000 ) ) {
         this.price = price;
      }
      else {
        me.setMessage("The price given is invalid please enter a price between $0 and $1,000,000");
        throw me;
      }
   }
   
   // A set method for the Name of the seller of the house
   public void setSeller(String seller) throws HouseException{
      String trimName = seller.trim();  // Trims extra white space before and after the name
      
      if ( 2 <= trimName.length() ) {
         this.seller = trimName;
      }
      else {
        me.setMessage("Invalid seller name please enter a name with atleast 2 characters long");
        throw me;
      }
   }
   
   // Get method that returns the listing number
   public int getMls() {
      return this.mls;
   }
   
   // Get method that returns the amount of Bedrooms
   public int getBedrooms() {
      return this.bedrooms;
   }
   
   // Get method that returns the price of the house
   public Double getPrice() {
      return this.price;
   }
   
   //get method that returns the Sellers name
   public String getSeller() {
      return this.seller;
   }
   

   
   
   
   
   
   
   
   
   

}
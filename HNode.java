


public class HNode{
  //instance variables
  private House h=null;
  private HNode next = null;
 
  public HNode(House h){
     this.setHouse(h);
     this.next = null;
      
  }
  

 
  public House getHouse( ){
     return this.h;
  }
     
  public HNode getNext( ){
     return this.next;
  }
 
  public void setHouse(House h2){
     this.h = h2;
  }   
 
  public void setNext(HNode n){
     this.next = n;
  }
 
  public String toString( ){
    return ("  " + this.h);
  }      
  

  


}
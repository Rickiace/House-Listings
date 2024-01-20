public class LinkedList {

   HNode head;
   
   public void add(House h) {
   
   
   HNode node = new HNode(h);
   node.h = h;
   node.next = null;
   
   
   if(head==null) {
      head = node;
   }
   else {
      HNode n = head;
      while (n.next!=null) {
         n = n.next;
      }
      n.next = node;
   }
   
   
   
   }
   
   public void remove(int mls ) {
      HNode node = head;
      
      while (node.next!=null) {
         
         if (mls == node.h.getmls()) {
         
         }
      
      }
   
   }














}
package listlistQuestion;

import java.io.Serial;

public class SearchingElemnt {
	
	private  static void searching(Node<Integer> head,int ele) {
		
		// TODO Auto-generated method stub
       Node<Integer>temp=head;
       while(temp!=null) {
    	   if(temp.data==ele) {
                  System.out.println("element is present in the list");
                  break;
                  }
    	   temp=temp.next;
    	   
    	   }
	

}
public static void main(String[] args) {
	Node<Integer> head=LinkedListOptimiseSSolution.takeInput();
	searching(head,20);
}
}

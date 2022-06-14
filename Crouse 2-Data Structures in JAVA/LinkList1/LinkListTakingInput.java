package listlistQuestion;
import java.util.Scanner;


public class LinkListTakingInput {
	public static Node<Integer> takingInput(){
		Node<Integer> head=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data !=-1) {
			// Node Creation 
			Node <Integer> newNode=new Node<>(data);
			if(head==null) {
				head=newNode;
			}
			else {
	          Node<Integer> temp=head;
	          while(temp.next != null) {
	        	  temp=temp.next;
	          }
	          temp.next=newNode;
			}
			data=s.nextInt();
			
			
		}
		
		
		
		
		return head; 
	}
	
	
	public static void main(String[] args) {
		
		
		Node<Integer> head=takingInput();
		LInkListUsePrintFunction.print(head);
	
  }
}

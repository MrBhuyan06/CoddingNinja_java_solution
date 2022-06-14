package listlistQuestion;

import java.util.Scanner;

public class LinkListDeleteNode {


	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		Node<Integer> temp=head;
		if(pos==0) {
			Node<Integer> firsthaed=head.next;
			return firsthaed;
		}
		else {
			int c=0;
			while(c<pos-1) {
				c++;
				temp=temp.next;
			}
			if(temp.next!=null) {
				temp.next=temp.next.next;
			}
		}
		return head;
		
	}
	
	  public static void main(String[] args) {
		
	
		   Node<Integer> head=LinkedListOptimiseSSolution.takeInput();
		   

		   head= deleteNode(head, 3);
		   LInkListUsePrintFunction.print(head);
		   
	}
	
}

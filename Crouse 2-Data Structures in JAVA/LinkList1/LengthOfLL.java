package listlistQuestion;

import java.util.Scanner;

public class LengthOfLL {
	public static int length(Node<Integer> head) {
		Node<Integer> n=head;
		
		int count=0;
		while(n != null) {
			count++;
			n=n.next;
			
		}
		
	   return count;	
	}
	
	
    
	
	public static void main(String[] args) {
		Node<Integer> head=LinkedListOptimiseSSolution.takeInput();
		int height=length(head);
		System.out.println("The height of the LL is "+height);
		
	}

}

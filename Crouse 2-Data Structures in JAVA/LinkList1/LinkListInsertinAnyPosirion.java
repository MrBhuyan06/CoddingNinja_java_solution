package listlistQuestion;

import java.util.Scanner;

public class LinkListInsertinAnyPosirion {
       
	  public static Node<Integer> insert(Node<Integer> head,int data,int pos){
		   // create a node
		   Node<Integer> newNode=new Node<Integer>(data);
		  // Travel to the postion -1 to build the connection
		   int i=0;
		   Node<Integer> temp=head;
		   // For position First
		   if(pos==0) {
			   newNode.next=head;
			   head=newNode;
			   return newNode;
		   }
		   
		   
		   
		   
		   while(i<pos-1) {
			   temp=temp.next;
			   i++;
		   }
		  // connectio establish
		   newNode.next=temp.next;
		   temp.next=newNode;
		   
		   
		   return head;
		   
	   }
	   
	   
	   
	   public static void main(String[] args) {
		
		   Node<Integer> head=LinkedListOptimiseSSolution.takeInput();
		   
		   head=insert(head,50,3);
		    LInkListUsePrintFunction.print(head);
		   
	}
	
	
}

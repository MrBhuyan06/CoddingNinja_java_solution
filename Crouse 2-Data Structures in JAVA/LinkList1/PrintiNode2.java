package listlistQuestion;







public class PrintiNode2 {
	

	 public static void printinode(Node<Integer>head,int i) {
	   	Node<Integer> temp=head;
	   	int c=0;
	   	while(c != i-1) {
	   		temp=temp.next;
	   		c++;
	   	}
	   	System.out.println(temp.next.data);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Node<Integer> head=LinkedListOptimiseSSolution.takeInput();
		printinode(head,3);
	}
	

}

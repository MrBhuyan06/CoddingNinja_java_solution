package listlistQuestion;

public class LinkListPrintData {
	public static void main(String[] args) {
		Node<Integer> node1=new Node<>(10);
		Node<Integer> node2=new Node<>(20);
		Node <Integer> node3=new Node<>(30);
	 node1.next=node2;
	 node2.next=node3;
	Node<Integer> head=node1;
	while(head.next!=null) {
		System.out.print(head.data+" ");
		head=head.next;
	}
	}

}

package listlistQuestion;
//node class creatio or the structure of the node
public class Node<T> {
	T data;
	Node<T> next;
	Node(T data){
		this.data=data;
		next=null;
	}

}

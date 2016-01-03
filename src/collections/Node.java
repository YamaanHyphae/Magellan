package collections;

/**
 * @author Yamaan
 * version 1.0
 * last updated: 1/1/16
 */

public class Node<T> {
	private T data;
	private Node<T> next;
	
	public Node(T data){
		this.data = data;
	}
	
	public T getData(){
		return data;
	}
	
	public void changeData(T data){
		this.data = data;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	public void setNext(Node<T> next){
		this.next = next;
	}
}

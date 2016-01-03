package collections;

/**
 * @author Yamaan 
 * version 1.0
 * last updated: 1/1/16
 */

public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	
	public LinkedList(){
		head.setNext(tail);
	}
	
	public LinkedList(Node<T> head){
		this.head = head;
		this.head.setNext(tail);
		this.size = 1;
	}
	
	public LinkedList(T data){
		Node<T> newHead = new Node<T>(data);
		this.head = newHead;
		this.head.setNext(tail);
	}
	
	public LinkedList(T[] array){
		
	}
	
	public void add(Node elem){
		
	}
}

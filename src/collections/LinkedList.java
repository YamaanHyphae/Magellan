package collections;

/**
 * @author Yamaan 
 * version 1.0
 * last updated: 1/2/16
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
		this.size = 1;
	}
	
	public LinkedList(T[] a){
		if (a.length == 0){
			head.setNext(tail);
		}
		else{
			int x = 0;
			Node<T> pNode = new Node<T>(null);
			while (x < a.length){
				pNode.changeData(a(x));
				x++;
			}
		}
	}
	
	public void addNode(Node<T> node){
		tail.setNext(node);
		tail = node;
		size++;
	}
	
	public void addElement(T element){
		Node<T> newNode = new Node<T>(element);
		tail.setNext(newNode);
		this.tail = newNode;
		size++;
	}
}

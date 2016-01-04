package collections;

/**
 * @author Yamaan 
 * version 1.0
 * last updated: 1/2/16
 */

public class LinkedList{
	
	private Node head;
	private Node tail;
	private int size = 0;
	
	public LinkedList(){
		this.tail = this.head;
	}
	
	public LinkedList(Node head){
		this.head = head;
		this.tail = this.head;
		this.size = 1;
	}
	
	public LinkedList(String data){
		this.head.setData(data);
		this.tail = this.head;
		this.size = 1;
	}
	
	public LinkedList(String[] a){
		if (a.length == 0){
			this.tail = this.head;
		}
		else{
			int x = 0;
			while (x < a.length){
				Node pNode = new Node(a[x]);
				if(head == null){
					head = pNode;
					size = 1;
				}
				else{
					tail.setNext(pNode);
					tail = pNode;
					size++;
				}
				x++;
			}
		}
	}
	
	public void addNode(Node node){
		if (head == null){
			head = node;
		}
		else{
			tail.setNext(node);
			tail = node;
		}
		size++;
	}
	
	public void addElement(String element){
		Node newNode = new Node(element);
		this.addNode(newNode);
	}
}

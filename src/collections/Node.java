package collections;

/**
 * @author Yamaan
 * version 1.1
 * last updated: 1/2/16
 */

public class Node {
	private String data;
	private Node next;
	
	public Node(String data){
		this.data = data;
	}
	
	public String getData(){
		return data;
	}
	
	public void setData(String data){
		this.data = data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
}

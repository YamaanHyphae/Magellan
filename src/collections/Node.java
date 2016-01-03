package collections;

/**
 * @author Yamaan
 * version 1.0
 * last updated: 1/1/16
 */

public class Node<T> {
	private T element;
	
	public Node(T element){
		this.element = element;
	}
	
	public T getData(){
		return element;
	}
	
	public void changeData(T elem){
		this.element = elem;
	}
}

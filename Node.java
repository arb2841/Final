public class Node {
	Customer customer;
	Node next;
	Node previous;
	
	Node(Customer customer, Node next, Node previous) {
		this.customer = customer;
		this.next = next;
		this.previous = previous;
	}
	
	Node(Customer customer) {
		this(customer, null, null);
	}
	
	private Node first;
	private Node last;
}

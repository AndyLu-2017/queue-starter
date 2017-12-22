/*
 * This is the class that implements the queue data structure.
 * You may decide what data structure to use to implement it.
 */
public class Queue implements QueueInterface {
	
	private Node head = null;
	
	// This method adds record to the tail of the queue.
	@Override
	public void enqueue(String record) {
		Node newNode = new Node();
		newNode.record = record;
		
		Node pointer = head;
		if(head != null) {
			while(pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = newNode;
		} else head = newNode;
	}

	/*
	 * This method removes the record at the head of the queue
	 * and returns its value.  return an empty string if the queue is empty.
	 */
	@Override
	public String dequeue() {
		if(head != null) {
			String rec = head.record;
			head = head.next;
			return rec;
		} else return "";
	}

	// This method prints the queue from head to tail.
	@Override
	public void printQueue() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println();
	}
}

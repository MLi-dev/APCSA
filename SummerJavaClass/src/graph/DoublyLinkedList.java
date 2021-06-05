package graph;

public class DoublyLinkedList {
	public Node headNode;
	public Node tailNode;
	public int size;

	public DoublyLinkedList() {
		this.headNode = null;
		this.tailNode = null;
	}

	public boolean isEmpty() {
		if (headNode == null && tailNode == null) {
			return true;
		} else {
			return false;
		}
	}

	public Node getHeadNode() {
		return headNode;
	}

	public Node getTailNode() {
		return tailNode;
	}

	public int getSize() {
		return size;
	}

	public void insertAtHead(Node newNode) {
		newNode.nextNode = this.headNode;
		newNode.prevNode = null;
		if (headNode != null) {
			headNode.prevNode = newNode;
		} else {
			tailNode = newNode;
			this.headNode = newNode;
		}
		size++;
	}

	public void insertAtEnd(Node newNode) {
		if (isEmpty()) {
			insertAtHead(newNode);
			return;
		}
		newNode.nextNode = null;
		newNode.prevNode = tailNode;
		tailNode.nextNode = newNode;
		tailNode = newNode;
		size++;
	}

}

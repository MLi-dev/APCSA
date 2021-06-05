package graph;

import java.util.ArrayList;

public class Graph {
	DoublyLinkedList adjacencyList[];
	ArrayList<Node> nodeList = new ArrayList<Node>();
	int vertices;

	public Graph(int vertices) {
		this.vertices = vertices;
		adjacencyList = new DoublyLinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjacencyList[i] = new DoublyLinkedList();
		}

	}

	public void addNode(int data) {
		Node newNode = new Node();
		newNode.data = data;
		nodeList.add(newNode);
	}

	public Node[] getNodes() {
		Node[] nodes = new Node[nodeList.size()];
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = nodeList.get(i);
		}
		return nodes;

	}

	public DoublyLinkedList[] getEdges() {
		return adjacencyList;
	}

	public void addEdge(Node source, Node destination) {
		if (source.data < vertices && vertices > destination.data) {
			this.adjacencyList[source.data].insertAtEnd(destination);
		}

	}

	public void aPath(Node n1, Node n2) {
		// First assume that source is n1, looking if it connects to n2.
		DoublyLinkedList n1List = adjacencyList[n1.data];
		Node currentNode = n1List.headNode;
		while (currentNode != null) {
			if (currentNode.data == n2.data) {
				System.out.println(n1.data + " -> " + n2.data);
				return;
			}
			currentNode = currentNode.nextNode;
		}
		// First assume that source is n1, looking if it connects to n2.
		DoublyLinkedList n2List = adjacencyList[n2.data];
		Node n2Node = n2List.headNode;
		while (n2Node != null) {
			if (n2Node.data == n2.data) {
				System.out.println(n2.data + " -> " + n1.data);
				return;
			}
			n2 = n2.nextNode;
		}
		System.out.println("Error, no existing path between " + n1.data + " and " + n2.data);

	}

}

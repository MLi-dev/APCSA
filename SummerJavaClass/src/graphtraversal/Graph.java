package graphtraversal;

public class Graph {
	DoublyLinkedList<?> adjacencyList[]; // An array of linked lists to store adjacent vertices.
	public int vertices;

	@SuppressWarnings("unchecked")
	public Graph(int vertices) {
		this.vertices = vertices;
		this.adjacencyList = new DoublyLinkedList[vertices];

		for (int i = 0; i < vertices; i++) {
			adjacencyList[i] = new DoublyLinkedList<>();
		}
	}

	public void addEdge(int source, int destination) {
		if (source < vertices && destination < vertices) {
			this.adjacencyList[source].insertAtEnd(destination);

			// for undirected graph uncomment the line below
			// this.adjacencyList[destination].insertAtEnd(source);
		}
	}

	public void printGraph() {
		System.out.println(">>Adjacency List of Directed Graph<<");
		for (int i = 0; i < vertices; i++) {
			if (adjacencyList[i] != null) {
				System.out.print("|" + i + "| => ");

				DoublyLinkedList<Integer>.Node temp = (DoublyLinkedList<Integer>.Node) adjacencyList[i].getHeadNode();
				while (temp != null) {
					System.out.print("[" + temp.data + "] -> ");
					temp = temp.nextNode;
				}
				System.out.println("null");
			} else {

				System.out.println("|" + i + "| => " + "null");
			}
		}
	}
}

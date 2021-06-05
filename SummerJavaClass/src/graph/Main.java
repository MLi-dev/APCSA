package graph;

public class Main {

	public static void printGraph(DoublyLinkedList[] adjacencyList, int vertices) {
		System.out.println(">>>Adjacency List of Directed Graph<<");
		for (int i = 0; i < vertices; i++) {
			if (adjacencyList[i] != null) {
				System.out.print("|" + i + "| => ");
				Node temp = adjacencyList[i].getHeadNode();
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

	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addNode(0);
		g.addNode(1);
		g.addNode(2);
		g.addNode(3);
		Node[] nodes = g.getNodes();
		g.addEdge(nodes[0], nodes[1]);
		g.addEdge(nodes[0], nodes[2]);
		g.addEdge(nodes[1], nodes[3]);
		g.addEdge(nodes[2], nodes[3]);
		printGraph(g.getEdges(), 4);
		g.aPath(nodes[0], nodes[3]);
		g.aPath(nodes[1], nodes[3]);
		g.aPath(nodes[2], nodes[3]);

//		Node destination2 = new Node();
//		destination2.data = 2;
//		g.addEdge(source, destination2);
//		g.printGraph();

	}

}

package graphtraversal;

class CheckBFS {

	// Breadth First Traversal of Graph g
	public static String bfs(Graph g) {
		String result = "";

		if (g.vertices< 1) {
			return result;
		}

		boolean[] visited = new boolean[g.vertices];
		for (int i = 0; i < g.vertices; i++) {
			if (!visited[i]) {
				result = result + bfsVisit(g, i, visited);
			}
		}

		return result;
	}
	public static String dfs(Graph g) {
		String result = "";
		if (g.vertices < 1) {
			return result;
		}
		boolean[] visited = new boolean[g.vertices];
		for (int i = 0; i < g.vertices; i++) {
			if (!visited[i]) {
				result = result + dfsVisit(g, i, visited);
			}
		}
		return result;
	}

	private static String dfsVisit(Graph g, int source, boolean[] visited) {
		Stack<Integer> stack = new Stack<Integer>(g.vertices);
		stack.push(source);
		visited[source] = true;
		String result = "";
		while(!stack.isEmpty()){
			int currentNode = stack.pop();
			result += String.valueOf(currentNode);
			DoublyLinkedList<Integer>.Node temp = null;
			if(g.adjacencyList[currentNode] != null){
				temp = (DoublyLinkedList<Integer>.Node) g.adjacencyList[currentNode].headNode;
				while(temp != null){
					if(!visited[temp.data]){
						visited[temp.data] = true;
						stack.push(temp.data);
					}
					temp = temp.nextNode;
				}
			}
		}
	   return result;
	}

	public static String bfsVisit(Graph g, int source, boolean[] visited) {
		Queue<Integer> queue = new Queue<Integer>(g.vertices);
		queue.enqueue(source);
		visited[source] = true;
		String result = "";
		while (!queue.isEmpty()) {
			int currentNode = queue.dequeue();
			result += String.valueOf(currentNode);
			DoublyLinkedList<Integer>.Node temp = null;
			if (g.adjacencyList[currentNode] != null) {
				temp = (DoublyLinkedList<Integer>.Node) g.adjacencyList[currentNode].headNode;
				while (temp != null) {
					if (!visited[temp.data]) {
						visited[temp.data] = true;
						queue.enqueue(temp.data);
					}
					temp = temp.nextNode;
				}
			}
		}
		return result;
	}
	public static void main(String[] args){
	Graph g = new Graph(9);
	g.addEdge(0,1);
	g.addEdge(0,2);
	g.addEdge(0,3);
	g.addEdge(1,4);
	g.addEdge(1,5);
	g.addEdge(2,8);
	g.addEdge(4,6);
	g.addEdge(4,7);
	g.printGraph();
	System.out.println(CheckBFS.dfs(g));
	}

}
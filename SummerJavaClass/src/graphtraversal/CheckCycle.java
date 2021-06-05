package graphtraversal;

public class CheckCycle {
    public static boolean detectCycle(Graph g) {
        if(g.vertices < 1){
            return false;
        }
        for(int i = 0; i<g.vertices; i++){
            if(hasCycle(g, i)) {
                return true;
            }
        }
        return false;
    }
    public static boolean hasCycle(Graph g, int source){
        DoublyLinkedList<Integer>.Node temp = null;
        if(!g.adjacencyList[source].isEmpty()) {
            temp = (DoublyLinkedList<Integer>.Node) g.adjacencyList[source].headNode;
        }
        DoublyLinkedList<Integer>.Node fast = temp;
        DoublyLinkedList<Integer>.Node slow = temp;
        while(fast != null && fast.nextNode != null && slow!= null){
            fast = fast.nextNode.nextNode;
            slow = slow.nextNode;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,1);
        g.printGraph();
        System.out.println(detectCycle(g));
    }
}

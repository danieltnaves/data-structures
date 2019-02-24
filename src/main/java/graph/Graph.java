package graph;

import java.util.LinkedList;

public class Graph {

    private int vertices;

    private LinkedList<Integer> adjacencies[];

    Graph(int vertices) {
        this.vertices = vertices;
        adjacencies = new LinkedList[vertices];
        for (int i = 0; i < adjacencies.length; i++)
            adjacencies[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
        adjacencies[v].add(w);
    }

    public void BFS(int vertex) {

        boolean viseted[] = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();
        viseted[vertex] = true; //mark current vertex as visited and enqueue it
        System.out.println(String.format("Starting at %s", vertex));
        queue.add(vertex);

        while (!queue.isEmpty()) {
            vertex = queue.poll();
            System.out.println(String.format("De-queueing %s", vertex));
            for (Integer adjacency : adjacencies[vertex]) {
                if (!viseted[adjacency]) {
                    viseted[adjacency] = true;
                    System.out.println(String.format("Queueing %s", adjacency));
                    queue.add(adjacency);
                }
            }
        }

    }

}

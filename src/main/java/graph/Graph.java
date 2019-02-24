package graph;

import java.util.LinkedList;
import java.util.Stack;

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

    public void DFS(int vertex) {

        boolean viseted[] = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        viseted[vertex] = true; //mark current vertex as visited and stack it
        System.out.println(String.format("Starting at %s", vertex));
        stack.add(vertex);

        while (!stack.isEmpty()) {
            vertex = stack.pop();
            System.out.println(String.format("Poping %s", vertex));
            for (Integer adjacency : adjacencies[vertex]) {
                if (!viseted[adjacency]) {
                    stack.add(adjacency);
                    viseted[adjacency] = true;
                    System.out.println(String.format("Pushing %s", adjacency));
                }
            }
        }

    }
}

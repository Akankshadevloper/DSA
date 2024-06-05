package GRAPH;
import java.util.*;

//DFS

public class AllPaths {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[0].add(new Edge(1, 0));
        graph[0].add(new Edge(1, 3));

        graph[0].add(new Edge(2, 0));
        graph[0].add(new Edge(2, 4));

        graph[0].add(new Edge(3, 1));
        graph[0].add(new Edge(3, 4));
        graph[0].add(new Edge(3, 5));

        graph[0].add(new Edge(4, 2));
        graph[0].add(new Edge(4, 3));
        graph[0].add(new Edge(4, 5));

        graph[0].add(new Edge(5, 3));
        graph[0].add(new Edge(5, 4));
        graph[0].add(new Edge(5, 6));


        graph[0].add(new Edge(6, 5));


    }

    public static void bfs(ArrayList<Edge> graph[], int V , boolean vis[] , int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(0); //Source = 0

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]== false) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.println(curr+ " ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(vis[e.dest] == false)
                dfs(graph, e.dest, vis);
        }
    }


    //O(V*V)
    public static void printAllPath(ArrayList<Edge> graph[], boolean vis[] ,int curr, String path, int tar) {
        if (curr == tar) {
            System.out.println(path);
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[e.dest] = true;
                printAllPath(graph, vis, e.dest,path+e.dest , tar);
                vis[e.dest] = false;
            }
        }
    }

    public static void main(String args[]) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        int src = 0 , tar = 5;

        boolean vis[] = new boolean[V];
        vis[src] = true;
        printAllPath(graph, new boolean[V],src, "0",tar);
    }
}
import java.util.*;

public class Bellman {

    static class Graph {
        private int V;
        int[][] matrix;
        LinkedList<Integer>[] adj;

        Graph(int V)
        {
            this.V = V;
            adj = new LinkedList[V];
            matrix = new int[V][V];

            for(int i = 0; i < adj.length; i++)
            {
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int s, int e, int w)
        {
            adj[s].add(e);
            matrix[s][e] = w;
        }

        void BellmanFord(int start)
        {
            int[] distance = new int[V];                              // The distance from the start to all points
            int[] prev = new int[V];                                  // Keeping trace of the path
            prev[0] = 0;

            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[start] = 0;
            
            for(int j = 0; j < adj.length - 1; j++) {
                for(int point = 0; point < adj.length; point++) {
                    for (int i = 0; i < adj[point].size(); i++) {
                        int l = adj[point].get(i);
                        int x = distance[point] + matrix[point][l];
                        if (x < distance[l]) {
                            prev[l] = point;
                            distance[l] = x;
                        }
                    }
                }
            }

            for(int j = 0; j < adj.length - 1; j++) {
                for(int point = 0; point < adj.length; point++) {
                    for (int i = 0; i < adj[point].size(); i++) {

                        int l = adj[point].get(i);
                        int x = distance[point] + matrix[point][l];
                        if (distance[point] == Integer.MIN_VALUE || x < distance[l]) {
                            prev[l] = point;
                            distance[l] = Integer.MIN_VALUE;
                        }
                    }
                }
            }

            // Printing
            for(int i = 0;i < distance.length; i++)
                System.out.println(distance[i]+ "\t" + prev[i]);

        }

    }

    public static void main(String[] args)
    {
        Graph g = new Graph(10);

        g.addEdge(0, 1, 5);
        g.addEdge(1, 2, 20);
        g.addEdge(1, 5, 30);
        g.addEdge(1, 6, 60);
        g.addEdge(2, 4, 75);
        g.addEdge(2, 3, 10);
        g.addEdge(3, 2, -15);
        g.addEdge(4, 9, 100);
        g.addEdge(5, 6, 5);
        g.addEdge(5, 8, 50);
        g.addEdge(6, 7, -50);
        g.addEdge(7, 8, -10);

        System.out.println("The MIN-DISTANCE graph is as follows: \n");
        g.BellmanFord(0);
    }
    
}

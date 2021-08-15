import java.util.*;

public class Dijkstra {

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
            adj[e].add(s);
            matrix[s][e] = matrix[e][s] = w;
        }

        void DijkstrasAlgorithm(int start)
        {
            int[] distance = new int[V];                              // The distance from the start to all points
            int[] visited = new int[V];                               // The nodes which are visited
            int[] prev = new int[V];                                  // Keeping trace of the path
            prev[0] = 0;

            Arrays.fill(visited, 0);
            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[start] = 0;
            
            for(int j = 0; j < adj.length - 1; j++)
            {
                int min = Integer.MAX_VALUE;                            // To get the min distance from start int all given points
                int point = start;                                      // To record the point

                for(int i = 0; i < adj.length; i++)                     // Calculating the min point
                {
                    if(distance[i] < min && visited[i] != 1) {
                        min = distance[i];
                        point = i;
                    }
                }
                visited[point]  = 1;

                // calculating if the current distance is lower than the new distance and replacing accordingly
                for(int i = 0; i < adj[point].size(); i++)
                {
                    int l = adj[point].get(i);
                    if(visited[l] == 1)
                        continue;

                    int x = distance[point] + matrix[point][l];

                    if(x < distance[l]) {
                        prev[l] = point;
                        distance[l] = x;
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
        Graph g = new Graph(5);

        g.addEdge(0, 1, 6);
        g.addEdge(0, 3, 1);
        g.addEdge(3, 1, 2);
        g.addEdge(3, 4, 1);
        g.addEdge(4, 1, 2);
        g.addEdge(4, 2, 5);
        g.addEdge(1, 2, 5);

        System.out.println("The MIN-DISTANCE graph is as follows: \n");
        g.DijkstrasAlgorithm(0);
    }
    
}

import java.util.*;

public class DFS {
    static class Graph {
        private int V;
        LinkedList<Integer>[] adj;

        Graph(int V)
        {
            this.V = V;
            adj = new LinkedList[V];
            for(int i = 0; i < adj.length; i++)
            {
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int s, int e)
        {
            adj[s].add(e);
        }

        void DFS(int start)
        {
            Stack<Integer> s = new Stack<>();
            s.push(start);
            int visited[] = new int[V+1];
            Arrays.fill(visited, 0);

            visited[start] = 1;

            while(!s.empty())
            {
                int x = s.pop();
                System.out.println(x);
                for(int i = 0; i < adj[x].size(); i++)
                {
                    int temp = adj[x].get(i);
                    if(visited[temp] != 1)
                    {
                        s.push(temp);
                        visited[temp] = 1;
                    }
                }
            }
        }

    }

    public static void main(String[] args)
    {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 4);
        g.addEdge(4, 3);

        System.out.println("The DFS graph is as follows: \n");
        g.DFS(0);
    }
    
}

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        
    }
    
    public ArrayList<Integer> BfsGraph(int v,ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean visit[] = new boolean[v];
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(0);
        visit[0] = true;
        
        while(!queue.isEmpty()){
            Integer  node = queue.poll();
            bfs.add(node);
        
            for(Integer i : adj.get(node)){
                if(!visit[i]){
                    visit[i] = true;
                    queue.add(0);
                }
            }
        }
        return bfs;
    }
}

public static void topSortUtil(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s){
       vis[curr]=true;
       for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSortUtil(graph,e.dest,vis,s);
            }
       }
       s.push(curr);
    }

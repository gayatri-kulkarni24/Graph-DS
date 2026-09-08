public static void DFS(ArrayList<Edge> [] graph,int curr,boolean vis[]){
        System.out.print(curr +" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                DFS(graph,e.dest,vis);
            }
        }
    }

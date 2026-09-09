public static void DFSUtil(ArrayList<Edge> [] graph,int curr,boolean vis[]){
        System.out.print(curr +" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                DFSUtil(graph,e.dest,vis);
            }
        }
    }
    public static void DFS(ArrayList<Edge> [] graph){
         boolean vis[]=new boolean[graph.length];
         for (int i=0;i<graph.length;i++){
            DFSUtil(graph,i,vis);
        }
    }

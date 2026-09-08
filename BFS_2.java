    public static void BFSUtil(ArrayList<Edge> [] graph,boolean vis[]){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr +" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void BFS(ArrayList<Edge> [] graph){
        boolean vis[]=new boolean[graph.length];
        for (int i=0;i<graph.length;i++){
            if(!vis[i]){
                BFSUtil(graph,vis);
            }
        }
    }

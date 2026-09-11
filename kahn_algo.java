public static void kahn_algo(ArrayList<Edge> graph[]){
        int indg[]=new int[graph.length];
        calcIndegree(graph,indg);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indg.length;i++){
            if(indg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr +" ");
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indg[e.dest]--;
                if(indg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

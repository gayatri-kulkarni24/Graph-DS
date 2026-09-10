    public static void calcIndegree(ArrayList<Edge> graph[],int indg[]){
       for(int i=0;i<graph.length;i++){
            int v=i;
        for(int j=0;j<graph[v].size();j++){
           Edge e=graph[v].get(j);
           indg[e.dest]++;
        }
       }
    }

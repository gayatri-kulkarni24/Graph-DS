public static boolean isBiparite(ArrayList<Edge> graph[]){
        int color[]=new int[graph.length];
        for(int i=0;i<color.length;i++){
            color[i]=-1;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                q.add(i);
                color[i]=0; //yellow
            while(!q.isEmpty()){
                int curr=q.remove();
                for(int j=0;j<graph[curr].size();j++){
                    Edge e=graph[curr].get(j);
                    if(color[e.dest]==-1){
                        int nextColor=color[curr]==0 ? 1 : 0;
                        color[e.dest]=nextColor;
                        q.add(e.dest);
                    }else if(color[curr]==color[e.dest]){
                        return false;
                    }

                }
            }
            }
        }
        return true;
    }

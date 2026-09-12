static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v,int c){
            this.v=v;
            this.cost=c;
        }
        @Override
        public int compareTo(Pair p2){
           return this.cost-p2.cost;
        }
    }

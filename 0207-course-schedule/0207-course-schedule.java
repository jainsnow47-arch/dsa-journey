class Solution {
    public boolean dfs(int s, int[] state, ArrayList<ArrayList<Integer>> adj){
        state[s] = 1;
        for(Integer i:adj.get(s)){
            if(state[i] == 0){
                if(dfs(i,state,adj)==true){
                    return true;
                }
            }
            else if(state[i]==1){
                return true;
            }
        }
        state[s]=2;
        return false;

    }
    public boolean canFinish(int n, int[][] p) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<p.length;i++){
            int u = p[i][1];
            int v = p[i][0];
            adj.get(u).add(v);
        }
        // boolean visited[] = new boolean[n];
        int state[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(state[i]==0){
                if(dfs(i,state,adj)==true)
                return false;
            }
        }
        return true;
    }
}
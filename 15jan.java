class Solution {
    public int max_courses(int n, int total, int[] cost) {
        Integer[][] dp=new Integer[n][total+1];
     return chec(cost,0 ,total,dp);
    }
    static int chec(int[] cost, int ind, int total, Integer[][] dp)
    {
        if(cost.length == ind)
        return 0;
        if(dp[ind][total]!=null)
        {
            return dp[ind][total];
        }
        if(total>=cost[ind])
        {
            int price = cost[ind]-((9*cost[ind])/10);
            return dp[ind][total]= Math.max(1+chec(cost,ind+1, total-price,dp), chec(cost,ind+1,total,dp));
            
        } 
        return dp[ind][total]=chec(cost,ind+1,total,dp);
    }
}

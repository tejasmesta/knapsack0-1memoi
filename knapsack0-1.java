class Solution 
{ 
      
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        int dp[][] = new int[n+1][W+1];
        return function(wt,val,W,n,dp);
    } 
    
    static int function(int wt[],int val[],int w,int n,int dp[][])
    {
        if(n==0	|| w==0)
        {
            return 0;
        }
        
        if(dp[n][w]>0)
        {
            return dp[n][w]; 
        }
        
        if(wt[n-1]<=w)
        {
            return dp[n][w] = Math.max(val[n-1]+function(wt,val,w-wt[n-1],n-1,dp),function(wt,val,w,n-1,dp));
        }
        
        return dp[n][w] = function(wt,val,w,n-1,dp);

    }
}


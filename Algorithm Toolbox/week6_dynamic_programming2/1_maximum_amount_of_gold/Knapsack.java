import java.util.*;

public class Knapsack {
    static int optimalWeight(int W, Integer[] w,int n)
    {
    	Arrays.sort(w, Collections.reverseOrder());
    	//System.out.println("jjdf"+Arrays.toString(w));
    	int[][] res = new int[n+1][W+1];
    	for(int i=0;i<W;i++)
    	{
    		res[0][i]=0;
    	}
    	for(int i=0;i<n;i++)
    	{
    		res[i][0]=0;
    	}
    	for(int i=1;i<n+1;i++)
    	{
    		for(int j=1;j<W+1;j++)
    		{
    			if(w[i-1]>j)
    				res[i][j]=res[i-1][j];
    			if(w[i-1]==j) 
    				res[i][j]=Math.max(res[i-1][j],w[i-1]);
    			if(w[i-1]<j)
    				res[i][j]=Math.max(res[i-1][j],w[i-1]+res[i-1][j-w[i-1]]);
    				
    		}
    	}
    return res[n][W];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W, n;
        W = scanner.nextInt();
        n = scanner.nextInt();
        Integer[] w = new Integer[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        System.out.println(optimalWeight(W, w,n));
    }
}


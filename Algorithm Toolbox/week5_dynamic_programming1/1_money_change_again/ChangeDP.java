import java.util.Scanner;

public class ChangeDP {
    private static int getChange(int m) {
        int[] coins= {1,3,4};
        int[][] a=new int[coins.length][m+1];
        
        for(int i=0;i<=m;i++)
        {
        	a[0][i]=i;
        }
        for(int i=1;i<coins.length;i++)
        {
        	a[i][0]=0;
        	for(int j=1;j<=m;j++)
        	{
        		if(coins[i]>j)
        			a[i][j]=a[i-1][j];
        		else
        		    a[i][j]=Math.min(a[i-1][j],1+a[i][j-coins[i]]);
        	}
        }
        return a[coins.length-1][m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}


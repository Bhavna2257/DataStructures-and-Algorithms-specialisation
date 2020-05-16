import java.util.*;

public class LCS2 {

    private static int lcs2(int[] A, int[] B) {
    	int[][] D=new int[A.length][B.length];
  	  for(int i=1;i<A.length;i++)
  	    {
  	    	D[i][0]=0;
  	    }
  	  for(int j=1;j<B.length;j++)
  	    {
  	    	D[0][j]=0;
  	    }
  	for(int j=1;j<B.length;j++)
	  {
		  for(int i=1;i<A.length;i++)
		  {
			  int insert=D[i][j-1];
			  int del=D[i-1][j];
			  int match=D[i-1][j-1]+1;
			  int mismatch=D[i-1][j-1]; 
			 if(A[i]==B[j])
				  D[i][j]=Math.max(insert,Math.max(del, match));
			 else
				  D[i][j]=Math.max(insert,Math.max(del, mismatch));
				  
		  }
	  }
        return D[A.length-1][B.length-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m+1];
        for (int i = 1; i < m+1; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b));
    }
}


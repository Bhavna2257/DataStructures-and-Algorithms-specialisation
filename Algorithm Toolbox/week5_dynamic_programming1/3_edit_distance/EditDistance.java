import java.util.*;

class EditDistance {
  public static int EditDistance(int[] A, int[] B) 
  {
	  int[][] D=new int[A.length][B.length];
	  for(int i=1;i<A.length;i++)
	    {
	    	D[i][0]=i;
	    }
	  for(int j=1;j<B.length;j++)
	    {
	    	D[0][j]=j;
	    }
	  for(int j=1;j<B.length;j++)
	  {
		  for(int i=1;i<A.length;i++)
		  {
			  int insert=D[i][j-1]+1;
			  int del=D[i-1][j]+1;
			  int match=D[i-1][j-1];
			  int mismatch=D[i-1][j-1]+1;
			  if(A[i]==B[j])
				  D[i][j]=Math.min(insert,Math.min(del, match));
			  else
				  D[i][j]=Math.min(insert,Math.min(del, mismatch));
				  
		  }
	  }
    
    return D[A.length-1][B.length-1];
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    String s = scan.next();
    String t = scan.next();
    int[] A=new int[s.length()+1];
    int[] B=new int[t.length()+1];
    for(int i=1;i<s.length()+1;i++)
    {
    	A[i]=s.charAt(i-1);
    	
    	}
    for(int i=1;i<t.length()+1;i++)
    {
    	B[i]=t.charAt(i-1);
    	
    	}

    System.out.println(EditDistance(A, B));
  }

}

import java.util.ArrayList;
import java.util.Scanner;

public class PlacingParentheses {
    private static long getMaximValue(String exp,int n,ArrayList<Integer> d,StringBuilder op) {
    long[][] m=new long[d.size()][d.size()];
    long[][] M=new long[d.size()][d.size()];
     for(int i=0;i<d.size();i++)
     {
    	m[i][i]=d.get(i);
    	M[i][i]=d.get(i);
      }
     for(int s=1;s<=d.size()-1;s++)
     {
    	for(int i=0;i<=d.size()-1-s;i++)
    	 {
    	     int j=i+s;
    	     long max=-2147483648;
    	 	long min=2147483647;
    	     for(int k=i;k<=j-1;k++)
    	     {
    		 long a=eval(M[i][k],M[k+1][j],op.charAt(k));
    		 long b=eval(M[i][k],m[k+1][j],op.charAt(k));
    		 long c=eval(m[i][k],M[k+1][j],op.charAt(k));
    		 long e= eval(m[i][k],m[k+1][j],op.charAt(k));
    		min=Math.min(min,Math.min(a,Math.min(b,Math.min(c,e))));
    		max=Math.max(max,Math.max(a,Math.max(b,Math.max(c,e))));
    	     }
    	     m[i][j]=min;
    	    M[i][j]=max;
     }
     }
return M[0][d.size()-1];
    }
static long eval(long a, long b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            assert false;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.next();
        int n=exp.length();
        ArrayList<Integer> d= new ArrayList<>();
        StringBuilder op= new StringBuilder();
        for(int i=0;i<n;i=i+2)
        {
        	d.add(Integer.parseInt(String.valueOf(exp.charAt(i))));
        	//op.add(Integer.parseInt(String.valueOf(exp.charAt((2*i)+1))));
        }
        for(int i=1;i<n;i=i+2)
        {
        	op.append(exp.charAt(i));
        }
        
        //System.out.println("digits"+d);
        //System.out.println("operators"+op);
        System.out.println(getMaximValue(exp,n,d,op));
    }
}


import java.util.*;
import java.io.*;

public class MajorityElement{
	private static int getMajorityElement(int[] a,int left, int right) {
		Arrays.sort(a);
		//System.out.printf("Modified arr[] : %s",Arrays.toString(a));
        int m=(left+right)/2;
        //System.out.println("m:"+m);
      //  System.out.println("value of m:"+m);
       // int B[]=new int[m];
       // int C[]=new int[a.length-m];
        if((a.length%2)==0)
        {
        	//System.out.println("entered");
        for(int i=0;i<m;i++)
        {
        	if(a[i]==a[i+m])
        		return 1;
        	else
        		continue;
        }
        }
        else
        	for(int i=0;i<=m;i++)
            {
            	if(a[i]==a[i+m])
            		return 1;
            	else
            		continue;
            }
        	
        /*for(int i=0;i<m;i++)
        {
        	B[i]=a[i];
        	//System.out.println("value of b array"+B[i]);
        }
        for(int j=0,i=m;j<(a.length-m);j++,i++)
        {
        	
        	C[j]=a[i];
        	//System.out.println("value of c array"+C[j]);
        }
        int count=0;
        if(B[0]==B[m-1])
        	count=m;
        if(B[0]==C[0])
        	count++;
        if(count>(a.length/2))
        	return 1;
        
       // System.out.printf("Modified arr[] : %s",Arrays.toString(B));
        
       // System.out.printf("Modified arr[] : %s",Arrays.toString(C));*/
     
        
   return -1;  
        
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}





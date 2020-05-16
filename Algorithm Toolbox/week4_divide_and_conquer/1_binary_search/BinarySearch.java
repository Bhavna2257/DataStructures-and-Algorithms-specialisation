import java.io.*;
import java.util.*;

public class BinarySearch {

    static int binarySearch(int[] a,int f,int l, int x) {
        int left = f, right = l;
        int mid=(f+l)/2;
        if(left>right)
        	return -1;
        if(a[mid]==x)
        	return mid;
       
        if (x>a[mid]) {
        
        		left=mid+1;
        return binarySearch(a,left,right,x);}
        
        if(x<a[mid]) 
        
            		right=mid-1;
            return binarySearch(a,left,right,x);
           
     
            
        
        
    }

   
    

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
          b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(a,0,n-1, b[i]) + " ");
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
                } catch (IOException e) {
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

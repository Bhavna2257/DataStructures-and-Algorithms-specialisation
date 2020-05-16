import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
    	int minrefil=0;
    	int previous=0;
    	stops = Arrays.copyOf(stops, stops.length + 1);
        stops[stops.length - 1] = dist;

    	for(int i=0;i<stops.length;i++)
    	{
    		
    		if(stops[i]==dist)
    			break;
    		if((stops[i+1]-stops[i])>tank)
    			return -1;
            if((stops[i]-previous)<=tank&&(stops[i+1]-previous)<=tank)
    			continue;
    		else
    			minrefil=minrefil+1;
            	previous=stops[i];
    }
    	return minrefil;
    }
 public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }
        
        
        System.out.println(computeMinRefills(dist, tank, stops));
    }
}

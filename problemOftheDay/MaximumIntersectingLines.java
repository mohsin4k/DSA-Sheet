package problemOftheDay;
import java.util.*;
public class MaximumIntersectingLines {
	 public int maxIntersections(int[][] lines, int N) {
	        Map<Integer,Integer>hm = new TreeMap<>();
	        for(int x[]:lines)
	        {
	            hm.put(x[0],hm.getOrDefault(x[0],0)+1);
	            hm.put(x[1]+1,hm.getOrDefault(x[1]+1,0)-1);
	        }
	            
	        int temp=Integer.MIN_VALUE;
	        int sum=0;
	        for(int i:hm.keySet())
	        {
	            sum += hm.get(i);
	            temp = Math.max(temp,sum);
	        }
	        return temp;
	    }
}

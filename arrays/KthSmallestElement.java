package arrays;

public class KthSmallestElement {
	
	 public static int kthSmallest(int[] arr, int l, int r, int k) 
	    { 
	         int map[] = new int[100001];

	        for(int i : arr) map[i] = i;
	        
	        int count = 0;
	        for(int i : map) {
	            if(i>0) {
	                count++;
	            }
	            if(count == k) return i;
	        }
	        return -1;
	    } 

}

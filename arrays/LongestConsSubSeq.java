package arrays;

public class LongestConsSubSeq {

	static int findLongestConseqSubseq(int a[], int n){
		   int max =0; 
		   
		   for(int e : a){
		       max = Math.max(max, e);
		   }
		   
		   int[] temp = new int[max+1]; // to store all element in my original array 
		   
		   for(int i=0; i<n; i++){
		       temp[a[i]] =  1; 
		   }
		   
		   int count =0, ans =0; 
		   
		   for(int i=0; i<temp.length; i++){
		       if(temp[i] == 1){
		           count++; 
		       }else{
		           count = 0; 
		       }
		       
		       ans = Math.max(ans, count);
		   }
		   return ans; 
		}
}

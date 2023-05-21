package sorting;

public class HeapSort {

	public static void main(String[] args) {
		
		int[] a = {77,6,8,1,10,2};
		
		for(int i=(a.length-1)/2; i>=0; i--) {
			heapify(a, i, a.length); 
		}
		for(int i=a.length-1; i>=0; i--) {
			swap(a,i,0);
			heapify(a, 0, i);
		}
		
		print(a);
	}
	

	
	public static void heapify(int[] a, int ind, int n) {
		int c1 = ind*2+1; 
		int c2 = ind*2+2; 
		int largest = ind; 
		
		if(c1<n && a[c1] > a[largest]) {
			largest = c1; 
		}
		if(c2<n && a[c2] > a[largest]) {
			largest = c2; 
		}
		
		if(largest!=ind) {
			swap(a,ind,largest);
			heapify(a, largest, n);
		}
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j]; 
		a[j] = temp;
	}
	
	public static void print(int[] a) {
		for(int e : a) {
			System.out.print(e+" ");
		}
		System.out.println();
	}

}

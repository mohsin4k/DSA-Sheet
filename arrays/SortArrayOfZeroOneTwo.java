package arrays;

public class SortArrayOfZeroOneTwo {

	 public void SortArray(int[] a) {
	        int n = a.length;
	    int l=0, r=n-1, mid=l;
			while(mid<=r) {
				if(a[mid]==0) {
					swap(a,l,mid);
					l++;
					mid++;
				}else if(a[mid]==2) {
					swap(a,r,mid);
					r--;
				}else {
					mid++;
				}
			}
		}
		public static void swap(int[] a, int i, int j) {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
		}
}

package trie;

// Program to tell how many unique substring are there in a particular string. 

// ex: s ="abab"
//total sub string = a ab aba abab b ba bab a ab b == 9
// unique from all the substring: A AB ABA ABAB B BA BAB == 7 ans one "" empty string too so total 8


public class NumberOfUniqueSubString {
	
	static Trie trie = new Trie(); 

	public static void main(String[] args) {
		
		String s = ""; 
		System.out.println(findUnoqueSubstring(s));
	}
	
	public static int findUnoqueSubstring(String s) {
		int n=s.length();
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				trie.insert(s.substring(i, j+1));
			}
		}
		return trie.No_OF_UNIQUE_SUBSTRING+1; 
	}

}

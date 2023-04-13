package trie;

public class Trie {
	node root; 
	int No_OF_UNIQUE_SUBSTRING; // this variable is just kept to count the number of unique substring while inserting the string in trie node
	public Trie() {
		root = new node(); 
		No_OF_UNIQUE_SUBSTRING=0; 
	}
	
	public void insert(String s) {
		node cur = root; 
		for(char c : s.toCharArray()) {
			if(!cur.containsKey(c)) {
				cur.links[c-'a'] = new node();
				cur = cur.getKey(c); 
				No_OF_UNIQUE_SUBSTRING++; 
			}else {
				cur = cur.getKey(c); 
			}
		}
		cur.isEnd = true;
	}
}

class node{
	node[] links;
	boolean isEnd; 
	public node() {
		links = new node[26]; 
	}
	
	public boolean containsKey(char c) {
		return links[c-'a']!=null;
	}
	
	public node getKey(char c) {
		return links[c-'a']; 
	}
}
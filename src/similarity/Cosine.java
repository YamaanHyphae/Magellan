import java.util.Arrays;
import java.util.TreeSet;

public class Cosine {
	
	String[] union, document1, document2;
	int[] vector1, vector2;
	
	Cosine(String[] document1, String[] document2){
		this.document1 = document1;
		this.document2 = document2;
		union = union(document1, document2);
		vector1 = new int[union.length];
		vector2 = new int[union.length];	
	}
	
	/*List<String> intersection(String[] n, String[] m){
		Arrays.sort(n);
		for(int i=0; i<n.length; i++){
			if(Arrays.binarySearch(m, n[i])>=0) this.intersection.add(n[i]);
		}
		return intersection; 
	}*/ 
	
	/*
	 * Finds the intersection of two String arrays in O(nlogn) time. 
	 * So, now we can construct vectors in a R^(intersection.size())-dimensional vector space
	 */
	
	
	//
	
	String[] union(String[] n, String[] m){
		TreeSet<String> set = new TreeSet<String>();
		for(String entry: n) set.add(entry);
		for(String entry: m) set.add(entry);
		
		//TreeSet is natural choice because it's a) a set so there's no duplicates making the algorithm really simple
											//   b) sorted as new elements are added so the result is sorted based on String's natural order. 	
		
		return set.toArray(union); 
	}	
		
	void countOccurences(){
		int index;
		for(String s: this.document1){
			index = Arrays.binarySearch(this.union, s);
			vector1[index]++;
		}
		for(String s: this.document2){
			index = Arrays.binarySearch(this.union, s);
			vector2[index]++;
		}
	}

	
	int dot(int[] v, int[] w){
		int product = 0;
		for(int i = 0; i<v.length; i++){
			product += v[i]*w[i];
		}
		return product; 
	}
	

}

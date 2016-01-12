import java.lang.Math;


public class DamLev {
	
	char[] a, b;
	int[][] prefixDistance;
	//LinkedList<Character> one, two;
	
	DamLev(String a, String b){	
		this.a = a.toCharArray();
		this.b = b.toCharArray();
		//one = new LinkedList(a);
		//two = new LinkedList(b);
	}
	
	int min(int r, int s, int t){
		return Math.min(Math.min(r, s), t);	
	}
	
	int distance(char[] a, char[] b){	
	
		prefixDistance = new int[a.length][b.length];
		for(int n = 0; n < a.length; n++) prefixDistance[n][0]=n;
		for(int n = 0; n < a.length; n++) prefixDistance[0][n]=n;
		
		for(int n = 0; n<a.length; n++){
			for(int m = 0; m<b.length; m++){
				if(a[n]==b[m]) prefixDistance[n][m]=prefixDistance[n-1][m-1];
				else{
					int deletion = prefixDistance[n-1][m]+1;
					int insertion = prefixDistance[n][m-1]+1;
					int substitution = prefixDistance[n-1][m-1]+1;
					
					prefixDistance[n][m] = min(deletion, insertion, substitution);
				}
			}
		}
		
		//TO-DO: add transposition functionality
		
		return prefixDistance[a.length-1][b.length-1]; 
	}
	

}

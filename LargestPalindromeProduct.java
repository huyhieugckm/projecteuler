package ProjectEuler;


public class LargestPalindromeProduct {
	public static void main(String[] args) {
		int c = 0;
		for(int a = 999; a>=100; a--) {
			for(int b = a; b>=100; b--) {
				int d = a*b;	
				StringBuilder sb1 = new StringBuilder(""+d);
				String sb2 = ""+d;
				sb1.reverse();
				if(sb2.equals(sb1.toString()) && c < d) {
					c = d;
				}
			}
		}
		System.out.println(c);
	}
}

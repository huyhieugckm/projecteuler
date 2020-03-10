package ProjectEuler;

public class LongestCollatzSequence {
	public static void main(String[] args) {
		int count = 0;
		int max = 0;
		long n = 13;
		for(long i = 13; i<1000000L; i++ ) {
			n = i;
			count = 0;
			while(n!=1) {
				if(n%2==0) {
					n=n/2;
					count+=1;
				}
				else {
					n = 3*n+1;
					count+=1;
				}
			}
			if(max <= count) {
				max = count;
				System.out.println(i);
			}
		}
	}
}

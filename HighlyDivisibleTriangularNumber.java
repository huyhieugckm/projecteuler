package ProjectEuler;

public class HighlyDivisibleTriangularNumber {
	public static void main(String[] args) {
		long sum = 55;
		long n = 11;
		int count = 0;
		while(true) {
			sum+=n;
			count = 0;
			for(int i = 1; i*i<=sum; i++) {
				if(sum%i==0) {
					count+=2;
				}
			}
			if(count >= 501) {
				break;
			}
			n++;
		}
		System.out.println(sum);
	}
}

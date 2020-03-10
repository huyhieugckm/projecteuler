package ProjectEuler;

public class SummationOfPrimes {
	public static void main(String[] args) {
		long sum = 17;
		boolean flag = true;
		for(long n = 11; n<2000000; n+=2) {
			flag = true;
			for(int i = 3; i<= Math.sqrt(n); i+=2) {
				if(n%i == 0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				sum+=n;
			}
		}
		System.out.println(sum);
	}
}

package ProjectEuler;

public class SumSquareDifference {
	public static void main(String[] args) {
		System.out.println(SumSquare());
	}
	public static int SumSquare() {
		int sum = 0;
		for(int i = 1; i<100; i++) {
			for(int j = i+1; j<=100; j++) {
				sum+=2*i*j;
			}
		}
		return sum;
	}
}

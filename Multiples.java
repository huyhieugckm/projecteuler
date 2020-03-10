package ProjectEuler;

public class Multiples {
	public static void main(String[] args) {
		int tong = 0;
		for(int i = 0; i<1000; i++) {
			if(i%3==0 || i%5 == 0) {
				tong+=i;
			}
		}
		System.out.println(tong);
	}
}

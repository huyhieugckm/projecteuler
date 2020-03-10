package ProjectEuler;

public class SmallestMultiple {
	public static int Small () {
		int i = 2520;
		int count = 0;
		while(true) {
			for(int j = 11; j<=20; j++) {
				if(i%j!=0) {
					count++;
				}
			}
			i+=20;
			if(count == 0) {
				return i-20;
			}
			count = 0;
		}
	}
	public static void main(String[] args) {
		System.out.println(Small());
	}
}

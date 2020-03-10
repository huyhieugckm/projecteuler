package ProjectEuler;

public class SpecialPythagoreanTriplet {
	public static void main(String[] args) {
		double a, b, c;
		for(a = 1; a<=1000; a++) {
			for(b = 1; b<1000; b++) {
				c = Math.pow(a*a+b*b, 0.5);
				if(a+b+c == 1000 && a<b) {
					int d = (int) (a*b*c);
					System.out.println(a+" "+b+" "+c);
					System.out.println(d);
					break;
				}
			}
		}
	}
}

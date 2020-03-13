package ProjectEuler;

import java.math.BigInteger;

public class PowerDigitSum {
	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(2);
		char[] list = a.pow(1000).toString().toCharArray();
		int sum = 0;
		for(int i = 0; i<list.length; i++) {
			sum = sum+(list[i] - '0');
		}
		System.out.println(sum);
	}
}

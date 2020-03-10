package ProjectEuler;

import java.util.ArrayList;

public class EvenFibonacciNumbers {
	public static void main(String[] args) {
		int tong = 0;
		ArrayList<Integer> list = new ArrayList<>();
		int a=1;
		int b=0;
		int temp=1;
		while(a<4000000) {
			list.add(a);
			b = a + temp;
			temp = a;
			a = b;		
		}
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)%2 == 0) {
				tong+=list.get(i);
				System.out.println(list.get(i));
			}
		}
		System.out.println(tong);
	}
}

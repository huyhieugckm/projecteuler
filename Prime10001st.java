package ProjectEuler;

import java.util.ArrayList;

public class Prime10001st {
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		list.add(2);
		list.add(3);
		System.out.println(getPrime(10001));
		
	}
	public static int getPrime(int i) {
		if(i<=list.size()) {
			return list.get(i-1);
		}
		int count = list.size();
		for(int j = list.get(list.size()-1)+2; count < i; j+=2) {
			if(FindPrime(j)) {
				count++;
			}
		}
		return list.get(list.size()-1);
	}
	
	public static boolean FindPrime(int n) {
			for(int k : list) {
				if(n%k==0) {
					return false;
				}
			}
			list.add(n);
			return true;
	}
}

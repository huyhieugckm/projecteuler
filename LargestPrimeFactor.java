package ProjectEuler;

import java.util.ArrayList;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		ArrayList<Long> list = new ArrayList<>();
		long i = 2;
		long a = 600851475143L ;
		//Long temp = 0L;
		while(a > 1) {
			if(a %i==0) {
				a=a/i;
				list.add(i);
			}
			else {
				i++;
			}
		}
		System.out.println(i);
		/*for(int k = 0; k <list.size() - 1; k++) {
			for(int j = 0; j<list.size() - 1 - k; j++) {
				if (list.get(j)>list.get(j+1)) {
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		System.out.println(list.get(list.size()-1));*/
	}
}

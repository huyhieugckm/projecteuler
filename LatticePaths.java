package ProjectEuler;

public class LatticePaths {
	public static void main(String[] args) {
		//use mathematical formula (A + B)!/(A! * B!)
		long result = 1;
		int n = 20;
		for(int i = 1; i<=n; i++) {
			result*=(i+n);
			result = result/i;
		}
		System.out.println(result);
	}
	
}

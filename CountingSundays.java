package ProjectEuler;

public class CountingSundays {
	public static void main(String[] args) {
		int count = 0;
		int thu = 3;
		for(int nam = 1901; nam<= 2000; nam ++) {
			for(int thang = 1; thang <=12; thang ++) {
				for(int ngay = 1; ngay <=31; ngay++) {
					thu+=1;
					if(thu == 9) {
						thu = 2;
					}
					if(nam%4!=0 && thang == 2 && ngay == 28) {
						ngay = 1;
						break;
					}else if(nam%4==0 && thang == 2 && ngay == 29) {
						ngay = 1;
						break;
					}
					else if((thang == 4 || thang == 6 || thang == 9 || thang == 11) && ngay == 30) {
						ngay = 1;
						break;
					}else if((thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) && ngay == 31) {
						ngay = 1; 
						break;
					}
					if(thu == 8 && ngay == 1) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}

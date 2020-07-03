package java25;

public class Computer {
	
	//메소드1
	int sum1(int[] values) {
		int sum=0;
		for (int i = 0; i < values.length; i++) {
			sum+=values[i];
		}return sum;
	}
	//메소드2
	int sum2(int ... values) {  //int sum2(int ... values); >> 내가 몇개를 받을지 모를때는 ...이용해서
		int sum=0;
		for (int i = 0; i < values.length; i++) {
			sum+=values[i];
		}return sum;
	}
}

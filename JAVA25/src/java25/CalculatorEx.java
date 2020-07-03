package java25;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		myCalc.powerOn();
		System.out.println("두 수의 합 : " + myCalc.plus(5, 6));
		System.out.println("두 수를 나눈값 : " + myCalc.divide(5, 2));
		myCalc.powerOff();
		
	}
}

  
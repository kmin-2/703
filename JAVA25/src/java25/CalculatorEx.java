package java25;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		myCalc.powerOn();
		System.out.println("�� ���� �� : " + myCalc.plus(5, 6));
		System.out.println("�� ���� ������ : " + myCalc.divide(5, 2));
		myCalc.powerOff();
		
	}
}

  
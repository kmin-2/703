package java25;

public class CarGasEx {
	public static void main(String[] args) {
		CarGas gas= new CarGas();
		gas.setGas(3);
		boolean gasState=gas.isLeftGas(); //
		if (gasState) {
			System.out.println("����մϴ�.");
			gas.run();
		}
		if(gas.isLeftGas()) {
			System.out.println("�ܿ����� �����ֽ��ϴ�");
		}else System.out.println("�������ʿ��մϴ�");
	}
}

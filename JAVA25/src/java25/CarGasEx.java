package java25;

public class CarGasEx {
	public static void main(String[] args) {
		CarGas gas= new CarGas();
		gas.setGas(3);
		boolean gasState=gas.isLeftGas(); //
		if (gasState) {
			System.out.println("출발합니다.");
			gas.run();
		}
		if(gas.isLeftGas()) {
			System.out.println("잔여량이 남아있습니다");
		}else System.out.println("주유가필요합니다");
	}
}

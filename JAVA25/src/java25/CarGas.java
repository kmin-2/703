package java25;

public class CarGas {
	int gas;  //필드

	void setGas(int gas) {  //생성자
		this.gas = gas;}
	
	//메소드
	boolean isLeftGas() {// gas가 0이면 gas가 없습니다 >> false
		if (gas==0) {
			System.out.println("gas가 없습니다");
			return false;
			
		}else {System.out.println("gas가 있습니다"); 
			return true;}
		
	}
	void run() {// gas가 0보다 크면 달립니다.  gas보유량   // gas가 0이므로 멈춥니다
		while(true) {
		if (gas>0) {
			System.out.println("달립니다. (gas보유량 : " + gas +")");
			gas -=1;
		}else {System.out.println("정차입니다. (gas보유량 : " + gas +")");
				break;}
		}
	}
}

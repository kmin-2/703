package java25;

public class CarGas {
	int gas;  //�ʵ�

	void setGas(int gas) {  //������
		this.gas = gas;}
	
	//�޼ҵ�
	boolean isLeftGas() {// gas�� 0�̸� gas�� �����ϴ� >> false
		if (gas==0) {
			System.out.println("gas�� �����ϴ�");
			return false;
			
		}else {System.out.println("gas�� �ֽ��ϴ�"); 
			return true;}
		
	}
	void run() {// gas�� 0���� ũ�� �޸��ϴ�.  gas������   // gas�� 0�̹Ƿ� ����ϴ�
		while(true) {
		if (gas>0) {
			System.out.println("�޸��ϴ�. (gas������ : " + gas +")");
			gas -=1;
		}else {System.out.println("�����Դϴ�. (gas������ : " + gas +")");
				break;}
		}
	}
}

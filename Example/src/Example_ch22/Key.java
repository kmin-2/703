package Example_ch22;

public class Key {
	public int number;
	public Key(int number){
		this.number=number;}
	
	//equals �������̵�(������ �ּҸ� ���� ����)
	//hashcode �������̵�(�������� �ּҸ� ����)
	
	public int hashCode() {
		return number;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key k= (Key) obj;
			if (number==k.number) {
				return true;
			}else return false;
		}return false;
	}
	//  36.3  36.7
	
}

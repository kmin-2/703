package Example_ch22;

public class Key {
	public int number;
	public Key(int number){
		this.number=number;}
	
	//equals 오버라이딩(논리적인 주소를 같게 만듬)
	//hashcode 오버라이딩(물리적인 주소를 같게)
	
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

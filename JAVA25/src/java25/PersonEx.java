package java25;

public class PersonEx {
	public static void main(String[] args) {
		Person p1=new Person("961007-2******","���");
		System.out.println(p1.nation +"\n" +p1.ssn+"\n" +p1.name);
		
		p1.name="meheeee";
		//p1.ssn="123456-7894565";  //final���̹Ƿ� ����Ұ���
		System.out.println(p1.nation +"\n" +p1.ssn+"\n" +p1.name);
		
	}
}

package ch23;

import java.util.HashMap;
import java.util.Scanner;


public class HashMapNationEx {
	public static void main(String[] args) {
		/*"�׸�"�� �Էµ� ������ ���� �̸��� �α��� �Է¹޾� �����ϰ�, �ٽ� ���� �̸��� �Է¹޾� �α��� ����ϴ� 
		 ���α׷��� �ۼ��϶�. ���� �ؽø��� �̿��϶�.*/
		HashMap<String, Integer> nations=new HashMap<String, Integer>();
		Scanner k=new Scanner(System.in);
		//�Էº�
		while(true) {//�׸��� �Էµɶ����� �ݺ�
			System.out.print("����, �α��� �Է� : ");
			//��ĳ�ʷ� �Է¹������� �����濡 ����
			String Country=k.next();
			//�����濡 �׸��̶�� ���ڰ� ������ �극��ũ
			if (Country.equals("�׸�")) {
				break;}	
			//�α��� �Է¹޾� population�����濡 ����
			int	Population=k.nextInt();			
			nations.put(Country, Population);
		}
			
		//�˻���
		while(true) {
		System.out.print("�α��˻�");
		String country=k.next();
		if (country.equals("�׸�")) {
			break;
		}
		//get���� �α�����
		try {
			int value=nations.get(country);
			System.out.println(country + "�� �α��� " + value);
		} catch (Exception e) {
			System.out.println(country + " ����� �����ϴ�");
		}
		
		}
		
	}
}

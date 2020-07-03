package ch23;

import java.util.HashMap;
import java.util.Scanner;


public class HashMapNationEx {
	public static void main(String[] args) {
		/*"그만"이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고, 다시 나라 이름을 입력받아 인구를 출력하는 
		 프로그램을 작성하라. 다음 해시맵을 이용하라.*/
		HashMap<String, Integer> nations=new HashMap<String, Integer>();
		Scanner k=new Scanner(System.in);
		//입력부
		while(true) {//그만이 입력될때까지 반복
			System.out.print("나라, 인구를 입력 : ");
			//스캐너로 입력받은것을 변수방에 저장
			String Country=k.next();
			//변수방에 그만이라는 문자가 들어오면 브레이크
			if (Country.equals("그만")) {
				break;}	
			//인구를 입력받아 population변수방에 저장
			int	Population=k.nextInt();			
			nations.put(Country, Population);
		}
			
		//검색부
		while(true) {
		System.out.print("인구검색");
		String country=k.next();
		if (country.equals("그만")) {
			break;
		}
		//get으로 인구추출
		try {
			int value=nations.get(country);
			System.out.println(country + "의 인구는 " + value);
		} catch (Exception e) {
			System.out.println(country + " 나라는 없습니다");
		}
		
		}
		
	}
}

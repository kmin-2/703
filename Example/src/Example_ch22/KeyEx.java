package Example_ch22;

import java.util.HashMap;

public class KeyEx {
	public static void main(String[] args) {
		HashMap<Key, String> hashmap=new HashMap<Key, String>();
		//HashMap >> key값을 주면 value값을 반환해주는 메소드
		//식별키 "new key(1)"로 "홍길동"을 저장함
			//저장명령어.put     //가지고 오는 명령어.get
		hashmap.put(new Key(1), "홍길동");
		//hashmap.put(new Key(2), "김");
		//hashmap.put(new Key(3), "경");
		//hashmap.put(new Key(4), "민");
		
		String value= hashmap.get(new Key(1));
		System.out.println(value);
		//System.out.println(hashmap.get(new Key(2))
		//+hashmap.get(new Key(3))+hashmap.get(new Key(4)));
		
	}
}

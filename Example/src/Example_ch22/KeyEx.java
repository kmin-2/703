package Example_ch22;

import java.util.HashMap;

public class KeyEx {
	public static void main(String[] args) {
		HashMap<Key, String> hashmap=new HashMap<Key, String>();
		//HashMap >> key���� �ָ� value���� ��ȯ���ִ� �޼ҵ�
		//�ĺ�Ű "new key(1)"�� "ȫ�浿"�� ������
			//�����ɾ�.put     //������ ���� ��ɾ�.get
		hashmap.put(new Key(1), "ȫ�浿");
		//hashmap.put(new Key(2), "��");
		//hashmap.put(new Key(3), "��");
		//hashmap.put(new Key(4), "��");
		
		String value= hashmap.get(new Key(1));
		System.out.println(value);
		//System.out.println(hashmap.get(new Key(2))
		//+hashmap.get(new Key(3))+hashmap.get(new Key(4)));
		
	}
}

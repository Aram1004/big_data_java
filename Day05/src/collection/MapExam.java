package collection;
import java.util.HashMap;
import java.util.Set;

public class MapExam {

	public static void testMap(){
		
		HashMap<String, Object> map = new HashMap<>(); //��ü�� �̸��� �ٿ��ٲ��� string������ �ٿ��ٰŶ���
	
//		�߰� - put(key, value)  key���� �ߺ��� ������� �ʴ´�. value�� ����, �߰� ������ �Ѵ� �� put  == key-value ���� ������ �߰��ؾ��Ѵ�
		map.put("name", "�迵��"); 
		map.put("age", 20);
		map.put("weight", 70.5);
		map.put("address", "��⵵ ������ �д籸");
		System.out.println(map);

//		�� ��ȸ  - ge(Ű)
		Object name = map.get("name");  //Ű ���� �Է��ϸ� �׿����� value���� ã���ش�.
		System.out.println("�̸� : "+name);
		
//		value�� ����  - put(key,value)
		// key�� ������ ����, key�� ������ �߰� �̴�. 
		Object oldAge = map.put("age", 25);
		System.out.println("���� �� ���� : "+oldAge);
//
		map.put("name", "�̿���");
		System.out.println(map);

//		���� - remove(Ű)
		Object delName = map.remove("name");
		System.out.println("������ �̸� : "+delName);
		System.out.println(map);

//		�ݺ����� �̿��� ��ȸ : KEY������ ��ȸ�� �� KEY������ �ݺ����� �̿��� ó��
		Set<String> keys = map.keySet();
		for(String key : keys){
			System.out.println(key);
			Object value = map.get(key);
			System.out.println(value);
		}
	}

	
	public static void main(String[] args) {
		testMap();
	}
}











package collection;
import java.util.HashMap;
import java.util.Set;

public class MapExam {

	public static void testMap(){
		
		HashMap<String, Object> map = new HashMap<>(); //객체에 이름을 붙여줄껀데 string값으로 붙여줄거란말
	
//		추가 - put(key, value)  key값은 중복을 허용하지 않는다. value는 가능, 추가 변경을 둘다 함 put  == key-value 값을 쌍으로 추가해야한다
		map.put("name", "김영수"); 
		map.put("age", 20);
		map.put("weight", 70.5);
		map.put("address", "경기도 성남시 분당구");
		System.out.println(map);

//		값 조회  - ge(키)
		Object name = map.get("name");  //키 값을 입력하면 그에따른 value값을 찾아준다.
		System.out.println("이름 : "+name);
		
//		value를 변경  - put(key,value)
		// key값 있으면 변경, key가 없으면 추가 이다. 
		Object oldAge = map.put("age", 25);
		System.out.println("변경 전 나이 : "+oldAge);
//
		map.put("name", "이영수");
		System.out.println(map);

//		삭제 - remove(키)
		Object delName = map.remove("name");
		System.out.println("삭제된 이름 : "+delName);
		System.out.println(map);

//		반복문을 이용한 조회 : KEY값들을 조회한 뒤 KEY값들을 반복문을 이용해 처리
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











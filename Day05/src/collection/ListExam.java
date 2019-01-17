package collection;
import java.util.ArrayList;

public class ListExam {

	public static void testList(){
		ArrayList<String>  list = new ArrayList<String>(); // 배열이 생김으로 index를 사용해서 쓴다.
		
//		추가  (중복 상관없이 다 추가 가능)
		list.add("홍길동");//0
		list.add("김철수");//1
		list.add("박영희");//2
		list.add("이순이");//3
		list.add("이순이");//4
		
		System.out.println("list의 size : "+list.size());  //총 개수 알려줌
		System.out.println(list);

//		삽입  (중간에 넣는것)
		list.add(1, "박지우");//1번 index에 "박지우" 을 삽입. (오버로딩되있음)
		System.out.println(list);

//		삭제
		list.remove("이순이");// 삭제할 객체 전
		System.out.println(list);
//		
		String o = list.remove(1); //삭제할것에 index를 주는것 / 삭제할 객체의 index를 전달.
		//삭제한 객체(원소) 반환.
		System.out.println(o); // 삭제된것을 알기위해 변수로 받아 삭제된것을 찍어보기
		System.out.println(list);

//		조회 -- get(조회할 index)
		o = list.get(1);
		System.out.println("1번 idx 조회결과 : "+o);
		
//		변경
		o = list.set(1, "오영길");
		System.out.println("대체된 객체 : "+o);


		list.add("박영희");
		System.out.println(list);
		System.out.println("박영희 객체의 index(앞에서부터) : " + list.indexOf("박영희"));
		System.out.println("박영희 객체의 index(뒤에서부터) : " + list.lastIndexOf("박영희"));
		

		System.out.println("-------반복문을 이용한 조회------------");
		for(int i = 0; i < list.size(); i++ ){  //리스트에 있는 원소 개수
			
			String name = list.get(i);  //get의 i번째 list값
			System.out.println(name);
		}
		for(String n : list) {   //향샹된 for문
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		testList();
	}
}












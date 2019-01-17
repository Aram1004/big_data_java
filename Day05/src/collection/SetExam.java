package collection;
import java.util.HashSet;

public class SetExam {
	
	public static void testSet1(){

		HashSet<String> set = new HashSet<>();   //<> : 제너릭스 : 모든객체를 다 모을수 있다 (앞에 String이 없을때).  근데 앞에 string 있으니까 문자형데이터만 모으겠다란 뜻
		boolean flag = false;
//추가
		set.add("사자");
		flag = set.add("코끼리");
		System.out.println("코끼리 추가 여부 : "+flag);
		flag = set.add("코끼리");
		System.out.println("코끼리 재추가 여부 : "+flag);
		System.out.println(set);

		int size = set.size();   //list.set. map - 컬렉션 내의 원소(객체)의 개수.--> 저장된 객체의 개수를 알려주는 size코드
		System.out.println("Set 내의 객체 수 : "+ size);
		
//		삭제(Set/List)
		set.remove("코끼리"); //삭제 하는 메소드
		System.out.println("코끼리 삭제 후 Set 내의 객체 수 : " + set.size());		
//
		flag = set.remove("곰");
		System.out.println("곰삭제 여부 : "+flag);
		set.add("강아지");
		set.add("기린");
		set.add("낙타");
		System.out.println(set);

//		조회
		flag = set.contains("코끼리");
		System.out.println("코끼리 존재 여부 : " + flag);
		System.out.println("기린 존재 여부 : "+set.contains("기린"));

		if(!set.contains("코끼리")){  // 코끼리를 아까 지웠음으로 flase가 나온다. set언에 코끼리가 없다. 
			set.add("코끼리");
		}

		if(set.contains("코알라")) {
			set.remove("코알라");
		}

		set.clear();
		System.out.println(set);
		
		if(set.isEmpty()){
			System.out.println("Set은 비어있습니다.");
		}else{
			System.out.println("Set은 한개 이상의 element들을 가지고 있습니다.");
		}
//		
		
	}
	//향상된 for() 문을 이용한 조회
	public static void testSet2(){
		HashSet<String> set = new HashSet<>();
		set.add("김영수");
		set.add("이순이");
		set.add("박영희");
		set.add("이철수");
		set.add("오미경");
		// for (원소를 저장할 변수선언 : 배열,set,List)
		for(String element : set){  //향상된 for문 
			System.out.println(element);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		testSet1();
	}
}




 











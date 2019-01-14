
public class MethodExam {
//매소드 선언부 (=함수)
	//public static : 제한자 - 메소드의 기능을 제한한다.  
	//void : 리턴타입 - 메소드가 호출한 곳으로 변환할 겂의 데이터 타입
	//void - 반환값이 없다. 호출한 곳으로 반환값이 없다.라는 뜻  - 아무것도 반환안하고 그냥 매소드를 처리하고 끝내겠다. int형으로 반환할꺼면 void 대신 int 씀  
	//add  : 메소드의 이름 (관례 - 변수와 동일 - 카멜표기법)
	//() 괄호는 필수, 그 안에 변수를 2개 선언 (int num1, int num2) - 매개변수 (parameter) 선언. 
	//caller(호출한 곳) 으로부터 전달 받을 값을 지정할 변수	
	public static void  add(int num1, int num2) //매소드구현 
	{
	   //구현 - 실행문(명령문)들을 순서대로 나열한다.
		int result = num1+ num2;
		System.out.println(result);   //이상태론 실행불가 매소드를 호출하는 코드가 없다. 따라서 실행용 매소드가 필요하다. 실행용 매소드 => public static void main (String [] args) [자바실행환경이 불러주는 매소드]이거는 프로그램당 한개뿐 main매소드!!
	}		//매소드는 이런기능을 많이 쓸거같으니까 만들어놓고 호촐, 가저와서 쓰려고함 
	// 메인 매소드 - 자바 어플리케이션의 시작점이 되는 매소드.
	//JRE에 의해 호출되는 매소드.
	public static void main(String[] args) { //메인 매소드
			// add()매소드 호출
			add(30,20);		
			add(100,700);  // 하나의 add기능을 만들어 놓고 재사용을 하는것 
			
	}
}

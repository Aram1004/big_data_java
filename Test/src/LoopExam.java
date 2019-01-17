
public class LoopExam {
	
	public static void whileTest() {
		int num =10;
		while (num > 0) {
			System.out.println(num);
			num --; // 반복시마다 num의 값을 변경 =>while 문을 빠져나온다. 조건문이 false 가 되도록 만들기  
			//num = num - 3;
			//num -= 3;
		}
	
	//while(true) {System.out.println(10);
	public static void main (String[] args) {
		whileTest();
		}
}
	public static void forTest() {
		for (int i =0 ; i <10; i++) {
			System.out.println(i +". 안녕하세요");
		}
	}
	public static void main(String[] args) {
		whileTest();
	}
	}
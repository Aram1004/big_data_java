
public class LoopExam {
	
	public static void whileTest() {
		int num =10;
		while (num > 0) {
			System.out.println(num);
			num --; // �ݺ��ø��� num�� ���� ���� =>while ���� �������´�. ���ǹ��� false �� �ǵ��� �����  
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
			System.out.println(i +". �ȳ��ϼ���");
		}
	}
	public static void main(String[] args) {
		whileTest();
	}
	}
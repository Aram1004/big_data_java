
public class IfExam {

	public static void IfTest(int age) {
		
		if (age <=0 ) {
			System.out.println("���̰� �ƴմϴ�.");
		}
		else if (age < 20 ) {  //�ڹٴ� (0 < age <20)�̷��� �ѹ��� �� �ϴ°� ���Ѵ�. ���� ������ ������ �ۼ��ؾ��Ѵ�.  
			System.out.println(age+"�� �̼���");}
		else if (age<40 ) {
			System.out.println(age+"�� û��");}
		else if (age <60 ) {
				System.out.println(age+"�� ���"); }
		else if (age >=60) {
			System.out.println(age +"�� ���");
		}
			}
		public static void switchExam(int month) {
			//month 1,3,5,7,8,10,12,-31��
			// 		4,6,9,11,-30��
			//		2 -28, 29��
			//if (month ==4 || month ==6 || month ==9 || month =11||) {
				//System.out.println("30��");
			
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31��");
				break;
			case 4: 	
			case 6: 	
			case 9: 	
			case 11:
				System.out.println("30��");
				break;
			case 2:
				System.out.println("28�� �Ǵ� 29��");
				break;
			default:
				System.out.println("�߸������Դϴ�.");
				
			}
		}
		
		public static void main(String[] args) {
		IfTest(1);
		IfTest(20);
		IfTest(50);
		IfTest(-10);
			}
		
			}
			
		//if (age >=20 && age<40 ) {
			//System.out.println(age+"�� û��");   //�ǹ� �����ϱ� 
	

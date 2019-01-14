
public class IfExam {

	public static void IfTest(int age) {
		
		if (age <=0 ) {
			System.out.println("나이가 아닙니다.");
		}
		else if (age < 20 ) {  //자바는 (0 < age <20)이렇게 한번에 비교 하는거 못한다. 따라서 조건을 나눠서 작성해야한다.  
			System.out.println(age+"는 미성년");}
		else if (age<40 ) {
			System.out.println(age+"는 청년");}
		else if (age <60 ) {
				System.out.println(age+"는 장년"); }
		else if (age >=60) {
			System.out.println(age +"는 노년");
		}
			}
		public static void switchExam(int month) {
			//month 1,3,5,7,8,10,12,-31일
			// 		4,6,9,11,-30일
			//		2 -28, 29일
			//if (month ==4 || month ==6 || month ==9 || month =11||) {
				//System.out.println("30일");
			
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31일");
				break;
			case 4: 	
			case 6: 	
			case 9: 	
			case 11:
				System.out.println("30일");
				break;
			case 2:
				System.out.println("28일 또는 29일");
				break;
			default:
				System.out.println("잘못된일입니다.");
				
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
			//System.out.println(age+"는 청년");   //의미 이해하기 
	

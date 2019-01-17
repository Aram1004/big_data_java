
public class TestMyDate {
	public static void main(String[] args) {
		//2017 - 3 - 21
		MyDate birthday = new MyDate();
		//birthday.year = 2017;
		birthday.setYear(2017);
		//birthday.month = 3;
		birthday.setMonth(3);

//		birthday.day = 12;
		birthday.setDay(12);
		
		//birthday.month = 30;
		birthday.setMonth(30);
		
		//System.out.println(birthday.year);
		System.out.println(birthday.getYear());
		//System.out.println(birthday.month);
		System.out.println(birthday.getMonth());
		//System.out.println(birthday.day);
		System.out.println(birthday.getDay());
		
		System.out.printf("생일 : %d년 %d월 %d일 %n",
						   //birthday.year,
							birthday.getYear(),
						   //birthday.month,
						   birthday.getMonth(),
						   //birthday.day);
						   birthday.getDay());
		
		printMyDate(birthday);
//		printMyDate(2017,10,2);
				
	}
	public static void printMyDate(int y, int m, int d) {
		
	}
	public static void printMyDate(MyDate date) {
//		System.out.println(date.year);
		System.out.println(date.getYear());
//		System.out.println(date.month);
		System.out.println(date.getMonth());
//		System.out.println(date.day);
		System.out.println(date.getDay());
	}
}










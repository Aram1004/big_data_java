//년/월/일
public class MyDate {
	//private : 같은 클래스안에서만 사용(변수-조회/변경)가능.
	private int year;
	private int month;
	private int day;
	
	
	//private instanc변수를 다른 클래스에서 
	//사용할 수 있도록 해주는 메소드를 제공.

	//month변수의 값을 변경하는 메소드.
	public void setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
		}else {
			System.out.printf("%d는 잘못된 월%n",	 month);
		}
	}
	//month변수의 값을 조회하는 메소드
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}













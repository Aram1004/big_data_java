//��/��/��
public class MyDate {
	//private : ���� Ŭ�����ȿ����� ���(����-��ȸ/����)����.
	private int year;
	private int month;
	private int day;
	
	
	//private instanc������ �ٸ� Ŭ�������� 
	//����� �� �ֵ��� ���ִ� �޼ҵ带 ����.

	//month������ ���� �����ϴ� �޼ҵ�.
	public void setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
		}else {
			System.out.printf("%d�� �߸��� ��%n",	 month);
		}
	}
	//month������ ���� ��ȸ�ϴ� �޼ҵ�
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













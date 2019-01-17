package inherit2;

public class Student extends Person{
	
	private int grade;

	public Student(String id, String name, char gender, 
				   int grade) {
//		setId(id);
//		this.name = name;
//		this.gender = gender;
		super(id, name, gender); 
		//super(��,..);=>�θ��� �����ڸ� ȣ��
		this.grade = grade;
	}
	
	public Student() {}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDetails() {
		return String.format("ID : %s, �̸� : %s, ���� : %s, ����: %d", 
							 getId(), getName(), getGender(),
							 grade);	
	}
}








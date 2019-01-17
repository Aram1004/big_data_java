package inherit2;

public class Student extends Person{
	
	private int grade;

	public Student(String id, String name, char gender, 
				   int grade) {
//		setId(id);
//		this.name = name;
//		this.gender = gender;
		super(id, name, gender); 
		//super(값,..);=>부모의 생성자를 호출
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
		return String.format("ID : %s, 이름 : %s, 성별 : %s, 성적: %d", 
							 getId(), getName(), getGender(),
							 grade);	
	}
}








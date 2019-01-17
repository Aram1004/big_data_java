package inherit;

public class Student extends Person{
	
	int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDetails() {
		return String.format("ID : %s, 이름 : %s, 성별 : %s, 성적: %d", 
							 id, name, gender, grade);	
	}
	
}








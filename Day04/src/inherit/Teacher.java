package inherit;

public class Teacher extends Person{
	
	//과목
	String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDetails() {
		return String.format("ID : %s, 이름 : %s, 성별 : %s, 과목 : %s", 
							 id, name, gender, subject);	
	}
}







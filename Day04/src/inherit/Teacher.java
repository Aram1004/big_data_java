package inherit;

public class Teacher extends Person{
	
	//����
	String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDetails() {
		return String.format("ID : %s, �̸� : %s, ���� : %s, ���� : %s", 
							 id, name, gender, subject);	
	}
}







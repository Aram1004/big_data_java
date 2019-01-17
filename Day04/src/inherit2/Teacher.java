package inherit2;

public class Teacher extends Person{
	
	//����
	private String subject;
	
	public Teacher() {}
	
	public Teacher(String id, String name, char gender,
				   String subject) {
		super(id, name, gender);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDetails() {
		return String.format("ID : %s, �̸� : %s, ���� : %s, ���� : %s", 
							 getId(), getName(), getGender(),
							 subject);	
	}
}







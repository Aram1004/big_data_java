package inherit;

public class Person {
	//instance����
	String id;
	String name;
	char gender;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//��� instance������ �ϳ��� ���ڿ��� ����� �����ϴ� �޼ҵ�.
	public String getDetails() {
		return String.format("ID : %s, �̸� : %s, ���� : %s", 
							 id, name, gender);	
	}
}











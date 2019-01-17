package inherit2;

public class Person {
	//instance����
	private String id;
	private String name;
	private char gender;
	
	//������
	public Person(String id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	public Person() {}
	
	//getter/setter
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











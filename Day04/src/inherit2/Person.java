package inherit2;

public class Person {
	//instance변수
	private String id;
	private String name;
	private char gender;
	
	//생성자
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
	
	//모든 instance변수를 하나의 문자열로 만들어 리턴하는 메소드.
	public String getDetails() {
		return String.format("ID : %s, 이름 : %s, 성별 : %s", 
							 id, name, gender);	
	}
}











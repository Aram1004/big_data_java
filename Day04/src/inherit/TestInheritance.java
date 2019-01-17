package inherit;

public class TestInheritance {
	public static void main(String[] args) {
		//Student按眉 积己
		Student s = new Student();
		s.setId("s-1");
		s.setName("辫切积");
		s.setGender('巢');
		s.setGrade(20);
		
		String sInfo = s.getDetails();
		System.out.println(sInfo);
		
		Teacher t = new Teacher();
		//...
		System.out.println(t.getDetails());
		
		Person p = new Person();
		System.out.println(p.getDetails());
	}

}
























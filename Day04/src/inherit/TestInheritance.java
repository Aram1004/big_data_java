package inherit;

public class TestInheritance {
	public static void main(String[] args) {
		//Student��ü ����
		Student s = new Student();
		s.setId("s-1");
		s.setName("���л�");
		s.setGender('��');
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
























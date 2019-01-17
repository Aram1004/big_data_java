package inherit2;

public class TestInheritance {
	public static void main(String[] args) {
		//Student객체 생성
		Student s = new Student();
		s.setId("s-1");
		s.setName("김학생");
		s.setGender('남');
		s.setGrade(20);
		
		String sInfo = s.getDetails();
		System.out.println(sInfo);
		
		Teacher t = new Teacher();
		//...
		System.out.println(t.getDetails());
		
		Person p = new Person();
		System.out.println(p.getDetails());
		
		Student s2 = new Student("id-2", "홍길동", '남', 10);
		System.out.println(s2.getDetails());
		
		Teacher t2 = new Teacher("t-1", "박선생", '여', "수학");
		System.out.println(t2.getDetails());
	}

}
























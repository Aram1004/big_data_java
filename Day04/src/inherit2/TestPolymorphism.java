package inherit2;

public class TestPolymorphism {

	public static void exam1() {
		//부모 타입 변수 = 자식객체 
		Person s = new Student("s-1", "이학생", '남', 20);
		String sInfo = s.getDetails();
		System.out.println(sInfo);
		
		Person s2 = new Teacher("t-1", "최선성", '여', "자바");
		String tInfo = s2.getDetails();
		System.out.println(tInfo);
		
		System.out.println(s2.getName());
		
		Teacher tt = (Teacher)s2;
		String subject = tt.getSubject();
		System.out.println(subject);
		
		
	}
	
	public static void exam2() {
		//배열에 다형성을 적용.
		Person [] p = new Person[4];
		p[0] = new Person("p-1", "홍길동", '남');
		p[1] = new Teacher("t-1", "오선생", '여', "자바");
		p[2] = new Student("s-1", "최학생", '남', 20);
		p[3] = new Student("s-2", "주학생", '여', 15);
		for(int i = 0; i < p.length; i++) {
			System.out.println(p[i].getDetails());
		}
		System.out.println("--------------------");
		exam3(p[0]);
		exam3(p[1]);
		
	}
	
	public static void exam3(Person p) {
		//....
		
		System.out.println(p.getDetails());
		System.out.println(p.getName());
		
		//......
	}
	
	
	public static void main(String[] args) {
//		exam1();
//		exam2();
		Student s = new Student("s-5", "최학생", '남', 10);
		exam3(s);
		
	}
}














package inherit2;

public class TestPolymorphism {

	public static void exam1() {
		//�θ� Ÿ�� ���� = �ڽİ�ü 
		Person s = new Student("s-1", "���л�", '��', 20);
		String sInfo = s.getDetails();
		System.out.println(sInfo);
		
		Person s2 = new Teacher("t-1", "�ּ���", '��', "�ڹ�");
		String tInfo = s2.getDetails();
		System.out.println(tInfo);
		
		System.out.println(s2.getName());
		
		Teacher tt = (Teacher)s2;
		String subject = tt.getSubject();
		System.out.println(subject);
		
		
	}
	
	public static void exam2() {
		//�迭�� �������� ����.
		Person [] p = new Person[4];
		p[0] = new Person("p-1", "ȫ�浿", '��');
		p[1] = new Teacher("t-1", "������", '��', "�ڹ�");
		p[2] = new Student("s-1", "���л�", '��', 20);
		p[3] = new Student("s-2", "���л�", '��', 15);
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
		Student s = new Student("s-5", "���л�", '��', 10);
		exam3(s);
		
	}
}














package collection;
import java.util.ArrayList;

public class ListExam {

	public static void testList(){
		ArrayList<String>  list = new ArrayList<String>(); // �迭�� �������� index�� ����ؼ� ����.
		
//		�߰�  (�ߺ� ������� �� �߰� ����)
		list.add("ȫ�浿");//0
		list.add("��ö��");//1
		list.add("�ڿ���");//2
		list.add("�̼���");//3
		list.add("�̼���");//4
		
		System.out.println("list�� size : "+list.size());  //�� ���� �˷���
		System.out.println(list);

//		����  (�߰��� �ִ°�)
		list.add(1, "������");//1�� index�� "������" �� ����. (�����ε�������)
		System.out.println(list);

//		����
		list.remove("�̼���");// ������ ��ü ��
		System.out.println(list);
//		
		String o = list.remove(1); //�����ҰͿ� index�� �ִ°� / ������ ��ü�� index�� ����.
		//������ ��ü(����) ��ȯ.
		System.out.println(o); // �����Ȱ��� �˱����� ������ �޾� �����Ȱ��� ����
		System.out.println(list);

//		��ȸ -- get(��ȸ�� index)
		o = list.get(1);
		System.out.println("1�� idx ��ȸ��� : "+o);
		
//		����
		o = list.set(1, "������");
		System.out.println("��ü�� ��ü : "+o);


		list.add("�ڿ���");
		System.out.println(list);
		System.out.println("�ڿ��� ��ü�� index(�տ�������) : " + list.indexOf("�ڿ���"));
		System.out.println("�ڿ��� ��ü�� index(�ڿ�������) : " + list.lastIndexOf("�ڿ���"));
		

		System.out.println("-------�ݺ����� �̿��� ��ȸ------------");
		for(int i = 0; i < list.size(); i++ ){  //����Ʈ�� �ִ� ���� ����
			
			String name = list.get(i);  //get�� i��° list��
			System.out.println(name);
		}
		for(String n : list) {   //�⼧�� for��
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		testList();
	}
}












package collection;
import java.util.HashSet;

public class SetExam {
	
	public static void testSet1(){

		HashSet<String> set = new HashSet<>();   //<> : ���ʸ��� : ��簴ü�� �� ������ �ִ� (�տ� String�� ������).  �ٵ� �տ� string �����ϱ� �����������͸� �����ڴٶ� ��
		boolean flag = false;
//�߰�
		set.add("����");
		flag = set.add("�ڳ���");
		System.out.println("�ڳ��� �߰� ���� : "+flag);
		flag = set.add("�ڳ���");
		System.out.println("�ڳ��� ���߰� ���� : "+flag);
		System.out.println(set);

		int size = set.size();   //list.set. map - �÷��� ���� ����(��ü)�� ����.--> ����� ��ü�� ������ �˷��ִ� size�ڵ�
		System.out.println("Set ���� ��ü �� : "+ size);
		
//		����(Set/List)
		set.remove("�ڳ���"); //���� �ϴ� �޼ҵ�
		System.out.println("�ڳ��� ���� �� Set ���� ��ü �� : " + set.size());		
//
		flag = set.remove("��");
		System.out.println("������ ���� : "+flag);
		set.add("������");
		set.add("�⸰");
		set.add("��Ÿ");
		System.out.println(set);

//		��ȸ
		flag = set.contains("�ڳ���");
		System.out.println("�ڳ��� ���� ���� : " + flag);
		System.out.println("�⸰ ���� ���� : "+set.contains("�⸰"));

		if(!set.contains("�ڳ���")){  // �ڳ����� �Ʊ� ���������� flase�� ���´�. set�� �ڳ����� ����. 
			set.add("�ڳ���");
		}

		if(set.contains("�ھ˶�")) {
			set.remove("�ھ˶�");
		}

		set.clear();
		System.out.println(set);
		
		if(set.isEmpty()){
			System.out.println("Set�� ����ֽ��ϴ�.");
		}else{
			System.out.println("Set�� �Ѱ� �̻��� element���� ������ �ֽ��ϴ�.");
		}
//		
		
	}
	//���� for() ���� �̿��� ��ȸ
	public static void testSet2(){
		HashSet<String> set = new HashSet<>();
		set.add("�迵��");
		set.add("�̼���");
		set.add("�ڿ���");
		set.add("��ö��");
		set.add("���̰�");
		// for (���Ҹ� ������ �������� : �迭,set,List)
		for(String element : set){  //���� for�� 
			System.out.println(element);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		testSet1();
	}
}




 











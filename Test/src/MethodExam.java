
public class MethodExam {
//�żҵ� ����� (=�Լ�)
	//public static : ������ - �޼ҵ��� ����� �����Ѵ�.  
	//void : ����Ÿ�� - �޼ҵ尡 ȣ���� ������ ��ȯ�� ���� ������ Ÿ��
	//void - ��ȯ���� ����. ȣ���� ������ ��ȯ���� ����.��� ��  - �ƹ��͵� ��ȯ���ϰ� �׳� �żҵ带 ó���ϰ� �����ڴ�. int������ ��ȯ�Ҳ��� void ��� int ��  
	//add  : �޼ҵ��� �̸� (���� - ������ ���� - ī��ǥ���)
	//() ��ȣ�� �ʼ�, �� �ȿ� ������ 2�� ���� (int num1, int num2) - �Ű����� (parameter) ����. 
	//caller(ȣ���� ��) ���κ��� ���� ���� ���� ������ ����	
	public static void  add(int num1, int num2) //�żҵ屸�� 
	{
	   //���� - ���๮(��ɹ�)���� ������� �����Ѵ�.
		int result = num1+ num2;  
		System.out.println(result); 
		return ; // �ϳ������� �� �θ������� ���ư���  (��������)
		//��� //�̻��·� ����Ұ� �żҵ带 ȣ���ϴ� �ڵ尡 ����. ���� ����� �żҵ尡 �ʿ��ϴ�. ����� �żҵ� => public static void main (String [] args) [�ڹٽ���ȯ���� �ҷ��ִ� �żҵ�]�̰Ŵ� ���α׷��� �Ѱ��� main�żҵ�!!
	}		//�żҵ�� �̷������ ���� ���Ű����ϱ� �������� ȣ��, �����ͼ� �������� 
	// ���� �żҵ� - �ڹ� ���ø����̼��� �������� �Ǵ� �żҵ�.
	//JRE�� ���� ȣ��Ǵ� �żҵ�.
	
	public static void add (int n1, int n2, int n3) {
		System.out.println(n1+ n2+ n3);   //�������� ���� add������ �Ű������� �ٸ��� �̸��� �����ϰ� �Ҽ��մ�. 
	}
	
	public static void add (double n1, double n2) {
		System.out.println(n1 + n2); 
	}
	
	public static void add (int n1, int n2, int n3, int n4) {
		System.out.println(n1+ n2+ n3);  
	}
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		//result ������ ���� ȣ���� ������ ��ȯ�Ѵ�. 
		return  result;  //retrun �ϰ� ������ ���� ������
	}
	public static void main(String[] args) { //���� �żҵ�   , strig ����Ÿ�Կ� args ��� ����
		//minus() ȣ��	
		int v = minus(10,4); 
		System.out.println(v);//�ݵ�� �ڹٿ����� ���α׷� ����Ÿ���� �� ���������Ѵ�. 
		// add()�żҵ� ȣ��
			add(30,20);		
			add(100,700,200);  // �ϳ��� add����� ����� ���� ������ �ϴ°� 
			add(10,20,12,30);
	}
}
//����Ÿ�� : ���̵�� ������ �����Ҽ������� int�� �����ϸ� �ȵȴ�. ���̵�� Ÿ���� ���ٴ°����� ������ ���ص������� int�� �� ������ �����
// ó�� add������ ���� add �޼ҵ�� �ö󰡼� ������ ���� ������ main���� ���ƿ´�.  

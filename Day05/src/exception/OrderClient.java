package exception;

public class OrderClient {
	public static void main(String[] args ) {
		OrderService os1 = new OrderService();
		try {
		os1.order(5);
		System.out.println("---ù�ֹ� ȯ��----");
		
		os1.order(15);
		System.out.println("-----�ι��� �ֹ� �Ϸ�------");
		} catch(NotEnoughStockException e ) {
			System.out.println("�ֹ� ����");
			
		}
		System.out.println("��� �ֹ� ó�� �Ϸ�");
	}
	
}

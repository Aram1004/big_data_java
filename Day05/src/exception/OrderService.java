package exception;

public class OrderService {
	/*
	 * �ֹ�ó�� �޼ҵ� 
	 * 1. ������ �޴´� 
	 * 2. ������ ��ȸ.
	 * 3. �ֹ����� ������ ��.  
	 * 4. �ֹ��� ó��.
	 * 
	 *  ���ܻ�Ȳ : 3.���� �ֹ����� ��� ���� ���� ���.
	 */
	public void order(int orderAmount) 
		throws NotEnoughStockExpcetion{
			
		//�米���� ��ȸ => DB���� ��ȸ.
		int stockAmount = 10;  
		if (orderAmount > stockAmount) {
			// �ֹ����� ��� ���� ����  ���
		}
			//return;//ȣ���� ������ ���ư��� .
			throw new NotEnoughStockException(); // �� ȣ���� �ʿ� ���� �� ���ߴ��� �˷��� -> ����
			//throw ���ܰ�ü ; // ���ܸ� �߻���Ų��.
			//=> ������ �߻��� ��Ȳ���� ȣ���� ������ ���ư��� .
			
		}
			
		System.out.println("�ֹ�ó��");
		stockAmount -=orderAmount;
		//�ֹ����� ��� ���� ���� ���
		//  =>> �����۾�(�ֹ�ó��) �� �� �� ���� ��Ȳ .=> ����

		System.out.println("�ֹ� ó���� ���� ��� : " + stockAmount);
		return; 
	
		}
}
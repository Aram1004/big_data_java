package exception;
/*
 * ����� ������ ���ܻ�Ȳ�� ���� Exception Ŭ����. 
 * 1. Exception �̳� RuntimeException �� ��� .
 * 2. String�� �޴� �����ڿ� �Ű����� ���� ������ ���� .
 * 
 */
public class NotEnoughStockException extends Exception {

	public NotEnoughStockException() {}
	public NotEnoughStockException(String message) {
		super(message);
		
	}	
}

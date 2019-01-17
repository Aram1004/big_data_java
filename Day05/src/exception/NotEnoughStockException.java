package exception;
/*
 * 재고량이 부족한 예외상황에 대한 Exception 클래스. 
 * 1. Exception 이나 RuntimeException 을 상속 .
 * 2. String을 받는 생성자와 매개변수 없는 생성자 구현 .
 * 
 */
public class NotEnoughStockException extends Exception {

	public NotEnoughStockException() {}
	public NotEnoughStockException(String message) {
		super(message);
		
	}	
}

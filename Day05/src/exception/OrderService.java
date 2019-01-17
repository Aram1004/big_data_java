package exception;

public class OrderService {
	/*
	 * 주문처리 메소드 
	 * 1. 제고량을 받는다 
	 * 2. 제고량을 조회.
	 * 3. 주문량과 제고량을 비교.  
	 * 4. 주문을 처리.
	 * 
	 *  예외상황 : 3.에서 주문량이 재고량 보다 많은 경우.
	 */
	public void order(int orderAmount) 
		throws NotEnoughStockExpcetion{
			
		//재교량을 조회 => DB에서 조회.
		int stockAmount = 10;  
		if (orderAmount > stockAmount) {
			// 주문량이 재고량 보다 많은  경우
		}
			//return;//호출한 곳으로 돌아가라 .
			throw new NotEnoughStockException(); // 날 호출한 쪽에 내가 왜 못했는지 알려줌 -> 던짐
			//throw 예외객체 ; // 예외를 발생기킨다.
			//=> 오류가 발생한 상황에서 호출한 곳으로 돌아가라 .
			
		}
			
		System.out.println("주문처리");
		stockAmount -=orderAmount;
		//주문량이 재고량 보다 많은 경우
		//  =>> 다음작업(주문처리) 을 할 수 없는 상황 .=> 예외

		System.out.println("주문 처리후 남은 재고량 : " + stockAmount);
		return; 
	
		}
}
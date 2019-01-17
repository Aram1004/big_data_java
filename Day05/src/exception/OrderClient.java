package exception;

public class OrderClient {
	public static void main(String[] args ) {
		OrderService os1 = new OrderService();
		try {
		os1.order(5);
		System.out.println("---첫주문 환료----");
		
		os1.order(15);
		System.out.println("-----두번쨰 주문 완료------");
		} catch(NotEnoughStockException e ) {
			System.out.println("주문 실패");
			
		}
		System.out.println("모든 주문 처리 완료");
	}
	
}

package Ch01;


//손님이 카페사장에게 커피 1잔을 주문한다
//클래스 	: 손님
//속성 	: 보유금액
//		: 커피잔수
//기능 	: 주문하기(카페사장, 보유금액의 일부)
//
//클래스 	: 카페사장
//속성	: 보유금액
//		: 커피재고
//		: 커피가격
//기능	: 제조하기(손님의 돈) : 커피잔수


//손님이 카페사장에게 커피 1잔을 주문한다
//
//클래스 	: 손님(Customer)
//속성 	: 보유금액(myMoney : int)
//		: 커피잔수(coffeeCnt : int)
//
//기능 	: 주문하기(카페사장, 보유금액의 일부)
//		: order(CafeOwner owner , int money) : void
//
//
//클래스 	: 카페사장(CafeOwner)
//속성	: 보유금액(myMoney : int)
//		: 커피재고(coffeeCnt : int)
//		: 커피가격(price : int)
//
//기능	: 제조하기(손님의 돈) : 커피잔수
//		  make(int money) : int

class Customer {
	int myMoney;
	int coffeeCnt;
	
	//기능
	public void order(CafeOwner cafeOwner, int money) {
		//손님이 카페사장에게 커피 1잔을 주문한다
		// 카페사장이 만들어준 커피 수량 받음
		int receivedCoffeeCnt = cafeOwner.make(money); 
		// 커피 수량 증가
		coffeeCnt += receivedCoffeeCnt;
		// 카페 사장에게 커피값 전달
		// 보유 금액 감소
		myMoney -= money;
	}
	//생성자
	public Customer(int myMoney, int coffeeCnt) {
		super();
		this.myMoney = myMoney;
		this.coffeeCnt = coffeeCnt;
	}
	//toString
	@Override
	public String toString() {
		return "Customer [myMoney=" + myMoney + ", coffeeCnt=" + coffeeCnt + "]";
	}
	
}

class CafeOwner {
	int myMoney;
	int coffeeCnt;
	int price;
	
	//기능
	public int make(int money) {
		// 한잔 당 가격
		int receivedCoffeeCnt = money/price;
		// 잔 수량 만큼 보유 커피 차감
		coffeeCnt -= receivedCoffeeCnt;
		//받은 금액 만큼 보유 금액 증가
		myMoney += money;
		
		return receivedCoffeeCnt;
	}
	//생성자
	public CafeOwner(int myMoney, int coffeeCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.coffeeCnt = coffeeCnt;
		this.price = price;
	}
	//toString
	@Override
	public String toString() {
		return "CafeOwner [myMoney=" + myMoney + ", coffeeCnt=" + coffeeCnt + ", price=" + price + "]";
	}
	
}

public class C14Ex {

	public static void main(String[] args) {
		//손님이 카페사장에게 커피 1잔을 주문한다
		Customer 손님1 = new Customer(10000, 0);
		CafeOwner 카페사장1 = new CafeOwner(10000, 10, 2000); 
		
		손님1.order(카페사장1, 2000);
		손님1.order(카페사장1, 2000);
		손님1.order(카페사장1, 2000);
		
		System.out.println(손님1);
		System.out.println(카페사장1);
		
	}

}
package Ch01;

//관객이 매표원에게 영화표 1장을 예매한다
//클래스 	: 관객
//속성 	: 보유금액
//		: 티켓개수
//기능 	: 예매하기(매표원, 보유금액의 일부)
//
//클래스 	: 매표원
//속성	: 보유금액
//		: 티켓재고
//		: 티켓가격
//기능	: 발권하기(관객의 돈) : 티켓개수


//관객이 매표원에게 영화표 1장을 예매한다
//
//클래스 	: 관객(Audience)
//속성 	: 보유금액(myMoney : int)
//		: 티켓개수(ticketCnt : int)
//
//기능 	: 예매하기(매표원, 보유금액의 일부)
//		: reserve(TicketSeller seller , int money) : void
//
//
//클래스 	: 매표원(TicketSeller)
//속성	: 보유금액(myMoney : int)
//		: 티켓재고(ticketCnt : int)
//		: 티켓가격(price : int)
//
//기능	: 발권하기(관객의 돈) : 티켓개수
//		  issue(int money) : int

class Audience {
	int myMoney;
	int ticketCnt;

	// 기능
	public void reserve(TicketSeller seller , int money) {
//		seller.issue(money);
		int receivedTicketCnt = seller.issue(money);
		ticketCnt += receivedTicketCnt;
		myMoney -= money;
	}

	
	//생성자
	public Audience(int myMoney, int ticketCnt) {
		super();
		this.myMoney = myMoney;
		this.ticketCnt = ticketCnt;
	}
	
	//toStirng
	@Override
	public String toString() {
		return "Audience [myMoney=" + myMoney + ", ticketCnt=" + ticketCnt + "]";
	}
	
}

class TicketSeller {
	int myMoney;
	int ticketCnt;
	int price;
	
	public int issue(int money) {
		myMoney += money;
		int receivedTicketCnt = money/price;
		ticketCnt -= receivedTicketCnt; 
		
		return receivedTicketCnt;
	}
	
	//생성자
	public TicketSeller(int myMoney, int ticketCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.ticketCnt = ticketCnt;
		this.price = price;
	}

	//toStirng
	@Override
	public String toString() {
		return "TicketSeller [myMoney=" + myMoney + ", ticketCnt=" + ticketCnt + ", price=" + price + "]";
	}
	
}

public class C15Ex {

	public static void main(String[] args) {
		Audience 관객1 = new Audience(10000,0);
		TicketSeller 매표원1 = new TicketSeller(10000, 10, 2000);
		
		관객1.reserve(매표원1, 2000);
		
		System.out.println(관객1);
		System.out.println(매표원1);
	}

}
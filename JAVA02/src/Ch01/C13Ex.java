package Ch01;

//학생이 서점주인에게 책 1권을 구매한다
//클래스 	: 학생
//속성 	: 보유금액 
//		: 책개수
//기능 	: 구매하기(서점주인, 보유금액의 일부)
//
//클래스 	: 서점주인
//속성	: 보유금액
//		: 책개수
//		: 책가격
//기능	: 판매하기(구매자의 돈) : 책개수

//
//클래스 	: 학생(Student)
//속성 	: 보유금액(myMoney : int)
//		: 책개수(bookCnt : int)
//
//기능 	: 구매하기(서점주인, 보유금액의 일부)
//		: buy(BookSeller seller , int money) : void
//
//
//클래스 	: 서점주인(BookSeller)
//속성	: 보유금액(myMoney : int)
//		: 책개수(bookCnt : int)
//		: 책가격(price : int)
//
//기능	: 판매하기(구매자의 돈) : 책개수
//		  sell(int money) : int

class Student {
	int myMoney;
	int bookCnt;
	
	// 구매
	public void buy(BookSeller seller , int money) {
		// 서점주인에게 책1권 구매
		// 학생 보유금액 감소
		myMoney -= money;
		// 구매한 책 전달
		// 학생 책 수량
		bookCnt += seller.sell(money);
		
	}
	// 생성자
	public Student(int myMoney, int bookCnt) {
		super();
		this.myMoney = myMoney;
		this.bookCnt = bookCnt;
	}
	// toString
	@Override
	public String toString() {
		return "Student [myMoney=" + myMoney + ", bookCnt=" + bookCnt + "]";
	}
	
}

class BookSeller {
	int myMoney;
	int bookCnt;
	int price;
	
	// 판매
	public int sell(int money) {
		// 한권당 가격
		int receivedBookCnt = money/price;
		// 책 판매 후 수량
		bookCnt -= receivedBookCnt;
		// 책 판매 후 서점주인 남은 돈
		myMoney += money;
		// 구매한 책 전달
		return receivedBookCnt;
	}
	// 생성자
	public BookSeller(int myMoney, int bookCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.bookCnt = bookCnt;
		this.price = price;
	}		
	// toString
	@Override
	public String toString() {
		return "BookSeller [myMoney=" + myMoney + ", bookCnt=" + bookCnt + ", price=" + price + "]";
	}
	
	
}



public class C13Ex {

	public static void main(String[] args) {
		// 학생
		Student 학생1 = new Student(10000, 0);
		// 서점주인
		BookSeller 서점주인1 = new BookSeller(10000,10,2000);
		// 책1권 구매
		학생1.buy(서점주인1, 2000);
		
		System.out.println(학생1);
		System.out.println(서점주인1);
		
	}

}
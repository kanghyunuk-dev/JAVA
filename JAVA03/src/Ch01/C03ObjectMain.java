package Ch01;

import java.util.Objects;

class C03Simple {
	int n;
	// 모든 인자 생성자
	public C03Simple(int n) {
		super();
		this.n = n;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.n);
	}
}

public class C03ObjectMain {

	public static void main(String[] args) {
		C03Simple ob1 = new C03Simple(10);
		C03Simple ob2 = new C03Simple(20);
		C03Simple ob3 = new C03Simple(10);
		System.out.println(ob1);
		System.out.printf("%x\n",ob1.hashCode());
		System.out.printf("%x\n",ob2.hashCode());
		System.out.printf("%x\n",ob3.hashCode());
	}

}

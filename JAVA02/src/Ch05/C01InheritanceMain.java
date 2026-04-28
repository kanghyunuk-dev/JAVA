//package Ch05;
//
//class Point2D {
//	int x;
//	int y;
//	
//	// 디폴트 생성자
//	Point2D() {
//		System.out.println("Point2D 디폴트 생성자 호출!");
//	}
//	// toString() 재정의
//	@Override
//	public String toString() {
//		return "Point2D [x=" + x + ", y=" + y + "]";
//	}	
//}
//
//class Point3D extends Point2D {
//	int z;
//	Point3D() {
//		System.out.println("Point3D 디폴트생성자 호출");
//	}
//	// toString() 재정의 -> 상속관계는 부모 요소까지 추가 가능
//	@Override
//	public String toString() {
//		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
//	}
//	
//	
//}
//
//public class C01InheritanceMain {
//	public static void main(String[] args) {
//		// 부모 Point2D 공간이 먼저 만들어지고 다음 Point3D 가 만들어짐
//		Point3D ob = new Point3D();
//		ob.x = 10;
//		ob.y = 20;
//		ob.z = 30;
//		System.out.println(ob);
//	}
//
//}

class Point3 {
	int x = 10;
	int y = 20;
	
	Point3(int x, int y) {
//		생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 'super();'를 여기에 삽입한다. super()는 Point3의 조상인 Object클래스의 기본 생성자인 Object()를 의미한다.
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point3 {
	int z = 30;
	
	Point3D2() {
		this(100, 200, 300);	// Point3D2(int x, int y, int z)를 호출한다.
	}
	
	Point3D2(int x, int y, int z) {
		super(x, y);	// Point3(int x, int y)를 호출한다.
		this.z = z;
	}
}

public class PointTest2 {
	public static void main(String[] args) {
		Point3D2 p3 = new Point3D2();
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.z = " + p3.z);
	}
}
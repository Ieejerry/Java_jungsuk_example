class Car2 {}

class FireEngine2 extends Car2 {}

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine2 fe = new FireEngine2();
		
		if(fe instanceof FireEngine2) {
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car2) {
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}
		
		System.out.println(fe.getClass().getName());	// 클래스의 이름을 출력
	}
}	// class
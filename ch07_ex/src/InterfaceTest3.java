class A3 {
	void methodA() {
		I3 i = InstanceManager.getInstance();	// 제3의 클래스의 메소드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다.
		i.methodB();
		System.out.println(i.toString());	// i로 Object클래스의 메소드 호출가능
	}
}

interface I3 {
	public abstract void methodB();
}

class B3 implements I3 {
	public void methodB() {
		System.out.println("methodB in B3 class");
	}
	
	public String toString() { return "class B3"; }
}

class InstanceManager {
	public static I3 getInstance() {
		return new B3();
	}
}

public class InterfaceTest3 {
	public static void main(String[] args) {
		A3 a3 = new A3();
		a3.methodA();
	}
}
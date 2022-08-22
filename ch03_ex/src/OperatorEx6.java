
public class OperatorEx6 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
//		byte c = a + b;	// 명시적으로 형변환이 필요하다.
		byte c = (byte)(a + b);
		System.out.println(c);
	}

}

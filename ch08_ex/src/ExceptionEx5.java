public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);	// 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
			System.out.println();	// 실행되지 않는다.
		} catch (Exception e) {
			System.out.println(5);
		}	// try-catch의 끝
		System.out.println(6);
	}	// main의 끝
}
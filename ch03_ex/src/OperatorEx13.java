
public class OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';
		
//		char c2 = c1 + 1;	// 라인 7 : 컴파일 에러발생
		char c2 = 'a' + 1;	// 라인 8 : 컴파일 에러없음
		
		System.out.println(c2);
	}

}

public class ThreadEx21 {
	public static void main(String[] args) {
		Runnable r = new RunnableEx21();
		new Thread(r).start();	// ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		new Thread(r).start();	// ThreadGroup에 의해 참조되므로 gc대상이 아니다.
	}
}

class RunnableEx21 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금(withDraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}	// run()
}
interface Movable {
	/* 지정된 위치(x, y)로 이동하는 기능의 메소드 */
	void move(int x, int y);
}

interface Attackable {
	/* 지정된 대상(u)을 공격하는 기능의 메소드 */
	void attack(Unit u);
}

interface Fightable extends Movable, Attackable { }

class Unit {
	int currentHP;	// 유닛의 체력
	int x;	// 유닛의 위치(x좌표)
	int y;	// 유닛의 위치(y좌표)
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) { /* 내용 생략 */ }
	public void attack(Unit u) { /* 내용 생략 */ }
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손입니다.");
		}
		
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		}
		
		if(f instanceof Movable) {
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		}
		
		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자손입니다.");
		}
		
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		}
	}
}
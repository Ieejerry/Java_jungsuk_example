interface Repairable {}

class Unit2 {
	int hitPoint;
	final int MAX_HP;
	
	Unit2(int hp) {
		MAX_HP = hp;
	}
	// ...
}

class GroundUnit extends Unit2 {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit2 {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);	// Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
	// ...
}

class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(125);	// DropShip의 HP는 125이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "DropShip";
	}
	// ...
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	// ...
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);	// Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit2) {
			Unit2 u = (Unit2)r;
			while(u.hitPoint != u.MAX_HP) {
				/* Unit의 HP를 증가시킨다. */
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
	// ...
}

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropShip = new DropShip();
		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank);	// SCV가 Tank를 수리하도록 한다.
		scv.repair(dropShip);
//		scv.repair(marine);	// 에러. repair(Repairable) in SCV cannot be applied to (Marine) 
	}
}
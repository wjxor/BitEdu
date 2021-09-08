package Quiz;

public class GameCharacter_Main {

	public static void main(String[] args) {
		// 무기는 활, 공격력 100, 화살갯수 100
		Archer archer = new Archer("활", 100, 100);
		archer.attack();
		archer.reload(100);

		// 무기는 검, 공격력 100, 방패내구도 100
		Warrior2 warrior = new Warrior2("검", 100, 100);
		warrior.taunt();
		warrior.attack();
		warrior.guard();

	}

}

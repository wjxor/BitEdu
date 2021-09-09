package Quiz;

public class GameCharacter {
	String weapon;
	int damage;

	GameCharacter() {

	}

	GameCharacter(String weapon, int damage) {
		this.weapon = weapon;
		this.damage = damage;
	}

	public void attack() {
		System.out.println("캐릭터가 공격합니다.");
	}
}

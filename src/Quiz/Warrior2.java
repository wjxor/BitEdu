package Quiz;

public class Warrior2 extends GameCharacter {
	// 방패 내구도
	int Shield;

	public Warrior2(String weapon, int damage, int Shield) {
		super(weapon, damage);
		this.Shield = Shield;
	}

	public void taunt() {
		System.out.println("적을 도발합니다.");
	}

	@Override
	public void attack() {
		System.out.println("검으로 공격합니다.");
	}

	public void guard() {
		System.out.println("공격을 막습니다.");
		Shield -= 10;
		System.out.println("현재 방패내구도 : " + Shield);
	}

}

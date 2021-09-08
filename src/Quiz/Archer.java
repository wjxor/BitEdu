package Quiz;

public class Archer extends GameCharacter {
	// 화살갯수
	int arrow_count;

	Archer(String weapon, int damage, int arrow_count) {
		super();
		this.arrow_count = arrow_count;

	}

	public void evasion() {
		System.out.println("캐릭터가 회피합니다.");
	}

	@Override
	public void attack() {
		System.out.println("활을 쏩니다.");
		arrow_count--;
		System.out.println("남은 화살갯수 : " + arrow_count);
	}

	public void reload(int cnt) {
		arrow_count += cnt;
		System.out.println("남은 화살갯수 : " + arrow_count);
	}

}

package Quiz;

public class Warrior {
	// 클래스 만들어라
	// 게임캐릭터
	// 클래스 이름 자유롭게
	// 필드 - 힘, 덱스(민첩성), 인트(지능), 럭
	// 생성자 - 4개 입력받아서 필드의 값을 저장
	// 메서드 - 어택(공격)메서드 - 출력을 공격력 : 힘+덱스+인트+럭
	public int Power;
	public int Dex;
	public int Intelli;
	public int Luck;

	Warrior() {

	}

	Warrior(int Power, int Dex, int Intelli, int Luck) {
		this.Power = Power;
		this.Dex = Dex;
		this.Intelli = Intelli;
		this.Luck = Luck;
	}

	public void Attack() {
		System.out.println(Power + Dex + Intelli + Luck);
	}
}

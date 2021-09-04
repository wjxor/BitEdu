package Quiz;

public class Quiz_09_03_1 {

	// Song 이름을 가진 클래스
	// 필드 -> name, Singer, Play Count, Rank

	// 생성자 - 4개의 필드를 저장해주는 메소드
	// Play ---> "라라라라" 재생횟수를 +1 재생횟수를 출력
	// RankUp --> 순위 -1 순위출력 5등이상이면 분발하세요 출력
	// Rankdown --> 순위 +1 순위출력 5등이상이면 분발하세요 출력
	// print ---> 노래제목 : 가수 : 재생횟수 : 순위 :
	public static void main(String[] args) {
		Song song1 = new Song("돌핀", "오마이걸", 0, 2);
		song1.Play();
		song1.RankUp();
		song1.RankDown();
		song1.print();
	}
}

class Song {
	public String Name;
	public String Singer;
	public int Play_Count;
	public int Rank;

	Song(String Name, String Singer, int Play_Count, int Rank) {
		this.Name = Name;
		this.Singer = Singer;
		this.Play_Count = Play_Count;
		this.Rank = Rank;
	}

	public void Play() {
		System.out.println("라라라라");
		Play_Count++;
		System.out.println("재생횟수 : " + Play_Count);
	}

	public void RankUp() {
		Rank--;
		System.out.println("순위 : " + Rank);

		if (Rank <= 3) {
			System.out.println("잘하셨습니다.");
		}
	}

	public void RankDown() {
		Rank++;
		System.out.println("순위 : " + Rank);

		if (Rank >= 5) {
			System.out.println("분발하세요");
		}
	}

	public void print() {
		System.out.println("노래제목 : " + Name + " /가수 : " + Singer + " /재생횟수 : " + Play_Count + " /순위 : " + Rank);
	}

}

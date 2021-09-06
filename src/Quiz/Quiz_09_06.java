package Quiz;

public class Quiz_09_06 {

	public static void main(String[] args) {
		TV LG_TV = new TV(10, 10, "LGTV");

		for (int i = 0; i < 20; i++) {
			LG_TV.VolDown();
			LG_TV.ChDown();

		}

		LG_TV.VolUp();
		LG_TV.VolUp();
		LG_TV.VolUp();
		LG_TV.ChUp();
		LG_TV.ChUp();
		LG_TV.ChUp();
		LG_TV.print();

	}

}

// TV
// 필드 - vol 볼륨, ch 채널, model 모델
// 생성자(매개변수3) -> 필드의 값을 저장하는 생성자
// 메서드
// VolUp 소리++ 볼륨사이즈 출력 (조건 : 100이상이면 최대 볼륨입니다. vol --> 100)
// VolDown 소리 -- 볼륨사이즈 출력 (조건 : 0이하면 이미 최소볼륨입니다. vol--> 0)
// ChUp 채널++ 채널 출력
// ChDown 채널-- 채널 출력 (조건 : 0이하면 이미 낮을 채널입니다. ch -> 0)
// print -> 볼륨, 채널, 모델
class TV {
	int vol;
	int ch;
	String model;

	TV(int vol, int ch, String model) {
		this.vol = vol;
		this.ch = ch;
		this.model = model;
	}

	public void ChUp() {
		ch++;

		System.out.println("채널 : " + ch);
	}

	public void ChDown() {

		if (ch <= 0) {
			System.out.println("이미 낮은 채널입니다.");
			ch = 0;
		} else {
			ch--;
		}

		System.out.println("채널 ; " + ch);
	}

	public void VolUp() {

		if (vol >= 100) {
			System.out.println("이미 최대볼륨입니다.");
			vol = 100;
		} else {
			vol++;
		}

		System.out.println("볼륨 : " + vol);
	}

	public void VolDown() {

		if (vol <= 0) {
			System.out.println("이미 최소볼륨입니다.");
			vol = 0;
		} else {
			vol--;
		}

		System.out.println("볼륨 : " + vol);
	}

	public void print() {
		System.out.println("볼륨 : " + vol + "/채널 : " + ch + "/모델 : " + model);
	}

}
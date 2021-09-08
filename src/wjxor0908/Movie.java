package wjxor0908;

// 필드 : 이름, 상영시간, 상영관
// 생성자 : 기본생성자, 매개변수3개로 필드 저장하는 생성자
// 메서드 :
// 영화안내 movie_notice() - 출력 : 이름의 영화가 상영관에서 상영시간에 시작합니다.
// 영화시작 movie_start() - 출력 : 이름의 영화가 시작합니다.
// 영화 끝 movie_end() - 출력 : 이름의 영화가 끝났습니다.
public class Movie {
	public String name;
	public String play_time;
	public String theater;

	Movie() {

	}

	public Movie(String name, String play_time, String theater) {
		this.name = name;
		this.play_time = play_time;
		this.theater = theater;
	}

	public void movie_notice() {
		System.out.println(name + "의 영화가 " + theater + "에서 " + play_time + "에 시작합니다.");
	}

	public void movie_start() {
		System.out.println(name + "의 영화가 시작합니다.");
	}

	public void movie_end() {
		System.out.println(name + "의 영화가 끝났습니다.");
	}
}

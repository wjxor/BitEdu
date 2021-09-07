package ex09_07;

public class sec12 {

	public static void main(String[] args) {
		Week today = Week.FRIDAY;
		System.out.println(today);

		// name() 메서드
		String name = today.name();
		System.out.println(name);

		int ordinal = today.ordinal();
		System.out.println(ordinal);

		// compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);

		Week weekDay = Week.valueOf("SATURDAY");
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말 이군요");
		} else {
			System.out.println("평일 이군요");
		}

		// values() 메서드
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
	}

}

enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
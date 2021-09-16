package ex09_16;

public class Sec16 {
	public static void main(String[] args) {
		int count = 0;
		int flag = 1;

		int line = 5;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 5 / 2 + count; j++) {
				if (j < line / 2 - count) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

			if (i == (line / 2)) {
				flag *= -1;
			}
			count += flag;
		}

	}
}

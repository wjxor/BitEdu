import java.util.Scanner;

// 두 수를 입력받아 큰값을 반환
public class test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int bigNum = (num1 > num2) ? num1 : num2;

		System.out.println(bigNum);

	}

}

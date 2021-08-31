import java.util.Scanner;

//세 수를 입력받아 큰값을 반환
public class test3 {

	public static void main(String[] args) {
		int num1, num2, num3;
		int result1;

		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		result1 = (num1 > num2) ? num1 : num2;

		int result2 = num3 > result1 ? num3 : result1;

		System.out.println(result2);

	}

}

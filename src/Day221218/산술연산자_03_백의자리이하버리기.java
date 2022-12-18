package Day221218;

import java.util.Scanner;

public class 산술연산자_03_백의자리이하버리기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = (num / 100) * 100;
		System.out.println("몫으로 구하기 = " + num1);
		int num2 = num - (num % 100);
		System.out.println("나머지로 구하기 = " + num2);
	}

}

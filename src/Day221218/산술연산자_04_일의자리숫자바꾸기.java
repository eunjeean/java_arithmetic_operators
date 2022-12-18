package Day221218;

import java.util.Scanner;

public class 산술연산자_04_일의자리숫자바꾸기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리숫자를 입력하시오");
		int num = sc.nextInt();
		int num1 = (num/10)*10;
		System.out.println(num1+1);
		
	}

}

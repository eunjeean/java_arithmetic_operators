package Day221218;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// scanner 선언
		Scanner scan = new Scanner(System.in);
		
		// 숫자형
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num1 + num2);
		
		// 문자형
		String name = scan.next();
		System.out.println("제 이름은 " + name + "입니다!");
	}

}

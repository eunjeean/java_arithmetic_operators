package Day221218;

import java.util.Scanner;

public class ���������_03_�����ڸ����Ϲ����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = (num / 100) * 100;
		System.out.println("������ ���ϱ� = " + num1);
		int num2 = num - (num % 100);
		System.out.println("�������� ���ϱ� = " + num2);
	}

}

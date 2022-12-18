package Day221218;

public class 산술연산자_02_귤나누기 {

	public static void main(String[] args) {
		// 3729개의 귤을 52개씩 박스에 담아서 나눠주려고한다
		// 이 때 필요한 박스의 개수는?

		int orange = 3729;
		int num = 52;
		int num1 = (orange / num);
		int num2 = orange % num;
		int box = 0;

		// if문으로 풀기
		if (num2 > 0) { // 소수값이 있을 때만 1개의 박스가 더 필요함
			box = num1 + 1;
		}

		// 삼항 연산자로 풀기
		// box = num2 == 0 ? num1 : num1 + 1;

		System.out.println(box);

	}

}

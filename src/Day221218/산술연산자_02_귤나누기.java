package Day221218;

public class ���������_02_�ֳ����� {

	public static void main(String[] args) {
		// 3729���� ���� 52���� �ڽ��� ��Ƽ� �����ַ����Ѵ�
		// �� �� �ʿ��� �ڽ��� ������?

		int orange = 3729;
		int num = 52;
		int num1 = (orange / num);
		int num2 = orange % num;
		int box = 0;

		// if������ Ǯ��
		if (num2 > 0) { // �Ҽ����� ���� ���� 1���� �ڽ��� �� �ʿ���
			box = num1 + 1;
		}

		// ���� �����ڷ� Ǯ��
		// box = num2 == 0 ? num1 : num1 + 1;

		System.out.println(box);

	}

}

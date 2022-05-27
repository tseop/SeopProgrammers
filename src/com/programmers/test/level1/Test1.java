package com.programmers.test.level1;

/**
 * �ű� ���̵� ��õ https://programmers.co.kr/learn/courses/30/lessons/72410
 */
public class Test1 {
	public static void main(String[] args) {
		Test1 sample = new Test1();
		sample.solution("=.=");
	}

	public String solution(String new_id) {
		String answer = "";

		// step 1
		// �빮�ڸ� �ҹ��ڷ� ġȯ
		new_id = new_id.toLowerCase();

		// step 2
		// new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		char[] idArr = new_id.toCharArray();

		for (char data : idArr) {
			if (('a' <= data && data <= 'z') || ('0' <= data && data <= '9') || data == '-' || data == '_'
					|| data == '.') {
				answer = answer + data;
			}
		}

		// step 3
		// 2�� �̻��� ��ħǥ�� �ִٸ� 1���� ġȯ�Ѵ�.
		while (answer.contains("..")) {
			answer = answer.replace("..", ".");

		}

		// step 4
		// �Ǿ��� .�̰ų� �� �ڰ� . �̸� ����
		if (answer.startsWith(".")) { // �� ���� . �̸�
			answer = answer.substring(1);
		}

		if (answer.endsWith(".")) { // �� �ڰ� . �̸�
			answer = answer.substring(0, answer.length() - 1);
		}

		// step 5
		// �� ���ڿ��̸� a�� �ִ´�.
		if (answer.isEmpty()) {
			answer = "a";
		}

		// step 6
		// 16�� �̻��̸� ù 15���� �����ϰ� �����Ѵ�. �׸��� �������� .�̸� �����Ѵ�.
		if (answer.length() > 15) {
			answer = answer.substring(0, 15);

			if (answer.endsWith(".")) { // �� �ڰ� . �̸�
				answer = answer.substring(0, answer.length() - 1);
			}
		}

		// step 7
		// new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
		if (answer.length() < 3) {
			char[] arr = answer.toCharArray();
			for (int i = 0; i < 3 - (arr.length); i++)
				answer = answer + arr[arr.length - 1];
		}

		return answer;
	}

}

package com.programmers.test.level1;

// ���� ���� ���ϱ�  https://programmers.co.kr/learn/courses/30/lessons/86051
public class ����_����_���ϱ� {
	public static void main(String[] args) {
		����_����_���ϱ� test = new ����_����_���ϱ�();

		int[] test1 = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int[] test2 = { 5, 8, 4, 0, 6, 7, 9 };

		System.out.println(test.solution(test1));
		System.out.println(test.solution(test2));
	}

	public int solution(int[] numbers) {
		int answer = 0;
		int[] checkNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < checkNum.length; j++) {
				if (checkNum[j] == numbers[i]) {
					checkNum[j] = 0;
				}
			}
		}

		for (int i = 0; i < checkNum.length; i++) {
			answer += checkNum[i];
		}

		return answer;
	}
}

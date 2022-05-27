package com.programmers.test.level1;

public class Test3 {
	public static void main(String[] args) {
		Test3 test = new Test3();

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

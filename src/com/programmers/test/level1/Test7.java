package com.programmers.test.level1;

public class Test7 {
	public static void main(String[] args) {
		Test7 test = new Test7();
		System.out.println(test.solution(3));
		System.out.println(test.solution(4));

	}

	public String solution(int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "¼ö";
			} else {
				answer += "¹Ú";
			}

		}
		return answer;
	}
}

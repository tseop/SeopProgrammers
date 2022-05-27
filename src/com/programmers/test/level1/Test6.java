package com.programmers.test.level1;

public class Test6 {
	public static void main(String[] args) {
		Test6 test = new Test6();
		String[] seoul = { "Jane", "Kim" };

		String result = test.solution(seoul);
		System.out.println(result);
	}

	public String solution(String[] seoul) {
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}
		return answer;
	}
}

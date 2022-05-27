package com.programmers.test.level1;

/**
 * 신규 아이디 추천 https://programmers.co.kr/learn/courses/30/lessons/72410
 */
public class Test1 {
	public static void main(String[] args) {
		Test1 sample = new Test1();
		sample.solution("=.=");
	}

	public String solution(String new_id) {
		String answer = "";

		// step 1
		// 대문자를 소문자로 치환
		new_id = new_id.toLowerCase();

		// step 2
		// new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		char[] idArr = new_id.toCharArray();

		for (char data : idArr) {
			if (('a' <= data && data <= 'z') || ('0' <= data && data <= '9') || data == '-' || data == '_'
					|| data == '.') {
				answer = answer + data;
			}
		}

		// step 3
		// 2번 이상의 마침표가 있다면 1개로 치환한다.
		while (answer.contains("..")) {
			answer = answer.replace("..", ".");

		}

		// step 4
		// 맨앞이 .이거나 맨 뒤가 . 이면 제거
		if (answer.startsWith(".")) { // 맨 앞이 . 이면
			answer = answer.substring(1);
		}

		if (answer.endsWith(".")) { // 맨 뒤가 . 이면
			answer = answer.substring(0, answer.length() - 1);
		}

		// step 5
		// 빈 문자열이면 a를 넣는다.
		if (answer.isEmpty()) {
			answer = "a";
		}

		// step 6
		// 16자 이상이면 첫 15개를 제외하고 삭제한다. 그리고 마지막이 .이면 제거한다.
		if (answer.length() > 15) {
			answer = answer.substring(0, 15);

			if (answer.endsWith(".")) { // 맨 뒤가 . 이면
				answer = answer.substring(0, answer.length() - 1);
			}
		}

		// step 7
		// new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		if (answer.length() < 3) {
			char[] arr = answer.toCharArray();
			for (int i = 0; i < 3 - (arr.length); i++)
				answer = answer + arr[arr.length - 1];
		}

		return answer;
	}

}

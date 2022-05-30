package com.programmers.test.level1;

// 수박수박 https://programmers.co.kr/learn/courses/30/lessons/12922
public class 수박수박 {
	public static void main(String[] args) {
		수박수박 test = new 수박수박();
		System.out.println(test.solution(3));
		System.out.println(test.solution(4));

	}

	public String solution(int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "수";
			} else {
				answer += "박";
			}

		}
		return answer;
	}
}

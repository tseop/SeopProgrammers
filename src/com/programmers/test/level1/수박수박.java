package com.programmers.test.level1;

// ���ڼ��� https://programmers.co.kr/learn/courses/30/lessons/12922
public class ���ڼ��� {
	public static void main(String[] args) {
		���ڼ��� test = new ���ڼ���();
		System.out.println(test.solution(3));
		System.out.println(test.solution(4));

	}

	public String solution(int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "��";
			} else {
				answer += "��";
			}

		}
		return answer;
	}
}

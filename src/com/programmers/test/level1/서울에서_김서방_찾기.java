package com.programmers.test.level1;

// ���￡�� �輭�� ã�� https://programmers.co.kr/learn/courses/30/lessons/12919
public class ���￡��_�輭��_ã�� {
	public static void main(String[] args) {
		���￡��_�輭��_ã�� test = new ���￡��_�輭��_ã��();
		String[] seoul = { "Jane", "Kim" };

		String result = test.solution(seoul);
		System.out.println(result);
	}

	public String solution(String[] seoul) {
		String answer = "";

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "�輭���� " + i + "�� �ִ�";
				break;
			}
		}
		return answer;
	}
}

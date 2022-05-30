package com.programmers.test.level1;

// 서울에서 김서방 찾기 https://programmers.co.kr/learn/courses/30/lessons/12919
public class 서울에서_김서방_찾기 {
	public static void main(String[] args) {
		서울에서_김서방_찾기 test = new 서울에서_김서방_찾기();
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

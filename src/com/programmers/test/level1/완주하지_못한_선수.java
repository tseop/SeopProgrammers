package com.programmers.test.level1;

import java.util.HashMap;

// 완주하지 못한 선수  https://programmers.co.kr/learn/courses/30/lessons/42576
public class 완주하지_못한_선수 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < participant.length; i++) {
			if (map.get(participant[i]) == null) {
				map.put(participant[i], 1);
			} else {
				map.put(participant[i], map.get(participant[i]) + 1);
			}
		}

		for (int i = 0; i < completion.length; i++) {
			if (map.get(completion[i]) != null) {
				map.put(completion[i], map.get(completion[i]) - 1);
			}
		}

		for (int i = 0; i < participant.length; i++) {
			if (map.get(participant[i]) >= 1) {
				answer = participant[i];
			}
		}
		return answer;
	}
}

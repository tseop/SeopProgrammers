package com.programmers.test.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// 신고 결과 받기  https://programmers.co.kr/learn/courses/30/lessons/92334
public class 신고_결과_받기 {
	public static void main(String[] args) {
		신고_결과_받기 test = new 신고_결과_받기();

		String[] test1 = { "leo", "kiki", "eden" };
		String[] test2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] test3 = { "mislav", "stanko", "mislav", "ana" };

		String[] sample1 = { "eden", "kiki" };
		String[] sample2 = { "josipa", "filipa", "marina", "nikola" };
		String[] sample3 = { "stanko", "ana", "mislav" };

		System.out.println(test.solution4(test1, sample1));
		System.out.println(test.solution4(test2, sample2));
		System.out.println(test.solution4(test3, sample3));
	}

	public String solution(String[] participant, String[] completion) {
		String answer = "";

		for (int i = 0; i < participant.length; i++) {
			for (int j = 0; j < completion.length; j++) {
				if (participant[i].equals(completion[j])) {
					participant[i] = "";
					completion[j] = "";
				}
			}
		}

		for (int i = 0; i < participant.length; i++) {
			if (participant[i] != "") {
				answer = participant[i];
			}
		}

		return answer;
	}

	public String solution2(String[] participant, String[] completion) {
		String answer = "";

		HashSet<String> list = new HashSet<>();

		for (int i = 0; i < participant.length; i++) {
			if (!list.add(participant[i])) {
				return participant[i];
			}
		}
		for (int i = 0; i < completion.length; i++) {
			if (list.contains(completion[i])) {
				list.remove(completion[i]);
			}
		}

		for (String data : list) {
			answer = data;
		}
		return answer;
	}

	public String solution3(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++)
			if (!participant[i].equals(completion[i]))
				return participant[i];
		return participant[participant.length - 1];

	}

	public String solution4(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < participant.length; i++) {
			if (map.containsKey(participant[i])) {
				map.put(participant[i], map.get(participant[i]) + 1);
			} else {
				map.put(participant[i], 1);
			}
		}

		for (int i = 0; i < completion.length; i++) {
			if (map.containsKey(completion[i])) {
				map.put(completion[i], map.get(completion[i]) - 1);
			}
		}

		for (int i = 0; i < participant.length; i++) {
			if (map.get(participant[i]) >= 1) {
				answer = participant[i];
				break;
			}
		}

		return answer;
	}
}

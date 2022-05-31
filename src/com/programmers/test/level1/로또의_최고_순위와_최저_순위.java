package com.programmers.test.level1;

//로또의 최고 순위와 최저 순위 https://programmers.co.kr/learn/courses/30/lessons/77484
public class 로또의_최고_순위와_최저_순위 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int count = 0, zeroCheck = 0;

		for (int i = 0; i < lottos.length; i++) {

			if (lottos[i] == 0) {
				zeroCheck++;
				continue;
			}

			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					count++;
				}
			}
		}

		for (int i = 1; i >= 0; i--) {
			for (int j = 0; j < 6; j++) {
				if (count == 6) {
					answer[i] = 1;
				} else if (count == 5) {
					answer[i] = 2;
				} else if (count == 4) {
					answer[i] = 3;
				} else if (count == 3) {
					answer[i] = 4;
				} else if (count == 2) {
					answer[i] = 5;
				} else {
					answer[i] = 6;
				}
			}
			count += zeroCheck;
		}

		return answer;
	}
}

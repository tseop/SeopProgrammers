package com.programmers.test.level1;

import java.util.Arrays;

public class Test5 {
	public static void main(String[] args) {
		Test5 test = new Test5();
		int result;

		int n1 = 5;
		int[] lost1 = { 2, 4 };
		int[] reserve1 = { 1, 3, 5 };

		int n2 = 5;
		int[] lost2 = { 2, 4 };
		int[] reserve2 = { 3 };

		int n3 = 3;
		int[] lost3 = { 3 };
		int[] reserve3 = { 1 };

		int n4 = 4;
		int[] lost4 = { 1, 4 };
		int[] reserve4 = { 4 };

		int n5 = 30;
		int[] lost5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30 };
		int[] reserve5 = { 29 };

		System.out.println("[no 1 result : " + test.solution(n1, lost1, reserve1) + "]\n\n");

		System.out.println("[no 2 result : " + test.solution(n2, lost2, reserve2) + "]\n\n");

		System.out.println("[no 3 result : " + test.solution(n3, lost3, reserve3) + "]\n\n");

		System.out.println("[no 4 result : " + test.solution(n4, lost4, reserve4) + "]\n\n");
		System.out.println("[no 5 result : " + test.solution(n5, lost5, reserve5) + "]\n\n");
	}

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;

		Arrays.sort(lost);
		Arrays.sort(reserve);

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}
		return answer;
	}
}

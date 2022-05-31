package com.programmers.test.level1;

import java.util.Arrays;

// 제일 작은 수 제거하기 https://programmers.co.kr/learn/courses/30/lessons/12935
public class 제일_작은_수_제거하기 {
	public static void main(String[] args) {
		제일_작은_수_제거하기 test = new 제일_작은_수_제거하기();
		int[] arr = { 4, 3, 2, 1 };
		int[] result = test.solution(arr);

		for (int data : result)
			System.out.print(data + " ");
		System.out.println();

	}

	public int[] solution(int[] arr) {
		int[] answer;
		boolean check = false;
		if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		int[] arrClone = arr.clone();
		Arrays.sort(arrClone);
		answer = new int[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arrClone[0]) {
				check = true;
				continue;
			}

			if (check) {
				answer[i - 1] = arr[i];
			} else {
				answer[i] = arr[i];
			}
		}

		return answer;
	}
}

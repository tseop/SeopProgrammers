package com.programmers.test.level1;

import java.util.Arrays;

// ���� ���� �� �����ϱ� https://programmers.co.kr/learn/courses/30/lessons/12935
public class ����_����_��_�����ϱ� {
	public static void main(String[] args) {
		����_����_��_�����ϱ� test = new ����_����_��_�����ϱ�();
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

package com.programmers.test.level1;

import java.util.Arrays;
import java.util.Collections;

/*
 * ���ڿ� ������������ ��ġ�ϱ� https://programmers.co.kr/learn/courses/30/lessons/12917
 */
public class ���ڿ�_������������_��ġ�ϱ� {
	public static void main(String[] args) {
		���ڿ�_������������_��ġ�ϱ� test = new ���ڿ�_������������_��ġ�ϱ�();
		System.out.println(test.solution2("Zbcdefg"));
	}

	public String solution(String s) {

		char[] arr = s.toCharArray();
		int[] arrInt = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			arrInt[i] = (int) arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arrInt[i]);
		}
		return new String(arr);
	}

	public String solution2(String s) {
		String[] arr = s.split("");
		String answer = "";
		Arrays.sort(arr, Collections.reverseOrder());
		for (String data : arr)
			answer += data;
		return answer;
	}
}

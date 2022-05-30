package com.programmers.test.level1;

import java.util.Arrays;
import java.util.Collections;

/*
 * 문자열 내림차순으로 배치하기 https://programmers.co.kr/learn/courses/30/lessons/12917
 */
public class 문자열_내림차순으로_배치하기 {
	public static void main(String[] args) {
		문자열_내림차순으로_배치하기 test = new 문자열_내림차순으로_배치하기();
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

package com.programmers.test.level1;

// 숫자 문자열과 영단어 https://programmers.co.kr/learn/courses/30/lessons/81301
public class 숫자_문자열과_영단어 {
	public int solution(String s) {
		int answer = 0;

		if (s == null) {
			return 0;
		}

		String[] str = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < str.length; i++)
			s = s.replace(str[i], Integer.toString(i));

		answer = Integer.parseInt(s);

		return answer;
	}
}

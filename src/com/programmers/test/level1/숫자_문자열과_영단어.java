package com.programmers.test.level1;

// ���� ���ڿ��� ���ܾ� https://programmers.co.kr/learn/courses/30/lessons/81301
public class ����_���ڿ���_���ܾ� {
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

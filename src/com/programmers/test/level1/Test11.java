package com.programmers.test.level1;

public class Test11 {
	public static void main(String[] args) {
		Test11 test = new Test11();
		System.out.println(test.solution("01033334444"));
		System.out.println(test.solution("027778888"));
	}

	public String solution(String phone_number) {
		byte[] result = phone_number.getBytes();

		for (int i = 0; i < result.length - 4; i++) {
			result[i] = '*';
		}

		return new String(result);
	}
}

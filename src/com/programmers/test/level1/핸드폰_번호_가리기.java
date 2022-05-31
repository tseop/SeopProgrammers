package com.programmers.test.level1;

// 핸드폰 번호 가리기  https://programmers.co.kr/learn/courses/30/lessons/12948
public class 핸드폰_번호_가리기 {
	public static void main(String[] args) {
		핸드폰_번호_가리기 test = new 핸드폰_번호_가리기();
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

package com.programmers.test.level1;

// �ڵ��� ��ȣ ������  https://programmers.co.kr/learn/courses/30/lessons/12948
public class �ڵ���_��ȣ_������ {
	public static void main(String[] args) {
		�ڵ���_��ȣ_������ test = new �ڵ���_��ȣ_������();
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

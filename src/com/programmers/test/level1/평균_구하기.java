package com.programmers.test.level1;

// ��� ���ϱ� https://programmers.co.kr/learn/courses/30/lessons/12944
public class ���_���ϱ� {
	public static void main(String[] args) {
		���_���ϱ� test = new ���_���ϱ�();
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(test.solution(arr));
	}

	public double solution(int[] arr) {
		double answer = 0;
		for (int temp : arr) {
			answer += temp;
		}
		return answer / arr.length;
	}
}

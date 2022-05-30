package com.programmers.test.level1;

// x��ŭ ������ �ִ� n���� ����  https://programmers.co.kr/learn/courses/30/lessons/12954
public class x��ŭ_������_�ִ�_n����_���� {

	public static void main(String[] args) {
		x��ŭ_������_�ִ�_n����_���� test = new x��ŭ_������_�ִ�_n����_����();

		long[] result1 = test.solution(2, 5);

		for (long temp : result1) {
			System.out.print(temp + " ");
		}

		System.out.println();
		long[] result2 = test.solution(4, 3);

		for (long temp : result2) {
			System.out.print(temp + " ");
		}

		System.out.println();
		long[] result3 = test.solution(-4, 2);

		for (long temp : result3) {
			System.out.print(temp + " ");
		}

		System.out.println();
		long[] result4 = test.solution(10000000, 1000);

		for (long temp : result4) {
			System.out.print(temp + " ");
		}

	}

	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		answer[0] = x;
		for (int i = 1; i < n; i++) {
			x += answer[0];
			answer[i] = x;
		}
		return answer;
	}
}

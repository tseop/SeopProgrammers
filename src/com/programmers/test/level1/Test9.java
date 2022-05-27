package com.programmers.test.level1;

public class Test9 {

	public static void main(String[] args) {
		Test9 test = new Test9();

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

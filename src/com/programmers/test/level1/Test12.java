package com.programmers.test.level1;

public class Test12 {
	public static void main(String[] args) {
		Test12 test = new Test12();
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

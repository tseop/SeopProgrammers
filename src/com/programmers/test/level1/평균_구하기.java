package com.programmers.test.level1;

// Æò±Õ ±¸ÇÏ±â https://programmers.co.kr/learn/courses/30/lessons/12944
public class Æò±Õ_±¸ÇÏ±â {
	public static void main(String[] args) {
		Æò±Õ_±¸ÇÏ±â test = new Æò±Õ_±¸ÇÏ±â();
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

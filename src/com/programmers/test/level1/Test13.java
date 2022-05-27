package com.programmers.test.level1;

public class Test13 {
	public static void main(String[] args) {
		Test13 test = new Test13();

		System.out.println(test.solution2(98596));
	}

	public boolean solution(int x) {

		return (x % ((x / 10) + (x % 10)) == 0) ? true : false;
	}

	public boolean solution2(int x) {
		int sum = 0;
		while (x > 0) {
			sum += x % 10;
			x /= 10;
		}

		return x % sum == 0 ? true : false;
	}
}

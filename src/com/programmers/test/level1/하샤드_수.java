package com.programmers.test.level1;

// ÇÏ»şµå ¼ö  https://programmers.co.kr/learn/courses/30/lessons/12947
public class ÇÏ»şµå_¼ö {
	public static void main(String[] args) {
		ÇÏ»şµå_¼ö test = new ÇÏ»şµå_¼ö();

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

package com.programmers.test.level1;

// �ϻ��� ��  https://programmers.co.kr/learn/courses/30/lessons/12947
public class �ϻ���_�� {
	public static void main(String[] args) {
		�ϻ���_�� test = new �ϻ���_��();

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

package com.programmers.test.level1;

// 시저 암호  https://programmers.co.kr/learn/courses/30/lessons/12926
public class 시저_암호 {
	// 대문자 A ~ Z : 65 ~90
	// 소문자 a ~ z : 97 ~ 122
	public static void main(String[] args) {
		시저_암호 test = new 시저_암호();

		test.printUnicode(" ");
		test.printUnicode("A");
		test.printUnicode("Z");
		test.printUnicode("a");
		test.printUnicode("z");
		test.printUnicode("{");

		test.solution("A", 1);
		System.out.println(test.solution("AB", 1)); // BC
		System.out.println(test.solution("z", 1)); // a
		System.out.println(test.solution("a B z", 4)); // e F d

	}

//	System.out.println("charArr : " + (charArr[0] + 1));
//	System.out.println((char) 66);

	public String solution(String s, int n) {
		char[] charArr = s.toCharArray();
		String answer = "";

		for (int i = 0; i < charArr.length; i++) { // 띄어쓰기
			if (charArr[i] == 32) {
				answer += (char) charArr[i];
				continue;
			}

			if (65 <= charArr[i] && charArr[i] + n <= 90) { // 대문자
				answer += (char) (charArr[i] + n);

			} else if (97 <= charArr[i] && charArr[i] + n <= 122) { // 소문자
				answer += (char) (charArr[i] + n);

			} else {
				answer += (char) ((charArr[i] + n) - 26);
			}

		}

		return answer;
	}

	public void printUnicode(String code) {
		char check = code.charAt(0);
		System.out.println(code + " " + (int) check);
	}

}

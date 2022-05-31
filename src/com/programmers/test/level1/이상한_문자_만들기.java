package com.programmers.test.level1;

/*
 * 이상한 문자 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 */
public class 이상한_문자_만들기 {

	public static void main(String[] args) {
		이상한_문자_만들기 test = new 이상한_문자_만들기();
		System.out.println(test.solution("try hello world"));
		System.out.println(test.solution("QWDQWDf      qw fwq fwqfqwfew f wef fw fwe fqwef f fqwef "));
	}

	public String solution(String s) {
		char[] answerArr = s.toCharArray();
		int count = 0;
		for (int i = 0; i < answerArr.length; i++) {
			if (answerArr[i] == ' ') {
				count = 0;
				continue;
			}

			if (count % 2 == 0) {
				answerArr[i] = Character.toUpperCase(answerArr[i]);
			} else {
				answerArr[i] = Character.toLowerCase(answerArr[i]);
			}
			count++;

		}
		return new String(answerArr);
	}
}

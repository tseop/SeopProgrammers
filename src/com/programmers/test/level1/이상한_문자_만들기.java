package com.programmers.test.level1;

/*
 * �̻��� ���� �����
 * https://programmers.co.kr/learn/courses/30/lessons/12930
 */
public class �̻���_����_����� {

	public static void main(String[] args) {
		�̻���_����_����� test = new �̻���_����_�����();
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

package com.programmers.test.level1;

import java.util.ArrayList;
import java.util.Stack;

// ũ���� �����̱� ����  https://programmers.co.kr/learn/courses/30/lessons/64061
public class ũ����_�����̱�_���� {
	public static void main(String[] args) {
		ũ����_�����̱�_���� test = new ũ����_�����̱�_����();
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
//		test.printTest();

		int result = test.solution(board, moves);
		System.out.println("result : " + result); // 4

		result = test.solution(new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } }, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 });
		System.out.println("result : " + result); // 4

		result = test.solution(new int[][] { { 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 },
				{ 3, 3, 3, 3, 3 } }, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 });
		System.out.println("result : " + result); // 4

		result = test.solution(new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } }, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 });
		System.out.println("result : " + result); // 4

		System.out.println();
		System.out.println();
		System.out.println();

		int[][] board2 = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves2 = { 1, 5, 3, 5, 1, 2, 1, 4 };
		result = test.solution3(board2, moves2);
		System.out.println("result : " + result); // 4

		result = test.solution3(new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 },
				{ 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } }, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 });
		System.out.println("result : " + result); // 4

		result = test.solution3(new int[][] { { 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 },
				{ 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 } }, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 });
		System.out.println("result : " + result); // 4

		result = test.solution3(new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } }, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 });
		System.out.println("result : " + result); // 4

	}

	public void printTest() {
		String test = "abcdefh";
		test = test.substring(0, test.length() - 1);
		System.out.println(test);
	}

	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> pickArr = new ArrayList<>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					if (pickArr.size() != 0 && pickArr.get(pickArr.size() - 1) == (board[j][moves[i] - 1])) {
						answer += 2;
						pickArr.remove(pickArr.size() - 1);
						board[j][moves[i] - 1] = 0;
						break;

					} else {
						pickArr.add(board[j][moves[i] - 1]);
						board[j][moves[i] - 1] = 0;
						break;
					}
				}
			}
		}
		return answer;
	}

	public int solution3(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					if (!stack.empty() && stack.peek() == board[j][moves[i] - 1]) {
						answer++;
						stack.pop();
						board[j][moves[i] - 1] = 0;
						break;

					} else {
						stack.push(board[j][moves[i] - 1]);
						board[j][moves[i] - 1] = 0;
						break;
					}
				}
			}
		}
		return answer * 2;
	}

	public int solution2(int[][] board, int[] moves) {
		int answer = 0;
		String pick = "";
		for (int i = 0; i < moves.length; i++) { // ũ������ �̵��� ���� �迭��ŭ ����
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] > 0) {
					if (!pick.isEmpty()) { // pick �� ó������ ���� �����Ҷ��� ���� ���� ���� ������ �ʴ´�.

						if (Integer.parseInt(pick.substring(pick.length() - 1)) == (board[j][moves[i] - 1])) {
//							System.out.println(j + "" + (moves[i] - 1) + " ��° �� ����  �� : " + board[j][moves[i] - 1]);
							answer += 2;
							pick = pick.substring(0, pick.length() - 1);
							board[j][moves[i] - 1] = 0;
							break;
						}
					}

//					if (!pick.isEmpty()) {
//						System.out.print("���� �� : " + pick.substring(pick.length() - 1) + "  | ");
//					}

//					System.out.println(j + "" + (moves[i] - 1) + " ��° �� ����  �� : " + board[j][moves[i] - 1]);
					pick += (board[j][moves[i] - 1]);
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
//			printArray(board);
		}
		return answer;
	}

	public void printArray(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print("[" + i + "" + j + "] " + board[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}

package basic.modules;

import java.util.Scanner;

public class Solution08 {
	/*
	 * 문자열 str이 주어집니다. 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요. 1 ≤ str의
	 * 길이 ≤ 10
	 **/

	public void solution() {

		System.out.println("##### 기초 문제 8번 ####");
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();

		if (a.length > 0 && a.length < 11) {
			for (char c : a) {
				System.out.println(c);
			}
		}

	}

}

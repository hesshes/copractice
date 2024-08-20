package basic.modules.day02;

import java.util.Scanner;

public class Solution06 {
	/*
	 * 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요. 1 ≤ a, b ≤ 100
	 **/

	public void solution() {

		System.out.println("##### 기초 문제 6번 ####");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a);
		System.out.println(b);
		if (a > 0 && b < 101) {
			System.out.println(a + " + " + b + " = " + (a + b));
		}
	}

}

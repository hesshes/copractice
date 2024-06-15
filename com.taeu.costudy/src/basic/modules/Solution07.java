package basic.modules;

import java.util.Scanner;

public class Solution07 {
	/*
	 * 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다. 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를
	 * 작성해 보세요. 1 ≤ str1, str2의 길이 ≤ 10
	 **/

	public void solution() {

		System.out.println("##### 기초 문제 7번 ####");
		Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

		if (str1.length() > 0 && str2.length() < 11) {
			System.out.println(str1 + str2);
		}
	}

}

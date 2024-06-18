package basic.modules;

import java.util.Scanner;

public class Solution09 {
    /*
     * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해
     * 보세요. 1 ≤ n ≤ 1,000
     **/

    public void solution() {

        System.out.println("##### 기초 문제 9번 ####");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0 && n < 1001) {
            String text = (n % 2 == 0) ? " is even" : " is odd";
            System.out.println(n + text);
        }
        
        /*
         * 
         * 프로그래머스에서 다른 사람의 정답 중 가장 짧은 코딩
         * system.out.println( n + " is" + (n % 2 == 0) ? "even" : "odd");
         * 
         * 삼항연산자 경고문 : left hands 는 변수여야 된다??
         * */

    }

}

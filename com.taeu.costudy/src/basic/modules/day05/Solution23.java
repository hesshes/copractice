package basic.modules.day05;

public class Solution23 {

	// 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다.
	// 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
	// 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
	// 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면
	// (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
	// 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 +
	// c3 )점을 얻습니다.
	// 세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를
	// 작성해 주세요

	// 제한사항
	// a, b, c는 1이상 6이하의 정수입니다.
	public int solution(int a, int b, int c) {
		int result = 0;
		if (a > 0 && a < 7 && b > 0 && b < 7 && c > 0 && c < 7) {
			if ((a != b) && (b != c) && (a != c)) {
				result = a + b + c;
			} else if ((a == b) && (b == c)) {
				result = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))
						* (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
			} else {
				result = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
			}

		}
		
		// 프로그래머스 정답 
		 //for(int i = ((a == b || a == c) ? 1 : 0) + ((b == c) ? 1 : 0) + 1; i != 0; i--)
	       //     result *= (int)(Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));

		return result;

	}

}

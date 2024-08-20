package basic.modules.day05;

public class Solution22 {

	// 두 정수 a,d와 길이가 n인 boolean 배열 included가 주어집니다.
	// 첫째항이 a, 공차가 d인 등차수열에서 included[i] 가 i+1 항을 의미할 때,
	// 이 등차수열의 1항부터 n항까지 included가
	// true인 항들만 더한 값을 return 하는
	// solution 함수를 작성해 주세요.

	// 제한사항
	// 1 ≤ a ≤ 100
	// 1 ≤ d ≤ 100
	// 1 ≤ included의 길이 ≤ 100
	// included에는 true가 적어도 하나 존재합니다.

	// a+(n−1)d

	// a + (n-1)d =
	public int solution(int a, int d, boolean[] included) {
		int result = 0;
		if (a > 0 && a < 101 && d > 0 && d < 101 && included.length > 0 && included.length < 101) {

			for (int i = 1; i < included.length + 1; i++) {
				if (included[i - 1])
					result += (a + (i - 1) * d);
			}
		}
		return result;
		// 프로그래머스 정답
		// IntStream.range(0, included.length).map(idx ->
		// included[idx]?a+(idx*d):0).sum();
		// Stream 사용법 정리하자
	}

}

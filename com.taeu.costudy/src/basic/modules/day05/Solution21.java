package basic.modules.day05;

public class Solution21 {

	// 문자열 code가 주어집니다.

	// code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다.

	// mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.

	// mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서

	// code[idx]의 값에 따라 다음과 같이 행동합니다.

	// mode가 0일 때 code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에

	// code[idx]를 추가합니다.

	// code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.

	// mode가 1일 때 code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에

	// code[idx]를 추가합니다.

	// code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.

	// 문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해

	// 주세요.

	// 단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신

	// "EMPTY"를 return 합니다.

	// 제약사항
	// 1 ≤ code의 길이 ≤ 100,000 code는 알파벳 소문자 또는 "1"로 이루어진 문자열입니다.
	//

	public String solution(String code) {

		String reg = "^[0-9a-z]*$";
		String ret = "";
		int mode = 0;

		if (code.matches(reg) && code.length() > 0 && code.length() < 100001) {
			// 정답 코드
			for (int i = 0; i < code.length(); i++) {
				if (code.charAt(i) == '1')
					mode = 1 - mode;
				else if (i % 2 == mode)
					ret += code.charAt(i);
			}
			// 이전 오답의 경우 코드 처리가 복잡햇음
			// 문제 해석 능력을 키워야 함
			// 전체적인 문장을 해석하고 처리해야 할 것이 무엇인지 간단하게 요약할 필요가 있음

		}
		return "".equals(ret) ? "EMPTY" : ret;
	}

}

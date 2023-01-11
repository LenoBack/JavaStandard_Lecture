package ch04_Pratice;

//숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
//만일 문자열이 "12345"라면, '1+2+3+4+5'의 결과인 15가 출력이 되어야 한다.
//알맞은 코드를 작성하시오



public class Question4_9 {
	public static void main(String[] args) {
		String number = "12345";
		int sum = 0;
		
		for(int i=0; i<number.length(); i++) {
			sum += number.charAt(i) - '0';
			//문자로 입력된 숫자를 숫자로 바꿔주기 위해서는 char형 '0'을 빼주면 된다.
			// '3'=아스키 코드 51 '0'=아스키 코드 48 숫자 3 = 아스키 코드 3
		}
		
		System.out.println("sum: "+sum);
	}
}

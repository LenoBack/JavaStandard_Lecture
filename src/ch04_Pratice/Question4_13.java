package ch04_Pratice;

public class Question4_13 {
	public static void main(String[] args) {
		String value = "1234";
		char ch = ' ';
		boolean isNumber = true;
// 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다
		for (int i = 0; i < value.length(); i++) {
			//값 문자열의 값을 하나씩 가져와서 ch에 대입
				ch = value.charAt(i);
				if(!('0'<=ch && ch<='9')) {
					isNumber = false;
					break;
				}
		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		} // end of main
	}
} // end of class

//ch = value.charAt(i);
//if (!('0' <= ch && ch <= '9')) {
//isNumber = false;
//break;
//}

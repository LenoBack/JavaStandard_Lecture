package ch04_Pratice;


//피보나치 수열 10번쨰 수까지 구하기
//첫 번째 수는 1
//두 번째 수는 1
//세번쨰 수는 첫 번쨰 + 두 번째
//4번쨰는 두번째 + 세번째
public class Question4_11 {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		int num3 = num1+num2;
		
		System.out.printf(num1+","+num2);
		
		for(int i=0; i<8; i++) {
			num3 = num1+num2;
			System.out.printf(","+num3);			
			num1 = num2;			
			num2 = num3;
		}
		
	}
}

package ch04_Pratice;

public class Question4_10 {
	//int 타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
	//만일 변수 num 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라
	
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum += num%10;
			num /=10;
			
		}
		System.out.println(sum);
	}
}

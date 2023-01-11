package ch04_Pratice;
//두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
public class Question4_6 {
	public static void main(String[] args) {
		int i;
		int j;
		int sum = 0;
		
		for(i=1; i<=6; i++) {
			for(j=1; j<=6; j++) {
				if(i+j == 6) {
					sum=i+j;
					System.out.println(i+"+"+j+"="+sum);
				}
			}
		}
	}
}

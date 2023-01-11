package ch04_Pratice;

//1+(-2)+3+(-4)+과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
public class Question4_4 {
	public static void main(String[] args) {
		int sum =0;
		int s =1; //부호 바꾸는 용도의 변수
		int num =0; //부호의 값을 바꾸기 위해 사용하는 변수(곱하기용)
		
		for(int i=1; true; i++, s=-s) {
				num += i*s;
				sum += num;
				if(sum>=100) {
					System.out.println("i값 = "+i);
					break;
				}
			}System.out.println(sum);
		}	
}

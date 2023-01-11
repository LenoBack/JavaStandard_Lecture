package ch05_Pratice;

public class Question_05 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		
		for(int i=0; i<ballArr.length; i++) {
			// 배열의 길이가 9이므로 0~8까지 숫자가 나옴  
			// Math.random()함수를 이용해 랜덤한 배열의 번호를 가져옴
			int j = (int)(Math.random() * ballArr.length);
			int tmp;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		//ballArr 배열의 0번째부터 읽어서  ball3의 배열로 0번쨰 주소지부터 3번까지 데이터를 붙여넣는다.
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		for(int i=0; i<ball3.length;i++) {
			System.out.print(ball3[i]);
			System.out.print(", ");
		}
	}
}

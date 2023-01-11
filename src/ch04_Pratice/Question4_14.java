package ch04_Pratice;

public class Question4_14 {
	public static void main(String[] args) {
		
		// 1~100사이의 임의의 값을 어더서 answer에 저장한다.
		// +1을 넣지 않으면 0~99까지가 되어버린다. 
		int answer = (int)(Math.random()*100)+1;
		int input = 0;				// 사용자 입력을 저장할 공간
		int count = 0;				// 시도횟수를 세기위한 변수
		
		//화면으로 부터 사용자 입력을 받기 위해서 Scanner클래스 사용 
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count ++;
			System.out.println("1과 100 사이의 값을 입력하세요");
			//s.nextInt(입력) 입력 메서드로 input에 저장 
			//nextInt 메서드를 사용하기 위해서 Scanner 클래스로 객체를 정의
			//java.util.Scanner s = new java.util.Scanner(System.in);
			input = s.nextInt(); //입력받은 값을 변수 input에 저장한다.
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는" + count+ "번입니다.");
				break; //do-while문을 벗어난다.
			}	
		} while(true);
	}
}

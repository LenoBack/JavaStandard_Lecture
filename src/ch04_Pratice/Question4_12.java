package ch04_Pratice;

public class Question4_12 {
	public static void main(String[] args) {
		//2~9단까지 반복문 수행 dan수가 3씩 커질수록 줄바꿈이 이루어지므로 i+=3
		for (int i=2;i<9; i+=3) {
			//수행할 *숫자 지정 1~3
			for (int j=1;j<=3;j++) {
				//수행할 dan 갯수 지정. 1줄에 3개의 dan이 수행되므로 i+2를 지정 
				//1줄에 3개의 단이 수행되도록 했기에, k>9에서 break를 걸지 않으면 10단이 나온다.
				for (int k=i;k<=i+2;k++) {
					if (k>9)
						break;
					System.out.printf(k+"*"+j+"="+k*j+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
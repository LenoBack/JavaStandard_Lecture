package ch05_Pratice;

public class Question_04 {
	public static void main(String[] args) {
		
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		int count = 0;
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total +=arr[i][j];
				count += 1;
			}
		}
		//형 변환을 해줘야한다. (평균 구할때는 형변환이 필수)
		
		//int(4byte)보다 크기가 작은 자료형은 int 형으로 형변환 후에 연산을 수행한다
		//byte/short => int / int => int 
		
		// 두 개의 피연산자 중 자료형의 표현범위가 큰 쪽에 맞춰서 형변환 된 후 연산을 수행한다
		// int / float => float /float => float
		average = ((float)total / count);
		
		
		System.out.println("total="+total);
		System.out.println("average="+average);
		
	}
}

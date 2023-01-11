package ch04_Pratice;

/* 다음 for문을 while문으로 변경하시오
 public class Exercise4_5 {
 public static void main(String[] args) {
 for(int i=0; i<=10; i++) {
 	for(int j=0; j<=i; j++)
 		System.out.print("*");
 	System.out.println();
 end of main
 end of class*/

/*int treeHit = 0;
while (treeHit < 10) {
    treeHit++;
    System.out.println("나무를  " + treeHit + "번 찍었습니다.");
    if (treeHit == 10) {
        System.out.println("나무 넘어갑니다.");
    }
}*/
public class Question4_5 {
	public static void main(String[] args) {
		int i = 0;

		//while문 안으로 들어간다 j는 i와 같거나 작으므로 별 하나 찍고 올라온다.
		while(i<=10) {
			int j = 0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

package janaWin01;

import java.util.Scanner;

public class Day3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner in = new Scanner(System.in);
		//컨트롤 쉬프트 알파벳 O : 임폴트(필요한 자료형을 가져온다) 빨간줄 
for (int i=0;i<3;i++) {
	System.out.println("첫번째 숫자 입력");
	System.out.println("그만하고 싶으면 999");
	int a=in.nextInt();
if(a==999) {
	break;
}
System.out.println("두번째 숫자 입력");
int b=in.nextInt();

System.out.println("A+B="+(a+b));
}
		
	}

}

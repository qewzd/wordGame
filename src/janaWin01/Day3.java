package janaWin01;

import java.util.Scanner;

public class Day3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner in = new Scanner(System.in);
		//��Ʈ�� ����Ʈ ���ĺ� O : ����Ʈ(�ʿ��� �ڷ����� �����´�) ������ 
for (int i=0;i<3;i++) {
	System.out.println("ù��° ���� �Է�");
	System.out.println("�׸��ϰ� ������ 999");
	int a=in.nextInt();
if(a==999) {
	break;
}
System.out.println("�ι�° ���� �Է�");
int b=in.nextInt();

System.out.println("A+B="+(a+b));
}
		
	}

}

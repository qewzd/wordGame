package janaWin01;

import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {
		

		Scanner in=new Scanner(System.in);
		int cnt=0;

		System.out.println("���̵� �Է��ϼ���");
		String name = in.nextLine();
		for (int i=0;i<name.length();i++) {
			if(name.charAt(i)=='@') {
				cnt++;
			}
		}
		System.out.println("Ư�����ڰ� "+cnt+"�� ���ԵǾ� �ֽ��ϴ�.");
	
	}


}
	
}

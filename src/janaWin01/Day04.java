package janaWin01;

import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {
		

		Scanner in=new Scanner(System.in);
		int cnt=0;

		System.out.println("아이디를 입력하세요");
		String name = in.nextLine();
		for (int i=0;i<name.length();i++) {
			if(name.charAt(i)=='@') {
				cnt++;
			}
		}
		System.out.println("특수문자가 "+cnt+"개 포함되어 있습니다.");
	
	}


}
	
}

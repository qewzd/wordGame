package janaWin01;

import java.util.Random;

public class Day05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();  
		int lotto[]=new int [45];     // �ζ� ��ȣ (index-�ζǹ�ȣ, value-���� Ƚ��)
double a=0;
int b=0;
int max=0;
		for(int i=0;i<1000;i++){
			int num=r.nextInt(45);          // ���� ��ȣ
		lotto[num]+=1;
		}
		for (int i=0;i<45;i++) {
			a= lotto[i]*100;
			System.out.println((i+1)+"�� "+lotto[i]+" Ȯ��:"+(a/1000)+"%");
		}
		for (int i=0;i<45;i++) {	
			if(max>lotto[i]) {
			}else max=lotto[i];
			
			System.out.print(max);
		}		
			
	
		
	
	}

}

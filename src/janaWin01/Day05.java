package janaWin01;

import java.util.Random;

public class Day05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();  
		int lotto[]=new int [45];     // ·Î¶Ç ¹øÈ£ (index-·Î¶Ç¹øÈ£, value-»ÌÈù È½¼ö)
double a=0;
int b=0;
int max=0;
		for(int i=0;i<1000;i++){
			int num=r.nextInt(45);          // ·£´ı ¹øÈ£
		lotto[num]+=1;
		}
		for (int i=0;i<45;i++) {
			a= lotto[i]*100;
			System.out.println((i+1)+"¹ø "+lotto[i]+" È®·ü:"+(a/1000)+"%");
		}
		for (int i=0;i<45;i++) {	
			if(max>lotto[i]) {
			}else max=lotto[i];
			
			System.out.print(max);
		}		
			
	
		
	
	}

}

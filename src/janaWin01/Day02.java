package janaWin01;

public class Day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = {6,12,33,4,5,26};
		int point;
		if(lotto[0]%2==1){
			point+=lotto[0];
		}if(lotto[1]%2==1){
			point+=lotto[1];
		}if(lotto[2]%2==1){
			point+=lotto[2];
		}if(lotto[3]%2==1){
			point+=lotto[3];
		}if(lotto[4]%2==1){
			point+=lotto[4];
		}if(lotto[5]%2==1){
			point+=lotto[5];
		}
			System.out.println(point);
	}

		
	}

}

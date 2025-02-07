
public class Day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[30];
		
		score[2]=30;
		score[4]=50;
		score[0]=score[2];
		score[1]=score[2]+10;
		score[29]=score[0]+score[1];
		System.out.println(score[4]+20);
	}

}

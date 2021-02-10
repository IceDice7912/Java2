package test.advancedFor;

public class advancedFor {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		} //배열 전용으로 만든데다가 증감식 사용 안함. 오로직 1++만 해댐
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

	} 
}

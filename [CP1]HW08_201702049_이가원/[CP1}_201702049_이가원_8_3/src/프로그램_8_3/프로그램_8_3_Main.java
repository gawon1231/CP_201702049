package 프로그램_8_3;

import java.util.Scanner;

public class 프로그램_8_3_Main {

	private static Scanner aScanner = new Scanner(System.in);

	private static int inputScore() {

		int scoreScanner;
		scoreScanner = aScanner.nextInt();

		return scoreScanner;
	}

	private static final int MAX_SIZE = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Korean_Score;
		int Computer_Score;
		int[] Korean_Scores = new int[MAX_SIZE];
		int[] Computer_Scores = new int[MAX_SIZE];
		double[] averageOfStudents = new double[MAX_SIZE];
		int numberOfStudents = 0;
		int above_average = 0;
		double total = 0;
		double total_Average;

		System.out.print(">>두 과목 (국어 , 컴퓨터)의 점수를 차례로 입력하시오 : ");
		Korean_Score = inputScore();
		Computer_Score = inputScore();

		while (Korean_Score >= 0 && Computer_Score >= 0) {
			if (Korean_Score > 100 || Computer_Score > 100) {

				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");

			} 
			else {

				Korean_Scores[numberOfStudents] = Korean_Score;
				Computer_Scores[numberOfStudents] = Computer_Score;
				averageOfStudents[numberOfStudents] = (double) ((Korean_Score + Computer_Score) / 2.0);
				total = averageOfStudents[numberOfStudents] + total;
				numberOfStudents++;

			}

			System.out.print(">>두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
			Korean_Score = inputScore();
			Computer_Score = inputScore();
		}

		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 " + numberOfStudents + "명의 성적이 입력되었습니다.");
		System.out.println();
		System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
		System.out.println();

		int count = 0;

		total_Average = total / (double) numberOfStudents;

		while (count < (numberOfStudents)) {
			System.out.println("[" + count + "] " + Korean_Scores[count] + " " + Computer_Scores[count] + 
					" (평균 "+ averageOfStudents[count] + ")");
			System.out.println();

			if (averageOfStudents[count] >= total_Average) {
				above_average++;
			}
			count++;
		}

		System.out.println("학급 평균은 " + total_Average + " 입니다.");
		System.out.println("평균 이상인 학생의 수는 " + above_average + " 명 입니다.");
		System.out.println();
		System.out.println("<<프로그램을 종료합니다.>>");

	}

}

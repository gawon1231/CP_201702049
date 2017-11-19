package 프로그램_8_1;

import java.util.Scanner;

public class 프로그램_8_1_Main {

	private static Scanner aScanner = new Scanner(System.in);

	private static final int MAX_SIZE = 100;

	private static int inputScore() {

		int scoreScanner;
		System.out.print(">>점수를 입력하시오 :");
		scoreScanner = aScanner.nextInt();

		return scoreScanner;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score;
		int[] scores = new int[MAX_SIZE];
		int numberOfStudents = 0;
		int total = 0;
		int count =0;
		score=inputScore();

		while(score >= 0) {
			if(score > 100) {
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");

			}
			else {
				scores[numberOfStudents]=score;
				numberOfStudents ++;
				total= total+score;

			}
			score=inputScore();

		}

		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두"+numberOfStudents+"명이 성적이 입력되었습니다.");
		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");

		while(count < numberOfStudents) {
			System.out.println("["+count+"]"+scores[count]);
			count ++;

		}

		System.out.println();
		System.out.println("<<프로그램을 종료합니다.>>");
	}
}





package 과제_프로그램_9_2;

import java.util.Scanner;

public class 프로그램_9_2 {

	private static Scanner scanner = new Scanner(System.in);
	private static final int MAX_SIZE = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfStudents = 0;   
		int[] scores = new int[MAX_SIZE];
		int max_Score;
		int min_Score;
		int count = 0;
		int aboveAverage = 0;

		System.out.println("<<프로그램을 시작합니다.>>");
		System.out.println();
		
		int score = inputScore();
		while (score >= 0) {

			if (score > 100) {

				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}

			else {

				scores[numberOfStudents] = score;
				numberOfStudents ++;
			}

			score = inputScore();
		}

		double average = calcAverage (scores, numberOfStudents);

		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 " + numberOfStudents + "명의 성적이 입력되었습니다.");
		System.out.println("평균은 " + average + "입니다.");
		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");

		while (count < numberOfStudents) {

			if ( scores[count] >= average) {

				System.out.println("[" + count + "]" + scores[count] + " (평균 이상입니다)");
				aboveAverage ++;
			}

			else {

				System.out.println("[" + count + "]" + scores[count] + " (평균 미만입니다)");
			}

			count ++;
		}

		System.out.println("평균 이상인 학생 수는 " + aboveAverage + "명 입니다.");
		System.out.println();

		max_Score = calcMax (scores, numberOfStudents);
		min_Score = calcMin (scores, numberOfStudents);

		System.out.println("최고점은 " + max_Score + "입니다.");
		System.out.println("최저점은 " + min_Score + "입니다.");
		System.out.println();
		System.out.println("성적순은 다음과 같습니다.");

		selectionSort (scores, numberOfStudents);
		int number = 0;         
		while (number < numberOfStudents) {

			if ( scores[number] >= average) {

				System.out.println("[" + number + "]" + scores[number]);
				aboveAverage ++;
			}

			else {

				System.out.println("[" + number + "]" + scores[number]);
			}

			number ++;
		}

		System.out.println("<<프로그램을 종료합니다.>>");
	}

	private static int inputScore() {

		int scoreFromScanner;
		System.out.print(">>성적을 입력하시오: ");
		scoreFromScanner = scanner.nextInt();
		return scoreFromScanner;

	}

	private static double calcAverage (int[] elements, int aSize) {

		int i = 0;
		int sum = 0;

		while (i < aSize) {

			sum = sum + elements[i];
			i ++;
		}

		double average = (double) sum / (double) aSize ;
		return average;

	}

	private static int calcMin (int[] elements, int aSize) {

		int i = 0;
		int minValue = elements[0];
		while (i < aSize) {
			if (minValue > elements[i]) {
				minValue = elements[i];

			}

			i ++;
		}

		return minValue;

	}

	private static int calcMax (int[] elements, int aSize) {

		int i = 0;
		int maxValue = elements[0];
		while (i < aSize) {
			if (maxValue < elements[i]) {
				maxValue = elements[i];

			}

			i ++;
		}

		return maxValue;

	}

	private static void selectionSort (int[] elements, int aSize) {

		int lastLoc = aSize - 1;
		int maxLoc;
		int maxValue = 0;
		int selectionLoc = 0;
		while (selectionLoc <= lastLoc) {

			maxLoc = selectionLoc;
			maxValue = elements[maxLoc];
			int curLoc = selectionLoc + 1;
			while (curLoc <= lastLoc) {
				if (elements[curLoc] > maxValue) {
					maxLoc = curLoc;
					maxValue = elements[maxLoc];

				}

				curLoc ++;
			}

			elements[maxLoc] = elements[selectionLoc];
			elements[selectionLoc] = maxValue;
			selectionLoc ++;

		}
	}

}


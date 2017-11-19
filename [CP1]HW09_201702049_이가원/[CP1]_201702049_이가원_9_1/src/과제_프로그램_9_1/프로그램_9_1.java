package 과제_프로그램_9_1;

import java.util.Scanner;

public class 프로그램_9_1 {
	
	private static Scanner ascanner = new Scanner(System.in);
	private static final int MAX_SIZE = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfStudents = 0;   
		int[] scores = new int[MAX_SIZE];
		int count = 0;
		int aboveAverage = 0;
		double average;
		int maxScore;
		int minScore;

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

		average = calcAverage (scores, numberOfStudents);


		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("모두 " + numberOfStudents + "명의 성적이 입력되었습니다.");
		System.out.println("평균은 " + average + "입니다.");
		System.out.println();
		System.out.println("입력된 성적은 다음과 같습니다.");

		while (count < numberOfStudents) {
			
			if ( scores[count] >= average) {
				System.out.println("[" + count + "] " + scores[count] + " (평균 이상입니다)");
				aboveAverage ++;
			}
			else {
				System.out.println("[" + count + "] " + scores[count] + " (평균 미만입니다)");
			}
			
			count ++;
		}

		System.out.println();
		System.out.println("평균 이상인 학생 수는 " + aboveAverage + "명 입니다.");
		System.out.println();

		maxScore = calcMax (scores, numberOfStudents);
		minScore = calcMin (scores, numberOfStudents);

		System.out.println("최고점은 " + maxScore + "입니다.");
		System.out.println("최저점은 " + minScore + "입니다.");
		System.out.println();
		System.out.println("<<프로그램을 종료합니다.>>");
		
	}

	private static int inputScore() {
		
		int scoreFromScanner;
		System.out.print(">>성적을 입력하시오: ");
		scoreFromScanner = ascanner.nextInt();
		return scoreFromScanner;
	}
	
	private static double calcAverage (int[] elements, int aSize) {
		
		int i = 0;
		int sum = 0;

		while (i< aSize) {
			
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
	
}


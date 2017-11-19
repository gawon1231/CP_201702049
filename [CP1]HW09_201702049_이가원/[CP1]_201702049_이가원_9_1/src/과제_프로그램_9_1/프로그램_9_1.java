package ����_���α׷�_9_1;

import java.util.Scanner;

public class ���α׷�_9_1 {
	
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

		System.out.println("<<���α׷��� �����մϴ�.>>");
		System.out.println();
		
		int score = inputScore();
		while (score >= 0) {
			if (score > 100) {
				
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scores[numberOfStudents] = score;
				numberOfStudents ++;
			}
			score = inputScore();
		}

		average = calcAverage (scores, numberOfStudents);


		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� " + numberOfStudents + "���� ������ �ԷµǾ����ϴ�.");
		System.out.println("����� " + average + "�Դϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");

		while (count < numberOfStudents) {
			
			if ( scores[count] >= average) {
				System.out.println("[" + count + "] " + scores[count] + " (��� �̻��Դϴ�)");
				aboveAverage ++;
			}
			else {
				System.out.println("[" + count + "] " + scores[count] + " (��� �̸��Դϴ�)");
			}
			
			count ++;
		}

		System.out.println();
		System.out.println("��� �̻��� �л� ���� " + aboveAverage + "�� �Դϴ�.");
		System.out.println();

		maxScore = calcMax (scores, numberOfStudents);
		minScore = calcMin (scores, numberOfStudents);

		System.out.println("�ְ����� " + maxScore + "�Դϴ�.");
		System.out.println("�������� " + minScore + "�Դϴ�.");
		System.out.println();
		System.out.println("<<���α׷��� �����մϴ�.>>");
		
	}

	private static int inputScore() {
		
		int scoreFromScanner;
		System.out.print(">>������ �Է��Ͻÿ�: ");
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


package ����_���α׷�_9_2;

import java.util.Scanner;

public class ���α׷�_9_2 {

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

		double average = calcAverage (scores, numberOfStudents);

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� " + numberOfStudents + "���� ������ �ԷµǾ����ϴ�.");
		System.out.println("����� " + average + "�Դϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");

		while (count < numberOfStudents) {

			if ( scores[count] >= average) {

				System.out.println("[" + count + "]" + scores[count] + " (��� �̻��Դϴ�)");
				aboveAverage ++;
			}

			else {

				System.out.println("[" + count + "]" + scores[count] + " (��� �̸��Դϴ�)");
			}

			count ++;
		}

		System.out.println("��� �̻��� �л� ���� " + aboveAverage + "�� �Դϴ�.");
		System.out.println();

		max_Score = calcMax (scores, numberOfStudents);
		min_Score = calcMin (scores, numberOfStudents);

		System.out.println("�ְ����� " + max_Score + "�Դϴ�.");
		System.out.println("�������� " + min_Score + "�Դϴ�.");
		System.out.println();
		System.out.println("�������� ������ �����ϴ�.");

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

		System.out.println("<<���α׷��� �����մϴ�.>>");
	}

	private static int inputScore() {

		int scoreFromScanner;
		System.out.print(">>������ �Է��Ͻÿ�: ");
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


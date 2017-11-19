package ���α׷�_8_3;

import java.util.Scanner;

public class ���α׷�_8_3_Main {

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

		System.out.print(">>�� ���� (���� , ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
		Korean_Score = inputScore();
		Computer_Score = inputScore();

		while (Korean_Score >= 0 && Computer_Score >= 0) {
			if (Korean_Score > 100 || Computer_Score > 100) {

				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");

			} 
			else {

				Korean_Scores[numberOfStudents] = Korean_Score;
				Computer_Scores[numberOfStudents] = Computer_Score;
				averageOfStudents[numberOfStudents] = (double) ((Korean_Score + Computer_Score) / 2.0);
				total = averageOfStudents[numberOfStudents] + total;
				numberOfStudents++;

			}

			System.out.print(">>�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
			Korean_Score = inputScore();
			Computer_Score = inputScore();
		}

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� " + numberOfStudents + "���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
		System.out.println();

		int count = 0;

		total_Average = total / (double) numberOfStudents;

		while (count < (numberOfStudents)) {
			System.out.println("[" + count + "] " + Korean_Scores[count] + " " + Computer_Scores[count] + 
					" (��� "+ averageOfStudents[count] + ")");
			System.out.println();

			if (averageOfStudents[count] >= total_Average) {
				above_average++;
			}
			count++;
		}

		System.out.println("�б� ����� " + total_Average + " �Դϴ�.");
		System.out.println("��� �̻��� �л��� ���� " + above_average + " �� �Դϴ�.");
		System.out.println();
		System.out.println("<<���α׷��� �����մϴ�.>>");

	}

}

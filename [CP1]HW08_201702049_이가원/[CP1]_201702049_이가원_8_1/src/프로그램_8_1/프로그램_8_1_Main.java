package ���α׷�_8_1;

import java.util.Scanner;

public class ���α׷�_8_1_Main {

	private static Scanner aScanner = new Scanner(System.in);

	private static final int MAX_SIZE = 100;

	private static int inputScore() {

		int scoreScanner;
		System.out.print(">>������ �Է��Ͻÿ� :");
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
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");

			}
			else {
				scores[numberOfStudents]=score;
				numberOfStudents ++;
				total= total+score;

			}
			score=inputScore();

		}

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("���"+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println();
		System.out.println("�Էµ� ������ ������ �����ϴ�.");

		while(count < numberOfStudents) {
			System.out.println("["+count+"]"+scores[count]);
			count ++;

		}

		System.out.println();
		System.out.println("<<���α׷��� �����մϴ�.>>");
	}
}





package ���α׷�_8_2;

import java.util.Scanner;

public class ���α׷�_8_2_Main {

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
		double classAverage;
		score = inputScore();

		while(score>=0) {
			if(score >100) {
				System.out.println("����:100�� �Ѿ, �������� ������ �ƴմϴ�.");

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
		
		classAverage = (double) total / (double)numberOfStudents;

		System.out.println("���"+numberOfStudents+"���� ������ �ԷµǾ����ϴ�.");
		System.out.println("�����"+classAverage+"�� �Դϴ�.");
		System.out.println();
		int aboveClassAverage =0;
		int count =0;

		System.out.println("�Էµ� ������ ������ �����ϴ�.");

		while(count<numberOfStudents) {
			if((double)scores[count]>=classAverage) {

				System.out.println("["+count + "]"+scores[count]+"(��� �̻��Դϴ�.)");
				aboveClassAverage ++;
			}
			else {
				
				System.out.println("["+count + "]"+scores[count]+"(��� �̸��Դϴ�.)");
			}
			count ++;
		}
		
		System.out.println("��� �̻��� �л� ����"+ aboveClassAverage + "�� �Դϴ�.");
		System.out.println("");
		System.out.println("<<���α׷��� �����մϴ�.>>");


	}

}

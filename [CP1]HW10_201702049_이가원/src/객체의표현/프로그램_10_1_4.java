package ��ü��ǥ��;

import java.util.Scanner;

public class ���α׷�_10_1_4 {

	private static Scanner aScanner = new Scanner(System.in);

	static Student student = new Student();

    static GPACounter gpacounter = new GPACounter();

	private static int inputScore() {

		int scoreFormScanner;
		scoreFormScanner = aScanner.nextInt();

		return scoreFormScanner;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(">�� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�:");

		int aScoreKorean;
		int aScoreEnglish;
		int aScoreComputer;

		aScoreKorean=inputScore();
		student.setScoreKorean (aScoreKorean);
		aScoreEnglish=inputScore();
		student.setScoreEnglish (aScoreEnglish);
		aScoreComputer=inputScore();
		student.setScoreComputer (aScoreComputer);

		System.out.println();
	
		while(aScoreKorean>=0&& aScoreEnglish>=0&& aScoreComputer>=0){
			student.setScoreKorean (aScoreKorean);
			student.setScoreEnglish (aScoreEnglish);
			student.setScoreComputer (aScoreComputer);
			if(aScoreKorean>100 || aScoreEnglish>100 || aScoreComputer>100){
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}

			else{

				System.out.println("[��   ��] ����:"+aScoreKorean+",    ����:"+ student.gradekorean()+ ",    ����:"+ student.pointKorean());
				System.out.println("[��   ��] ����:"+aScoreEnglish+",    ����:"+ student.gradeEnglish()+ ",    ����:"+ student.pointEnglish());
				System.out.println("[��ǻ��] ����:"+aScoreComputer+",    ����:"+ student.gradeComputer()+ ",    ����:"+ student.pointComputer());
				System.out.println("�� �л��� ��� ������ "+ student.gpa() + "�Դϴ�");
				System.out.println("");
				gpacounter.count(student.gpa());

			}
			System.out.println(">�� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�:");
			
			aScoreKorean=inputScore();
			aScoreEnglish=inputScore();
			aScoreComputer=inputScore();
			
		}

		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println();
		System.out.println("��� ������ 3.0 �̻��� �л��� "+ gpacounter.numberOfGPA3()+"�� �Դϴ�.");
		System.out.println("��� ������ 2.0 �̻� 3.0 �̸��� �л��� "+ gpacounter.numberOfGPA2()+"�� �Դϴ�.");
		System.out.println("��� ������ 1.0 �̻� 2.0 �̸��� �л���"+ gpacounter.numberOfGPA1()+"�� �Դϴ�.");
		System.out.println("��� ������ 0.0 �̻� 1.0 �̸��� �л���"+ gpacounter.numberOfGPA0()+"�� �Դϴ�.");
		
		System.out.println("���α׷��� �����մϴ�.");





	}

}

package W07_����;

import java.util.Scanner;

public class W07_���α׷�_7_4 {

	private static Scanner scanner = new Scanner(System.in);

	private static int numberOfA=0;
	private static int numberOfB=0;
	private static int numberOfC=0;
	private static int numberOfD=0;
	private static int numberOfF=0;

	private static int inputScore(){

		int inputScore = scanner.nextInt();

		return inputScore;
	}

	private static char score2Grade(int aScore){


		if(aScore>=90&&aScore<=100){
			return 'A';
		}
		else if(aScore>=80&&aScore<=89){
			return 'B';

		}
		else if(aScore>=70&&aScore<=79){
			return 'C';

		}
		else if(aScore>=60&&aScore<=69){
			return 'D';

		}
		else {
			return 'F';

		}
	}

	private static double grade2Point(char aGrade){

		if(aGrade=='A'){
			return 4.0;
		}
		else if(aGrade=='B'){
			return 3.0;
		}
		else if(aGrade=='C'){
			return 2.0;
		}
		else if(aGrade=='D'){
			return 1.0;
		}
		else{
			return 0.0;
		}
	}

	private static double calcGPA(double KPoint, double EPoint, double CPoint){

		double gpa;
		gpa = (KPoint + EPoint + CPoint)/3.0;

		if(gpa>=4.0){
			numberOfA++;
		}
		else if(gpa>=3.0&& gpa<4.0){
			numberOfB++;
		}
		else if(gpa>=2.0&& gpa<3.0){
			numberOfC++;
		}
		else if(gpa>=1.0&& gpa<2.0){
			numberOfD++;
		}
		else{
			numberOfF++;
		}

		return gpa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("<<���� ���α׷��� �����մϴ�.>>");
		System.out.println("");

		System.out.print(">�� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�:");

		int KoreanScore;
		int EnglishScore;
		int ComputerScore;

		KoreanScore=inputScore();
		EnglishScore=inputScore();
		ComputerScore=inputScore();

		char Kgrade;
		char Egrade;
		char Cgrade;

		double KPoint;
		double EPoint;
		double CPoint;

		double gpa;

		while(KoreanScore>=0&&EnglishScore>=0&&ComputerScore>=0){

			if(KoreanScore>100 || EnglishScore>100 || ComputerScore>100){
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}
			else{

				Kgrade = score2Grade(KoreanScore);
				Egrade = score2Grade(EnglishScore);
				Cgrade = score2Grade(ComputerScore);

				KPoint = grade2Point(Kgrade);
				EPoint = grade2Point(Egrade);
				CPoint = grade2Point(Cgrade);

				gpa= calcGPA(KPoint, EPoint, CPoint);

				System.out.println("[��   ��] ����:"+KoreanScore+",    ����:"+ Kgrade+ ",    ����:"+ KPoint);
				System.out.println("[��   ��] ����:"+EnglishScore+",    ����:"+ Egrade+ ",    ����:"+ EPoint);
				System.out.println("[��ǻ��] ����:"+ComputerScore+",    ����:"+ Cgrade+ ",    ����:"+ CPoint);
				System.out.println("�� �л��� ��� ������ "+ gpa + "�Դϴ�");
				System.out.println("");

			}
			System.out.print(">�� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�:");

			KoreanScore=inputScore();
			EnglishScore=inputScore();
			ComputerScore=inputScore();

		}

		System.out.println("���� ������ �ԷµǾ� ���α׷��� �����մϴ�");
		System.out.println("");

		System.out.println("��� ������ 4.0 �̻��� �л��� "+ numberOfA+"�Դϴ�.");
		System.out.println("��� ������ 3.0 �̻� 4.0 �̸��� �л��� "+ numberOfB+"�Դϴ�.");
		System.out.println("��� ������ 2.0 �̻� 3.0 �̸��� �л���"+ numberOfC+"�Դϴ�.");
		System.out.println("��� ������ 1.0 �̻� 2.0 �̸��� �л���"+ numberOfD+"�Դϴ�.");
		System.out.println("��� ������ 1.0 �̸��� �л��� "+ numberOfF+"�Դϴ�.");

		System.out.println("");
		System.out.println("<<���α׷��� �����մϴ�.>>");
	}

}


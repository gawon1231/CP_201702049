package W07_과제;

import java.util.Scanner;

public class W07_프로그램_7_4 {

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


		System.out.println("<<성적 프로그램을 시작합니다.>>");
		System.out.println("");

		System.out.print(">세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오:");

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
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
			}
			else{

				Kgrade = score2Grade(KoreanScore);
				Egrade = score2Grade(EnglishScore);
				Cgrade = score2Grade(ComputerScore);

				KPoint = grade2Point(Kgrade);
				EPoint = grade2Point(Egrade);
				CPoint = grade2Point(Cgrade);

				gpa= calcGPA(KPoint, EPoint, CPoint);

				System.out.println("[국   어] 점수:"+KoreanScore+",    학점:"+ Kgrade+ ",    평점:"+ KPoint);
				System.out.println("[영   어] 점수:"+EnglishScore+",    학점:"+ Egrade+ ",    평점:"+ EPoint);
				System.out.println("[컴퓨터] 점수:"+ComputerScore+",    학점:"+ Cgrade+ ",    평점:"+ CPoint);
				System.out.println("이 학생의 평균 평점은 "+ gpa + "입니다");
				System.out.println("");

			}
			System.out.print(">세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오:");

			KoreanScore=inputScore();
			EnglishScore=inputScore();
			ComputerScore=inputScore();

		}

		System.out.println("음의 점수가 입력되어 프로그램을 종료합니다");
		System.out.println("");

		System.out.println("평균 평점이 4.0 이상인 학생은 "+ numberOfA+"입니다.");
		System.out.println("평균 평점이 3.0 이상 4.0 미만인 학생은 "+ numberOfB+"입니다.");
		System.out.println("평균 평점이 2.0 이상 3.0 미만인 학생은"+ numberOfC+"입니다.");
		System.out.println("평균 평점이 1.0 이상 2.0 미만인 학생은"+ numberOfD+"입니다.");
		System.out.println("평균 평점이 1.0 미만인 학생은 "+ numberOfF+"입니다.");

		System.out.println("");
		System.out.println("<<프로그램을 종료합니다.>>");
	}

}


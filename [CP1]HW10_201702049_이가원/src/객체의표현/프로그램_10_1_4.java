package 객체의표현;

import java.util.Scanner;

public class 프로그램_10_1_4 {

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

		System.out.println(">세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다:");

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
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
			}

			else{

				System.out.println("[국   어] 점수:"+aScoreKorean+",    학점:"+ student.gradekorean()+ ",    평점:"+ student.pointKorean());
				System.out.println("[영   어] 점수:"+aScoreEnglish+",    학점:"+ student.gradeEnglish()+ ",    평점:"+ student.pointEnglish());
				System.out.println("[컴퓨터] 점수:"+aScoreComputer+",    학점:"+ student.gradeComputer()+ ",    평점:"+ student.pointComputer());
				System.out.println("이 학생의 평균 평점은 "+ student.gpa() + "입니다");
				System.out.println("");
				gpacounter.count(student.gpa());

			}
			System.out.println(">세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다:");
			
			aScoreKorean=inputScore();
			aScoreEnglish=inputScore();
			aScoreComputer=inputScore();
			
		}

		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("평균 평점이 3.0 이상인 학생은 "+ gpacounter.numberOfGPA3()+"명 입니다.");
		System.out.println("평균 평점이 2.0 이상 3.0 미만인 학생은 "+ gpacounter.numberOfGPA2()+"명 입니다.");
		System.out.println("평균 평점이 1.0 이상 2.0 미만인 학생은"+ gpacounter.numberOfGPA1()+"명 입니다.");
		System.out.println("평균 평점이 0.0 이상 1.0 미만인 학생은"+ gpacounter.numberOfGPA0()+"명 입니다.");
		
		System.out.println("프로그램을 종료합니다.");





	}

}

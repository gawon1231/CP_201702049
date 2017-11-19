package 이가원_201702049_W05;
import java.util.Scanner;
public class Main_과제_프로그램_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner = new Scanner(System.in);
		int score;
		int count=0;
		int total=0;
		char grade=0;
		int numberofAstudent=0;
		int numberofBstudent=0;
		int numberofCstudent=0;
		int numberofDstudent=0;
		int numberofEstudent=0;
		int numberofFstudent=0;

		System.out.print("성적을 입력하세요:");
		score = aScanner.nextInt();

		while(score>=0){

			if(score>100){
				System.out.println("오류: 최대점수 100이 넘는 성적이 입력되었습니다.");
			}
			else{
				count= count+1;
				total= total + score;

				if(score>=90&&score<=100){
					grade='A';
					numberofAstudent = numberofAstudent+1;
				}
				else if(score>=80&&score<=89){
					grade ='B';
					numberofBstudent = numberofBstudent+1;
				}
				else if(score>=80&&score<=89){
					grade ='C';
					numberofCstudent = numberofCstudent+1;
				}
				else if(score>=70&&score<=79){
					grade ='D';
					numberofDstudent = numberofDstudent+1;
				}
				else if(score>=60&&score<=69){
					grade ='E';
					numberofEstudent = numberofEstudent+1;
				}
				else if(score>=0&&score<=59){
					grade ='F';
					numberofFstudent = numberofFstudent+1;
				}
				System.out.println("("+"성적:"+score+","+ "학점:"+ grade+")");
			}

			System.out.print("성적을 입력하세요:");
			score = aScanner.nextInt();
		}


		System.out.println("");

		System.out.println("학생 수는 " + count + "명 입니다.");
		System.out.println("A는"+ numberofAstudent+"명 입니다.");
		System.out.println("B는"+ numberofBstudent+"명 입니다.");
		System.out.println("C는"+ numberofCstudent+"명 입니다.");
		System.out.println("D는"+ numberofDstudent+"명 입니다.");
		System.out.println("E는"+ numberofEstudent+"명 입니다.");
		System.out.println("F는"+ numberofFstudent+"명 입니다.");

		double average = (double)total/(double) count;


		System.out.println("평균은" + average + "점 입니다");

		aScanner.close();

	}

}

package �̰���_201702049_W05;
import java.util.Scanner;
public class Main_����_���α׷�_5_1 {

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

		System.out.print("������ �Է��ϼ���:");
		score = aScanner.nextInt();

		while(score>=0){

			if(score>100){
				System.out.println("����: �ִ����� 100�� �Ѵ� ������ �ԷµǾ����ϴ�.");
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
				System.out.println("("+"����:"+score+","+ "����:"+ grade+")");
			}

			System.out.print("������ �Է��ϼ���:");
			score = aScanner.nextInt();
		}


		System.out.println("");

		System.out.println("�л� ���� " + count + "�� �Դϴ�.");
		System.out.println("A��"+ numberofAstudent+"�� �Դϴ�.");
		System.out.println("B��"+ numberofBstudent+"�� �Դϴ�.");
		System.out.println("C��"+ numberofCstudent+"�� �Դϴ�.");
		System.out.println("D��"+ numberofDstudent+"�� �Դϴ�.");
		System.out.println("E��"+ numberofEstudent+"�� �Դϴ�.");
		System.out.println("F��"+ numberofFstudent+"�� �Դϴ�.");

		double average = (double)total/(double) count;


		System.out.println("�����" + average + "�� �Դϴ�");

		aScanner.close();

	}

}

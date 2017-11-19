package 과제제출_4_1;
import java.util.Scanner;
public class 프로그램4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		char userAnswer;

		System.out.println("이차 방정식을 풀겠습니까?");
		System.out.print("풀겠으면 'Y'를 치십시오: ");

		userAnswer = aScanner.next().charAt(0);

		while(userAnswer == 'Y'){
			double determinant ;
			double x1, x2 ;

			System.out.println( "a: ");
			double a = aScanner.nextDouble();

			if((-0.0000001 < a) && (a < 0.0000001)){
				System.out.println("오류: 이차항의 계수가 0이므로, 이차방정식을 풀 수 없습니다.");

			}

			else{
				System.out.println("b: ");
				double b = aScanner.nextDouble();

				System.out.println("c: ");
				double c = aScanner.nextDouble();

				determinant = b*b - 4.0*a*c ;
				x1 = (-b + Math.sqrt(determinant))/ (2.0*a);
				x2 = (-b + Math.sqrt(determinant))/ (2.0*a);
				System.out.println("The solution is either " +x1+"or" +x2);
				if(determinant <0) {
					System.out.println("판별식의 값이 0 보다 작으므로,실근이 존재하지 않습니다.");

				}
			}

			System.out.println("이차 방정식을 풀겠습니까?");
			System.out.print("풀겠으면 'Y'를 치십시오: ");

			userAnswer = aScanner.next().charAt(0);
		}
		System.out.println("프로그램을 종료합니다.");

		aScanner.close();

	}

}


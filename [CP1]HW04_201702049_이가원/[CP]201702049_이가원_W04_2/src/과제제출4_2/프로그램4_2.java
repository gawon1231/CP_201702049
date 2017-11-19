package 과제제출4_2;
import java.util.Scanner;
public class 프로그램4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		char userAnswer;
		System.out.println("Factorial을 계산하시겠습니까?");
		System.out.print("계산하려면 'Y' 를 치십시오: ");

		userAnswer = aScanner.next().charAt(0);

		while(userAnswer == 'Y'){

			int givenN;

			System.out.println("N의 값을 입력하십시오:");
			givenN = aScanner.nextInt();

			if(givenN<0){
				System.out.println("오류: 입력된 값이 음수이므로 계산할 수 없다.");

			}
			else{
				System.out.println(givenN + "Factorial 값을 계산하려고 합니다.");
				if(givenN == 0){
					System.out.println("0!은 1 입니다.");

				}
				else{
					int fact = 1;
					int i = 2;

					while(i<=givenN){
						fact = fact*i;
						i = i + 1;

					}
					System.out.println(givenN + "!은 " + fact + "입니다");
				}

				System.out.println("Factorial을 다시 계산하시겠습니까?");
				System.out.println("계산하려면 'Y' 를 치십시오:");
				userAnswer = aScanner.next().charAt(0);
			}
		}
		System.out.println("사용자가 계산을 원하지 않으므로 프로그램을 종료합니다.");
		aScanner.close();

	}

}

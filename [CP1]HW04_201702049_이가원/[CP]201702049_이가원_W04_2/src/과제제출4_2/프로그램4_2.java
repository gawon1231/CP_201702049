package ��������4_2;
import java.util.Scanner;
public class ���α׷�4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		char userAnswer;
		System.out.println("Factorial�� ����Ͻðڽ��ϱ�?");
		System.out.print("����Ϸ��� 'Y' �� ġ�ʽÿ�: ");

		userAnswer = aScanner.next().charAt(0);

		while(userAnswer == 'Y'){

			int givenN;

			System.out.println("N�� ���� �Է��Ͻʽÿ�:");
			givenN = aScanner.nextInt();

			if(givenN<0){
				System.out.println("����: �Էµ� ���� �����̹Ƿ� ����� �� ����.");

			}
			else{
				System.out.println(givenN + "Factorial ���� ����Ϸ��� �մϴ�.");
				if(givenN == 0){
					System.out.println("0!�� 1 �Դϴ�.");

				}
				else{
					int fact = 1;
					int i = 2;

					while(i<=givenN){
						fact = fact*i;
						i = i + 1;

					}
					System.out.println(givenN + "!�� " + fact + "�Դϴ�");
				}

				System.out.println("Factorial�� �ٽ� ����Ͻðڽ��ϱ�?");
				System.out.println("����Ϸ��� 'Y' �� ġ�ʽÿ�:");
				userAnswer = aScanner.next().charAt(0);
			}
		}
		System.out.println("����ڰ� ����� ������ �����Ƿ� ���α׷��� �����մϴ�.");
		aScanner.close();

	}

}

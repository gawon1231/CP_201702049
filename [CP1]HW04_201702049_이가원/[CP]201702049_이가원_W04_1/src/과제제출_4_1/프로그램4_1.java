package ��������_4_1;
import java.util.Scanner;
public class ���α׷�4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aScanner = new Scanner(System.in);
		char userAnswer;

		System.out.println("���� �������� Ǯ�ڽ��ϱ�?");
		System.out.print("Ǯ������ 'Y'�� ġ�ʽÿ�: ");

		userAnswer = aScanner.next().charAt(0);

		while(userAnswer == 'Y'){
			double determinant ;
			double x1, x2 ;

			System.out.println( "a: ");
			double a = aScanner.nextDouble();

			if((-0.0000001 < a) && (a < 0.0000001)){
				System.out.println("����: �������� ����� 0�̹Ƿ�, ������������ Ǯ �� �����ϴ�.");

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
					System.out.println("�Ǻ����� ���� 0 ���� �����Ƿ�,�Ǳ��� �������� �ʽ��ϴ�.");

				}
			}

			System.out.println("���� �������� Ǯ�ڽ��ϱ�?");
			System.out.print("Ǯ������ 'Y'�� ġ�ʽÿ�: ");

			userAnswer = aScanner.next().charAt(0);
		}
		System.out.println("���α׷��� �����մϴ�.");

		aScanner.close();

	}

}


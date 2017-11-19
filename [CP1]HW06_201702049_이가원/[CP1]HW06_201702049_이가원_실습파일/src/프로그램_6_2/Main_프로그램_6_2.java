package ���α׷�_6_2;

public class Main_���α׷�_6_2 {

	private static void printAsterisks (int numberOfAsterisks){

		int count=0;
		while(count<numberOfAsterisks){
			System.out.print("*");
			count=count+1;
		}
		System.out.println("");

	}
	private static double mySine(double x)
	{ 
		double xSquare = x*x;
		double currentTerm = x;
		int n = 2;
		double sineValue = currentTerm;
		while(Math.abs(currentTerm)>= 0.000001){
			currentTerm = -currentTerm * xSquare/(double)(n*(n+1));
			sineValue = sineValue + currentTerm;
			n=n+2;


		}
		return sineValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int degree=1;
		double radian;

		double sineValue;

		while(degree<=180){
			radian= (double)degree*(3.141592/180.0);
			sineValue=mySine(radian);

			int numberOfAsterisks;
			numberOfAsterisks = (int)((sineValue*40.0)+0.5);

			if(0<degree&&degree<10){
				System.out.print("sine(00"+degree+"��): ");
			}
			else if(10<=degree&&degree<100){
				System.out.print("sine(0"+degree+"��): ");
			}
			else{
				System.out.print("sine("+degree+"��): ");
			}

			printAsterisks(numberOfAsterisks);

			degree=degree+5;
		}
	}

}


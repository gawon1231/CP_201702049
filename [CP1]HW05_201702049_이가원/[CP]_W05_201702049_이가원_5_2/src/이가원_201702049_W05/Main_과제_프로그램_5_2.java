package 이가원_201702049_W05;

public class Main_과제_프로그램_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		double x;
		double y;
		while(n<=180){
			x= (double)n*(3.141592/180.0);
			y=Math.sin(x);
			System.out.println("Sine("+n+"도)는"+y+"입니다");
			n++;
		}
	}

}

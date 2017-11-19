package 이가원_201702049_W02;

public class Main_과제_프로그램_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   double a, b, c ;
	       double determinant ;
	       double x1, x2 ;
	       
	       a = 1.0 ;
	       b = 0.0 ;
	       c = -4.0 ;
	       //a = 2.0 ;
	       //b = -5.0 ;
	       //c = -3.0 ;
	       
	       //a = 1.0 ;
	       //b = -4.0 ;
	       //c = 4.0 ;
	       //a = 4.0 ;
	       //b = -12.0 ;
	       //c = 9.0 ;
	       
	       //a = 1.0 ;
	       //b = 1.0 ;
	       //c = 3.0 ;
	       //a = 2.0 ;
	       //b = 3.0;
	       //c = 4.0 ;
	       
	       System.out.println("a=" + a + " b=" + b +" c=" +c) ;
	       determinant = b*b - 4.0*a*c ;
	       x1 = (-b + Math.sqrt(determinant))/ (2.0*a);
	       x2 = (-b - Math.sqrt(determinant))/ (2.0*a);
	       System.out.println("The solution is either "+x1+" or" +x2) ;
	       

	}

}


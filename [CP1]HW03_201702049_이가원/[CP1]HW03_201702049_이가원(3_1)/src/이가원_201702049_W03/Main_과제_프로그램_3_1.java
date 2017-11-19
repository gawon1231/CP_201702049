package 이가원_201702049_W03;
import java.util.Scanner ;
public class Main_과제_프로그램_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner aScanner = new Scanner(System.in);
		double determinant ;
	    double x1, x2 ;
	       
		System.out.print("a: ");
		double a = aScanner.nextDouble();
		
		if( (-0.0000001 < a) && (a < 0.0000001) ){
		     
	    	System.out.println("오류: 이차항의 계수가 0 이므로, 이차방정식을 풀 수 없습니다.");
	    }
	    
	    else{
	    	System.out.print("b: ");
			double b = aScanner.nextDouble();
			
			System.out.print("c: ");
			double c = aScanner.nextDouble();
			
			determinant = b*b - 4.0*a*c ;
		    x1 = (-b + Math.sqrt(determinant))/ (2.0*a);
		    x2 = (-b - Math.sqrt(determinant))/ (2.0*a);
	    	System.out.println("The solution is either "+x1+" or" +x2) ;
	    	 if( determinant <0 ) {
	         System.out.println("판별식의 값이 0보다 작으므로, 실근이 존재하지 않아 프로그램을 종료합니다");
	    }     
	    
	    	
	    }
	
	}

}

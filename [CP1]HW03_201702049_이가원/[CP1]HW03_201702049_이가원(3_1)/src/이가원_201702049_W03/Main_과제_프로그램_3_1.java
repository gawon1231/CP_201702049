package �̰���_201702049_W03;
import java.util.Scanner ;
public class Main_����_���α׷�_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner aScanner = new Scanner(System.in);
		double determinant ;
	    double x1, x2 ;
	       
		System.out.print("a: ");
		double a = aScanner.nextDouble();
		
		if( (-0.0000001 < a) && (a < 0.0000001) ){
		     
	    	System.out.println("����: �������� ����� 0 �̹Ƿ�, ������������ Ǯ �� �����ϴ�.");
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
	         System.out.println("�Ǻ����� ���� 0���� �����Ƿ�, �Ǳ��� �������� �ʾ� ���α׷��� �����մϴ�");
	    }     
	    
	    	
	    }
	
	}

}

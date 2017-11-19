package 이가원_201702049_W03;
import java.util.Scanner ;
public class Main_과제_프로그램_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner aScanner = new Scanner(System.in);
		
		
		int givenN;
		int count;
		int sum;
		System.out.println("1부터 N까지 합계를 구하려고 합니다. N 값을 입력하십시오:");
		givenN = aScanner.nextInt();
		
	    sum =0 ;
	    count = 1;
	    
	    while(count <= givenN){
	    	sum = sum + count;
	    	System.out.print(" 합계는: " + sum);
	    	System.out.println("");
	    	count = count + 1;
	    }
	    
	}
}

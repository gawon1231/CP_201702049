package �̰���_201702049_W03;
import java.util.Scanner ;
public class Main_����_���α׷�_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner aScanner = new Scanner(System.in);
		
		
		int givenN;
		int count;
		int sum;
		System.out.println("1���� N���� �հ踦 ���Ϸ��� �մϴ�. N ���� �Է��Ͻʽÿ�:");
		givenN = aScanner.nextInt();
		
	    sum =0 ;
	    count = 1;
	    
	    while(count <= givenN){
	    	sum = sum + count;
	    	System.out.print(" �հ��: " + sum);
	    	System.out.println("");
	    	count = count + 1;
	    }
	    
	}
}

import java.util.Scanner;

public class nthprimedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter nth index ");
		int n = s.nextInt();
		int count = 0; int num=1; int i;
		while(count<n) {
			num =num+1;
			for( i=2;i<=num;i++) {
				if(num%i==0) {
					
					break;
				}
				
				
			}
			
			if(num==i) {
				
				count=count+1;
			}
			
		}
		System.out.println("result =  "+num);
		
		
		
	}

}

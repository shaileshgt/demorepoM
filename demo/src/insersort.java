import java.util.Scanner;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class insersort {

	public static void main(String[] args) {
		int num=1; int i;
		int count =0; 
		Scanner s = new Scanner(System.in);
		System.out.println("enter till where u need to search");
		int n= s.nextInt();
		while(count<n) {
			num=num+1;
			for(i=2;i<=num;i++) {
				if(num%i==0) {
					break;
				}
				
			}
			if(i==num) {
				count++;
			}
			
		}
		System.out.println(n+"th prime number is "+num);
		
	}
	

}

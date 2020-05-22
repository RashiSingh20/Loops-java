package loops;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
//	int sum=0;
//		int temp = n;
//		while(temp>0) {
//			int lastDigit = temp %10;
//			temp /= 10;
//		
//		sum += lastDigit;
//System.out.println(lastDigit + " " + temp + " " + sum);
//		}
//		System.out.println("sum of number of" + n+" is  " + sum);
		//to find no. of digits
		
	int noofdigits =	(int)Math.log10(n) + 1;
	System.out.println(noofdigits);
	int sum =0 ;
	int temp=n;
	for(int i=0 ; i<noofdigits;i++) {
		int lastDigit = temp%10;
		temp /= 10;
		sum+= lastDigit;
	}
	System.out.println(sum);
	}

}

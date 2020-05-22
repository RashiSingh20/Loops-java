package loops;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
Scanner sc =new Scanner (System.in);
int n =sc.nextInt();

int temp = n ;

int reversedNo = 0;
while (temp >0) {
	int lastDigit = temp% 10;
	reversedNo = reversedNo*10 + lastDigit;
//	System.out.println(temp);
//	System.out.println(reversedNo);
	
	temp /=10;
	
	
}

if (reversedNo == n) {
	System.out.println("it is a palindrome");
	
}
else {
	System.out.println("not a palindrome");
}
	}

}

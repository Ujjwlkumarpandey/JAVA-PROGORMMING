import java.util.Scanner;

public class Factorial {
	static int fact=1;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		 int no=sc.nextInt();
		
		
		Factorial f=new Factorial();
		f.calfact(no);
		System.out.println("factoril of " +no+ " is " +fact);
		
	}
		void calfact(int no) {
			if(no>=1) {
				 fact = fact*no;
				calfact(no-1);
				
			}
		
		}
		
		// TODO Auto-generated method stub

	}



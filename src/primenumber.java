import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int no=sc.nextInt();
		
		//int no=7;
		int temp=0;
		for(int i=2;i<=no-1;i++) {
			if(no%i==0) {
				temp=temp+1;
				
				
			}
			
			
		}
		if(temp>0) {
			System.out.println("not prime number");
		}
		else {
			System.out.println(" prime number");
		}

	}
}



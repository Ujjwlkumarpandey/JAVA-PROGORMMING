import java.util.Scanner;

public class revstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name :");
		String name=sc.next();
		
		
		//String name="ujjwal";
		String rev=" ";
		
		int leng=name.length();
		for(int i=leng-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		

	}

}

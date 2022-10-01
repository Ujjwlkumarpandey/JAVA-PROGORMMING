import java.util.Scanner;

public class calculater {


	public static void main(String[] args) {
		String yn;
		do {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter you frast number:");
		
		int no1=s.nextInt();
		System.out.println("Enter you second number:");
		int no2=s.nextInt();
		System.out.println("select symbol(+,-,*,/)");
		String sym=s.next();
		int result;
		switch(sym) {
		case"+":result=no1+no2;
		System.out.println(result);
		       break;
		case"-":result=no1-no2;
		System.out.println(result);
		       break;
		case"*":result=no1*no2;
		System.out.println(result);
		       break;
		case"/":result=no1/no2;
		System.out.println(result);
		        break;
		}
		System.out.println("do u want to continue(press y for and n for no");
		yn=s.next();
		
		}while(yn.equals("y")||yn.equals("Y"));
		
	}
}


	




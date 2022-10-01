import java.util.Scanner;

public class dataScanner {



	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter you name:");
		String name=s.next();
		System.out.println("Enter you age:");
		int age=s.nextInt();
		System.out.println("Enter you gander:");
		char gander=s.next().charAt(0);
		System.out.println("Enter you phone no:");
		long pnoneon=s.nextLong();
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("gender:"+gander);
		System.out.println("phone no:"+ pnoneon);
		
		
		

	}

}

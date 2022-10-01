
public class FibonacciSeriesusingRec {
	static int a=0,b=1,c;

	public static void main(String[] args) {
	
		
		FibonacciSeriesusingRec ob=new FibonacciSeriesusingRec();
		ob.printfib(10);

	}
	void printfib(int i) {
		if(i>=1) {
			 
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			printfib(i-1);
					
		}
	}

}

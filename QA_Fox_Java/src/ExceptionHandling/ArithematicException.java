package ExceptionHandling;

public class ArithematicException {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Exception handled");
		}

	}

}

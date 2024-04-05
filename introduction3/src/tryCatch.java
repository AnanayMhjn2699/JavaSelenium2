
public class tryCatch {
	
	public static int fun() {
		int a=5;
		int b=2;
		
		try {
			int c=a/b;
			System.out.println(c);
			return c;
		}
		catch(Exception e){
			System.out.println("caught an exception");
		}
		finally {
			System.out.println("in finally block");
		}

		return 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun());
		
	}

}

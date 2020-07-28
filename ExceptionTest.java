public class ExceptionTest {
	public static void main(String[] args) {
			int result=0;
			try
			{
				result=Integer.parseInt(args[0])/Integer.parseInt(args[1]);
			}
			
			catch(NullPointerException ex)
			{
				System.out.println("No Input received");
			}
			
			catch(NumberFormatException ex)
			{
			       System.out.print("Only integers are allowed");
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Division by zero is not possible");
			}
			System.out.println(result);
		}
	}
}
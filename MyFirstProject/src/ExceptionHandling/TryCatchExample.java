package ExceptionHandling;

public class TryCatchExample {

	public static void main(String[] args) {
		
		try
		{
			int var1=20;
			int var2=0;
			int var3;
			var3 = var1+var2;
			System.out.println("The value of the variable var3 after addition is :-"+var3);
			var3 = var1/var2;
			System.out.println("The value of the variable var3 after Division is :-"+var3);
			var3 = var1%var2;
			System.out.println("The value of the variable var3 after Mod is :-"+var3);
		}
		catch (Exception error) {
			System.out.println("The exception is :-"+error);
			System.out.println("This is a Catch Block");
		}

	}

}

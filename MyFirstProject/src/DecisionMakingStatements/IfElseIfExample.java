package DecisionMakingStatements;

public class IfElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1=10;
		int v2=20;
		int v3=30;
		
		if(v1>v2 && v1>v3)
		{
			System.out.println("v1 variable is greater than v2 and v3 variable");
		}
		
		else
		
			if(v2>v3)
			{
				System.out.println("v2 variable is greater than v1 and v3 variable");
			}		
		
		else
		{
			System.out.println("v3 variable is greater than v1 and v2 variables ");
		}
		
	}
		
}

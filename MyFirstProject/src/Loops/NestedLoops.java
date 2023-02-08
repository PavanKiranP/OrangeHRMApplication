package Loops;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++) //outer loop
		{
			for (int k=0;k<i;k++) //inner loop
			{
				System.out.println("LiveTech");
			}
		}
		
		System.out.println("*****************");
		
		for (int i=1;i<=5;i++)
		{
			for (int k=0;k<i;k++)
			{
				System.out.println(i);
			}
		}
		
System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		for (int i=1;i<=5;i++)
		{
			for (int k=0;k<i;k++)
			{
				System.out.println(k);
			}
		}
		
System.out.println("###########################");
		
		for (int i=1;i<=5;i++)
		{
			for (int k=0;k<4;k++)
			{
				System.out.println(k);
			}
		}
		
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		for (int i=1;i<=5;i++)
		{
			for (int k=0;k<i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		for (int i=1;i<=5;i++)
		{
			for (int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		for (int i=1;i<5;i++)
		{
			for (int k=0;k<i;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
System.out.println("++++++++++++++++++++++++++++++++++");
		
		for (int i=1;i<=5;i++)
		{
			System.out.println();
			for (int k=0;k<i;k++)
			{
				System.out.print(i);
			}
		}
		
		System.out.println();  //execute in next line 
System.out.println("===================================");
		
		for (int i=1;i<=5;i++)
		{
			System.out.println(i);
			for (int k=0;k<i;k++)
			{
				System.out.print(k);
			}
		}
	}
	
}
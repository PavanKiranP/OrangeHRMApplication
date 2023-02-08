package JavaKeyWords;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		 for(int i=1;i<=5;i++)
		 {
			 if (i == 3)
			 {
				 System.out.println(i+"Selenium");
			 }
		 }
		 
		System.out.println("++++++++++  Break Key Word  ++++++++++");
		
		 for (int i=1;i<=5;i++)
		 {
			 if (i == 3)
			 {
			 break;  //It Immediately stops the program Execution
			 }
		 
		 System.out.println(i+"Selenium");
		 }
		 
		 System.out.println("+++++++++++++  Continue Key Word  +++++++++++++++++");
		 

		 for (int i=1;i<=5;i++)
		 {
			 if (i == 3)
			 {
			 continue;  //skips the current loops statements Execution and continues with rest iterations
			 			//depending on the loop condition
			 }
		 
		 System.out.println(i+"Testing");
		 }
		 
		 System.out.println("**********************");
		 
		 for (int i= 1;i<=5;i++)
		 {
			 if(i == 3)
			 {
				 
			 }
			 System.out.println(i+"Slenium");
		 }
	}

}
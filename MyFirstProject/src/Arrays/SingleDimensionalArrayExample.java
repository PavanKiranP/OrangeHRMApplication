package Arrays;


public class SingleDimensionalArrayExample {

	public static void main(String[] args) {
		
		/*
		 int var=10;
		 var = 20;
		 System.out.println(var);
		 */
		
		//dataType arrayName[]=new dataType[size]
		int array1[]=new int[4];
		array1[0]=10;
		array1[1]=40;
		array1[2]=20;
		array1[3]=30;
		for(int index=0;index<=3;index++)
		{
			System.out.println(array1[index]);
		}
		System.out.println();
		//OR
		for(int index=0;index<array1.length;index++)
		{
			System.out.println(array1[index]);
		}
		
		//Array when created -dataType should be declared
		//Array when created - size of the array should be declared
		//Array is capable of saving dataType values
		//Array starts with 0
		//Array when created with size - if a value is not assigned to an index then it saves with default value as 0
		//Array will not allow to save even an extra value more than the size declared
		System.out.println("*********** for Each loop *************");
		String array2[]=new String[3];
		array2[0]="Testing";
		array2[1]="Selenium";
		array2[2]="LoadRunner";
		/*
		 for(dataType variable/index:arrayName)
		 {
		 System.out.println(index/variable);
		 }
		 */
		for(String index:array2)
		{
			System.out.println(index);
		}
	}

}

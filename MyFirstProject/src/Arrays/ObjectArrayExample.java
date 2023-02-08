package Arrays;

public class ObjectArrayExample {

	public static void main(String[] args) {
		
		
		//Oject aarayName[]=new Object[size]
		Object array1[]=new Object[4];
		array1[0]="Selenium";
		array1[1]='A';
		array1[2]=10;
		array1[3]=10.123;
		System.out.println("******* For Loop ********");
		for(int index=0;index<array1.length;index++)
		{
			System.out.println(array1[index]);
		}
		System.out.println("******** For Each Loop ***********");
		for(Object index: array1)
		{
			System.out.println(index);
		}
	}

}
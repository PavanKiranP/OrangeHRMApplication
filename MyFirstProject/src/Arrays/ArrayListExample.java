package Arrays;

import java.util.ArrayList;
import java.util.List;



public class ArrayListExample {

	public static void main(String[] args) {
		
		//List is From the Collections Of Java
		List <Object> arrayList1 = new ArrayList <Object> ();
		arrayList1.add(10);
		arrayList1.add("Testing");
		arrayList1.add('A');
		arrayList1.add(10.123);
		arrayList1.add("Hello101");
		for(int index=0;index<arrayList1.size();index++)
		{
			System.out.println(arrayList1.get(index));
		}
		System.out.println("*******For Each Loop********");
		for(Object index:arrayList1)
		{
			System.out.println(index);
		}
	}

}

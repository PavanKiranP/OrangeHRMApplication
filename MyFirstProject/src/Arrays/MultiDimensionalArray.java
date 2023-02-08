package Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		//dataType arrayName[][]=new datyaType[size][size]
		String array1[][]=new String[2][2];
		array1[0][0]="Pavan";
		array1[0][1]="ManualTesting";
		array1[1][0]="Kiran";
		array1[1][1]="Selenium";
		/*
		 System.out.println(array1[1][0]);
		 System.out.println(array1[1[1]);
		 */
		for(int rowIndex=0;rowIndex<array1.length;rowIndex++)//will go to all the Rows
		{
			//to go to all Rows of Cells
			for(int rowOfCellIndex=0;rowOfCellIndex<array1.length;rowOfCellIndex++)
			{
				System.out.println(array1[rowIndex][rowOfCellIndex]+"  ");
			}
			System.out.println();
		}

	}

}

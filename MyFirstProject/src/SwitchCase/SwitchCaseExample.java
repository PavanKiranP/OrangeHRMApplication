package SwitchCase;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		int weekDay=5;
		
		switch (weekDay){
		
		case 1:
			System.out.println("MonDay");
		break;
		case 2:
			System.out.println("TuesDay");
		break;
		case 3:
			System.out.println("WednesDay");
		break;
		case 4:
			System.out.println("ThursDay");
		break;
		case 5:
			System.out.println("FriDay");
		break;
		case 6:
			System.out.println("SaturDay");
		case 7:
			System.out.println("SunDay");
		break;
		
		default:
			
			System.out.println("WeekDay not Matching Expression Value");

		}

	
	}
}

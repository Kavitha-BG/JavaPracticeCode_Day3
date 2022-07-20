
public class NestingIf1 {
	public static void main(String [] args) {
		int age = 15;
		double height = 47;
		
		if( age >= 10 ) { //outer if
			if ( height >=46 ) //inner if
				System.out.println("Enjoy Adventure ride");
		} else //corresponding to outer if
			System.out.println("Sorry, Your age is less than 10.");
		
		
	}
}

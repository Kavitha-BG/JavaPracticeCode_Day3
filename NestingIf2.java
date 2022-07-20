
public class NestingIf2 {
	public static void main(String [] args) {
		int duration = 6;
		
		if( duration > 2 ) //outer if
			if ( duration > 4 ) //inner if1
				if( duration < 7 ) //inner if2
					System.out.println("A");
			else //corresponding to inner if1
				System.out.println("B");
		else //corresponding to outer if
			System.out.println("C");
	}
}

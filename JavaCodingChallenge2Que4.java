/*if end = 10, OUTPUT = 1, 3, 5, 7, 9
if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11*/
public class JavaCodingChallenge2Que4 {
	public static void main(String [] args) {
		int start=1, end = 10;
		
		while( start <= end ) {
			if( start % 2 != 0) {
				System.out.print( start );
				
				if ( end % 2 == 0 ) { //even
					
					if( start != (end-1) ) {
						 System.out.print(", ");
					 }
				} else {
					
						 if ( start != end ) {
							 System.out.print(", ");
						 }
					}
			}
			start++;
		}
	}
}


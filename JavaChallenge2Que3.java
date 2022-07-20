//to print Even numbers from 1 to 100

public class JavaChallenge2Que3 {
	public static void main(String [] args) {
		int start = 1, end = 100;
		
		while( start <= end ) {
			if ( start % 2 == 0 ) {
			System.out.println(start);
			}
			start++;
		}
	}
}

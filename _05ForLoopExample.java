
public class _05ForLoopExample {

	public static void main(String[] args) {
		
		for ( int i = 0; i < 5 ; i++) {
			System.out.println("i = "+i);
		}
		
		System.out.println("----------------------");
		
		for ( int i = 0; i < 5 ; ) {
			System.out.println("i = "+i++);
		}
		
		System.out.println("----------------------");
		
		for ( int i = 0; i < 5 ; System.out.println("i = "+i++)) {
			
		}
	}

}

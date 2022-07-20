
public class NestedFor2 {

	public static void main(String[] args) {
		for ( int i=1; i<=5 ; i++ ) { //Outer for loop
			for ( int j=1; j<=i ; j++ ) { //Inner for loop
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}


public class NestedFor {

	public static void main(String[] args) {
		for ( int i=1; i<=3 ; i++ ) { //Outer for loop
			for ( int j=1; j<=2 ; j++ ) { //Inner for loop
				System.out.println(i + " " + j);
			}
		}
	}

}

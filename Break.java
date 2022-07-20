
public class Break {

	public static void main(String[] args) {
		int ub=20;
		for ( int i = 1; i <= 100000; i++ ) {
			System.out.println(i);
			if(i == ub) {
				break;
			}
		}
	}

}

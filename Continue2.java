
public class Continue2 {

	public static void main(String[] args) {
		int search =  24;
		int	count = 0;
		outer:
		for ( int row = 1; row <= 100; row++ ) {
			inner:
			for ( int col = 1; col <= 10; col++ ) {
				int num = row * col;
				if(num == search) {
					count++;
					if(col == 1) {
						break outer;
					}
					continue outer;
				}
			}
		}
		System.out.println(search + " appears " + count + " times.");
	}
}

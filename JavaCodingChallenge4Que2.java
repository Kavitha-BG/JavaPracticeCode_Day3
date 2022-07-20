
public class JavaCodingChallenge4Que2 {

	public static void main(String[] args) {
		int i=0;
		while( ++i <= 7 ) {
			int j= 0;
			while ( ++j <= i ) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

//Print the multiples of 5 starting from 200 to 5

public class JavaCodingChallenge3Que3 {
	public static void main(String [] args) {
		for(int i= 200; i >= 5 ; i--) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}

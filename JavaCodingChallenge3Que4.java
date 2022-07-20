//Print the table of 12 using for loop

public class JavaCodingChallenge3Que4 {
	public static void main(String [] args) {
//		int i=1;
//		do {
//			if(i % 5 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}while(i <= 200);
		for (int i=200; i >= 5; ) {
			System.out.println(i);
			i=i-5;
		}
	}
}

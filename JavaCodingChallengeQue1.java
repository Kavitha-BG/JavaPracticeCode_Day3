
public class JavaCodingChallengeQue1 {
	public static void main(String [] args) {
		int marks = 85;
		
		if ( marks >= 90 ) {
			System.out.println("Passed with Distinction");
		}
		else if ( marks >= 60 && marks < 90 ) {
			System.out.println("Pass");
		}
		else if (marks < 60) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid marks");
		}
	}
}

/*If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.*/
public class JavaChallenge2Que2 {
	public static void main(String [] args) {
		int ctr = 1, sum = 0;
		int ub = 5;
		
		while( ctr <= ub) {
			sum += ctr;
			ctr++;
		}
		System.out.print("Sum of the numbers from 1 to "+ ub + " = " + sum + ".");
	}
}

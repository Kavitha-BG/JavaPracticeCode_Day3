
public class Return2 {
	public static void main(String [] args){
		System.out.println("Loop starts.");
		for(int i=1; i <= 10; i++) {
			System.out.println(i);
			if(i == 2) {
				return;
			}
		}
		System.out.println("Loop ends.");
	}
}

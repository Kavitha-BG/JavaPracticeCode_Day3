
public class LabelledStmts {
	public static void main ( String [] args) {
		int i=1;
		if_label:
			if(i==1) {
				System.out.println("A");
			}
		switch_label:
			switch(i) {
				case 1:
					System.out.println("B");
				case 2:
					System.out.println("C");
			}
		while_label:
			while(i > 1) {
				System.out.println("D");
			}
		do_while_label:
			do {
				System.out.println("D");
			}while (i>1);
	}
}

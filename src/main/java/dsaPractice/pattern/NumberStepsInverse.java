package dsaPractice.pattern;

//12345
//1234
//123
//12
//1
//

public class NumberStepsInverse {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n + 1; i++) {
			for (int j = 1; j <= (n + 1) - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

package dsaPractice.pattern;

//To print spaces,pattern,spaces n=5

//    *         [4,1,4]      space:n-i-1: 5-0-1=4
//   ***        [3,3,3]      pattern: 2*i+1 : 2*0+1=1
//  *****  		[2,5,7]
// ******* 		[1,7,1]
//*********		[0,9,0]


public class MountainPattern {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
		
			// star
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			
			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();

		}

	}

}

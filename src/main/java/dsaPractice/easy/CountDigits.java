package dsaPractice.easy;

//Input:
//N = 12
//Output:
//2
//Explanation:
//1, 2 both divide 12 evenly
//Example 2:
//
//Input:
//N = 23
//Output
//0
//Explanation:
//2 and 3, none of them
//divide 23 evenly
public class CountDigits {
	public static void main(String[] args) {
		int n = 23;
		int temp = n;
		int count = 0;
		while (temp > 0) {
			int r = temp % 10;
			if (n % r == 0) {
				count++;
			}
			temp=temp/10;

		}
		System.out.println(count);

	}

}

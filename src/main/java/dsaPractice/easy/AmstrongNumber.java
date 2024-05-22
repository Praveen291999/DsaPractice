package dsaPractice.easy;

/*Input: 120
Output: No
120 is not a Armstrong number.
1*1*1 + 2*2*2 + 0*0*0 = 9

Input: 1634
Output: Yes
1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634*/

//based on the input legth we have to multiply that many times
public class AmstrongNumber {
	public static void main(String[] args) {
		int n = 1634;
		System.out.println(isAmstrongNumber(n));

	}

	private static boolean isAmstrongNumber(int n) {

		int temp = n;
		double sum = 0;
		int nlength = String.valueOf(n).length();
		while (n > 0) {
			int r = n % 10;
			sum = sum + Math.pow(r, nlength);
			n = n / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}

	}
}

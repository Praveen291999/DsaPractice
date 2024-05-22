package dsaPractice.easy;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int temp = x;
		int reverse = 0;
		while (x > 0) {
			int r = x % 10;
			reverse = reverse * 10 + r;
			x = x / 10;
		}
		if (temp == reverse) {
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

}

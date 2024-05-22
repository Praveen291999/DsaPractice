package dsaPractice.easy;

//Input:
//A = 5 , B = 10
//Output:
//10 5
//Explanation:
//LCM of 5 and 10 is 10, while
//thier GCD is 5.
//Example 2:
//
//Input:
//A = 14 , B = 8
//Output:
//56 2
//Explanation:
//LCM of 14 and 8 is 56, while
//thier GCD is 2.

//Euclidean algorithm: a=b(q)+r    ->when b becomes 0 a will be gcd

public class LcmAndGcd {
	static Long[] lcmAndGcd(Long A, Long B) {
		Long gcd = gcd(A, B);
		Long lcm = (A * B) / gcd;
		Long[] a=new Long[]{lcm,gcd};
		return a;   //new Long[] { lcm, gcd };
	}

	private static Long gcd(Long a, Long b) {
		// based on euclidean Algorith
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		Long A = 8L;
		Long B = 14L;
		Long[] result = lcmAndGcd(A, B);
		System.out.println("LCM: " + result[0] + ", GCD: " + result[1]);
	}
}

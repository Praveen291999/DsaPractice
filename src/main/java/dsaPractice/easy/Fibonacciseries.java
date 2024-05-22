package dsaPractice.easy;

//Fibonacciseries
//0 1 1 1 2 3 5 8

public class Fibonacciseries {
	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		int next = 0;
		System.out.print(a+" "+b);
		while (next <= n) {
            System.out.print(" " + b);
            next = a + b;
            a = b;
            b = next;
        }
	}

//	private static int fibSeries(int n) {
//		if(n<=1) {
//			return n;
//		}
//		int a=0;
//		int b=1;
//		for(int i=2;i)
//	}

}

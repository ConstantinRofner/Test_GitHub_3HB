package rekursion;

public class binomialCoefficient {

	public static int bK(int n, int k) {
		if(k == 0 || k == n) {
			return 1;
		}else {
			return bK(n-1, k-1) + bK(n-1, k);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(bK(10, 20));
	}
}
package palindrome;

public class PalindromeEx {

	public static void main(String[] args) {

		PalindromeEx p = new PalindromeEx();

		System.out.println(p.isPalindrome(121));
		System.out.println(p.isPalindrome(-121));
		System.out.println(p.isPalindrome(10));
	}

	public boolean isPalindrome(int x) {
		if(x < 0) {
			return false;
		}
		
		int original = x;
		int reverse = 0;
		
		while (x != 0) {
			int last = x % 10;
			reverse = reverse *10 +last;
		}
		
		return original == reverse;
		
	}

}

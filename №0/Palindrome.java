import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������: ");
		String str = scan.next();
		if(reverseString(str))
			System.out.print("�����������");
		else
			System.out.print("�� �����������");
	}
	public static boolean reverseString(String s) {
		for (int i = 0; i < s.length()/2; i++)
			if(s.charAt(i) != s.charAt(s.length()-i-1))
				return false;
			return true;
	}
}
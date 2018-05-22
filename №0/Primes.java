import java.util.Scanner;

public class Primes {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.print("Ввод натурального числа n: ");
		int n = scan.nextInt();
		isPrime(n);	
	}
	public static void isPrime(int n) {
		boolean change;
		for(int i = 2; i <= n; i++) {
			change = true;
				for (int j = 2 ; j < i; j++) 
					if(i % j == 0 && j != i)
						change = false;
				if(change)
					System.out.print(i + " ");
			}
		}
	}

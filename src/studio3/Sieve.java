package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		//int[] array = {};
		boolean[] isPrime = new boolean[n+1];
		
		if(n <2) {
			return;
		}
		
		for(int i = 0; i <= n; i++) {
			isPrime[i] = true;
		}

		isPrime[0] = false;
		isPrime[1] = false;
		
		
		for(int i = 2; i*i <= n; i++) {
			
			if(isPrime[i] == true) {
				for(int mult = i*i; mult <= n; mult += i) {
					isPrime[mult] = false;
				}
			}
		}
		
		System.out.println("primes up to " + n);
		for(int i = 2; i<=n; i++) {
			if (isPrime[i] == true) {
				System.out.print(i + " ");
			}
		}
		

	}

}

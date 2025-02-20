package application;

import java.util.Scanner;

public class NumeroNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números irá digitar?");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite os números: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (vect[i] < 0 ) {
				System.out.print("Números negativos: ");
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}

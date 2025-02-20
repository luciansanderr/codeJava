package application;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas irá cadastrar?");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		double somaAltura = 0;
		double media = 0;
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
			
			somaAltura += vect[i].getAltura();
			media = somaAltura / n;
		}
		for (int i=0; i<n; i++) {
			System.out.println("Pessoas cadastradas: " 
					+ "Nome: " + vect[i].getNome() + ", "
					+ "Idade: " + vect[i].getIdade() + ", "
					+ "Altura: " + vect[i].getAltura());
	    }
		System.out.printf("Média das alturas %.2f%n", media );
        System.out.println("Existem " + Pessoa.count(vect, n) + " pessoas maiores que 16.");
		sc.close();
	}
}

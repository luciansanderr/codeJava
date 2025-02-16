package entities;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	
	public Pessoa (String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public static int count(Pessoa[] pessoas, int n) {
	    int count = 0;
	    for (int i = 0; i < n; i++) {
	        if (pessoas[i].getIdade() > 16) {
	            count++;
	        }
	    }
	    return count;
	}
}
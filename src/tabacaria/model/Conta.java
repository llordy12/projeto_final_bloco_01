package tabacaria.model;

public abstract class Conta {

	private String nome;
	private int idade;
	private int saldo;

	public Conta(String nome, int idade, int saldo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		
		if(idade < 18) {
			System.out.println("Proibido para menores de 18 anos. ");
		}
		this.idade = idade;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int f) {
		this.saldo = f;
	}
	


}



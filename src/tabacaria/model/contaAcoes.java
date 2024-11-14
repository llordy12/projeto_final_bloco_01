package tabacaria.model;

public class contaAcoes extends Conta {

	public contaAcoes(String nome, int idade, int saldo) {
		super(nome, idade, saldo);

	}

	public boolean comprar(float valor) {

		if (this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}

		this.setSaldo((int) (this.getSaldo() - valor));
		return true;
	}
	public void depositar(float valor) {

		this.setSaldo((int) (this.getSaldo() + valor));

	}
	
	public void visualizar() {

		System.out.println(getSaldo());
	}
  


}

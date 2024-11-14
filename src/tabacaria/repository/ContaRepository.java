package tabacaria.repository;

import java.util.Scanner;

public interface ContaRepository {

	// CRUD da Conta
	public void cadastrar(Scanner scanner);

	public void depositar(int numero, float valor);

	// CRUD MENU
	public void exibirProdutosEmDestaque();

	public void exibirCarrinhoDeCompras();

	public void buscarProdutos();
	
	public void excluirConta();
	
	public void exibirAjudaESuporte();

	void exibirHome();
	
	
	
}
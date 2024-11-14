package tabacaria.repository;

import java.util.Scanner;

import tabacaria.model.Conta;

public interface ContaRepository {

	// CRUD da Conta
	public void cadastrar(Conta conta);

	public void comprar(int numero, float valor);

	public void depositar(int numero, float valor);

	// CRUD MENU
	public void exibirProdutosEmDestaque();

	public void exibirCarrinhoDeCompras();

	public void buscarProdutos();

	public void exibirMinhaConta();

	public void exibirAjudaESuporte();
}
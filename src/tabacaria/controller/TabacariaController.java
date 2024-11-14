package tabacaria.controller;

import java.util.Scanner;

public class TabacariaController {

    public void exibirHome() {
        System.out.println("Bem-vindo à página inicial! Aqui você encontra novidades e promoções da Hec's Tabacaria.");
    }

    public void exibirCategorias(Scanner scanner) {
        System.out.println("Categorias:");
        System.out.println("1. Narguilés");
        System.out.println("2. Essências");
        System.out.println("3. Carvões");
        System.out.println("4. Acessórios");
        System.out.println("5. Kits de Narguilé");
        System.out.print("Escolha uma categoria para visualizar produtos: ");
        int categoria = scanner.nextInt();
        
        System.out.println("Exibindo produtos da categoria " + categoria);
    }

    public void exibirProdutosEmDestaque() {
        System.out.println("Produtos em Destaque:");
        System.out.println("- Narguilé modelo Marajah");
        System.out.println("- Essência sabor Maçã Verde");
    }


    public void buscarProdutos(Scanner scanner) {
        System.out.print("Digite o nome do produto que deseja buscar: ");
        String produto = scanner.next();
        System.out.println("Resultados para '" + produto + "':");
        System.out.println("- Essência sabor " + produto);
    }



    public void exibirAjudaESuporte() {
        System.out.println("Ajuda e Suporte:");
        System.out.println("Entre em contato conosco pelo e-mail suporte@tabacaria.com");
    }
}

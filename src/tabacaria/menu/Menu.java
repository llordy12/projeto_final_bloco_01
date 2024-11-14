package tabacaria.menu;

import java.util.Scanner;

import tabacaria.controller.TabacariaController;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TabacariaController controller = new TabacariaController();
        int choice;

        do {
            System.out.println("========= Bem-vindo à Tabacaria =========");
            System.out.println("1. Home");
            System.out.println("2. Categorias");
            System.out.println("3. Produtos em Destaque");  
            System.out.println("4. Buscar Produtos");
            System.out.println("5. Ajuda e Suporte");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.exibirHome();
                    break;
                case 2:
                    controller.exibirCategorias(scanner);
                    break;
                case 3:
                    controller.exibirProdutosEmDestaque();
                    break;
                case 4:
                    controller.buscarProdutos(scanner);
                    break;
                case 5:
                    controller.exibirAjudaESuporte();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Obrigado por visitar a Tabacaria!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}

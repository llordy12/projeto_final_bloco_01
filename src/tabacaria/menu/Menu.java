package tabacaria.menu;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("========= Bem-vindo à Tabacaria =========");
            System.out.println("1. Criar Conta");
            System.out.println("2. Categorias");
            System.out.println("3. Produtos em Destaque");
            System.out.println("4. Buscar Produtos");
            System.out.println("5. Ajuda e Suporte");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                                  
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Obrigado por visitar a Tabacaria!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }

    

}

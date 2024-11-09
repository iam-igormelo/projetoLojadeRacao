package LojadeRacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario("Marcos", "marcos2024", "marcos123");
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        while(menu){
            System.out.println("================================");
            System.out.println("===== BEM VINDO AO PETFOOD =====");
            System.out.println("================================");
            System.out.println("1. Realizar Venda.");
            System.out.println("2. Ver Estoque.");
            System.out.println("3. Ver Historico.");
            System.out.println("4. Cadastrar Produto.");
            System.out.println("5. Remover Produto.");
            System.out.println("6. Sair.");
            System.out.print("Escolha um opcao: ");
            int opcaoMenu = scanner.nextInt();
            if(opcaoMenu == 1) {
                System.out.println("Vendendo produto");
            } else if(opcaoMenu == 2) {
                funcionario.verEstoque();
            } else if(opcaoMenu == 3) {
                funcionario.verHistorico();
            } else if(opcaoMenu == 4) {
                System.out.println("Qual produto deseja cadastrar?");
            } else if(opcaoMenu == 5) {
                System.out.println("Qual produto deseja remover?");
            } else if(opcaoMenu == 6) {
                menu = false;
            } else {
                System.out.println("Opcao invalida!");
            }
        }

        scanner.close();
        System.out.println("PROGRAMA ENCERRADO");

        // funcionario.verEstoque();

        // funcionario.removerProduto("Pedigree", 1);
        // funcionario.removerProduto("Pedigree", 2);
        // funcionario.removerProduto("Whiskas", 3);

        // funcionario.verEstoque();

        // funcionario.realizarVenda("Pedigree", 2);
        // funcionario.realizarVenda("Pedigree", 3);
        // funcionario.realizarVenda("Pedigree", 1);

        // funcionario.verHistorico();

        // funcionario.verEstoque();

        // funcionario.cadastrarProduto("Pedigree", "Cachorro", 45.20, 3);
        // funcionario.cadastrarProduto("Whiskas", "Gato", 30.50, 3);
        // funcionario.cadastrarProduto("Pedigree", "Cachorro", 45.20, 4);
        // funcionario.cadastrarProduto("Pedigree", "Cachorro", 45.20, 10);

        // funcionario.verEstoque();

        // funcionario.removerProduto("Pedigree", 30);

        // funcionario.verEstoque();

        // funcionario.removerProduto("Pedigree", 22);

        // funcionario.verEstoque();

        // funcionario.realizarVenda("Pedigree", 22);

        // funcionario.verEstoque();
    }
}

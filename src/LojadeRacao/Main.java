package LojadeRacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario("Marcos", "marcos2024", "marcos123");
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        while(menu){
            System.out.println("===============================");
            System.out.println("BEM VINDO AO IMPERIO DAS RACOES");
            System.out.println("===============================");
            System.out.println("1. Realizar Venda.");
            System.out.println("2. Ver Estoque.");
            System.out.println("3. Ver Historico.");
            System.out.println("4. Cadastrar Produto.");
            System.out.println("5. Remover Produto.");
            System.out.println("6. Sair.");

            int opcaoMenu = 0;
            boolean validInput = false;
            
            while (!validInput) {
                try {
                    System.out.print("Escolha uma opção (1-6): ");
                    opcaoMenu = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    validInput = true;  // Se a entrada for válida, sai do loop
                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida! Por favor, insira um número entre 1 e 6.");
                    scanner.nextLine(); // Limpa o buffer após o erro de entrada
                }
            }

            switch (opcaoMenu) {
                case 1:
                    System.out.print("Qual produto deseja vender? ");
                    String nomeProdutoVenda = scanner.nextLine();
                    System.out.print("Qual a categoria? ");
                    String categProdutoVenda = scanner.nextLine();
                    System.out.print("Qual a quantidade? ");
                    int quantProdutoVenda = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    funcionario.realizarVenda(nomeProdutoVenda, categProdutoVenda, quantProdutoVenda);
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    funcionario.verEstoque();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    funcionario.verHistorico();
                    break;
                case 4:
                    System.out.println("Qual produto deseja cadastrar?");
                    System.out.print("Nome: ");
                    String nomeNovoProduto = scanner.nextLine();
                    System.out.print("Qual a categoria? ");
                    String categNovoProduto = scanner.nextLine();
                    System.out.print("Qual o preco? ");
                    double valorNovoProduto = scanner.nextDouble();
                    System.out.print("Qual a quantidade? ");
                    int quantNovoProduto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    funcionario.cadastrarProduto(nomeNovoProduto, categNovoProduto, valorNovoProduto, quantNovoProduto);
                    break;
                case 5:
                    System.out.print("Qual produto deseja remover? ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Qual a categoria? ");
                    String categProduto = scanner.nextLine();
                    System.out.print("Qual a quantidade? ");
                    int quantProduto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    funcionario.removerProduto(nomeProduto, categProduto, quantProduto);
                    break;
                case 6:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    menu = false;
                    break;
                default:
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
        scanner.close();
        System.out.println("PROGRAMA ENCERRADO");
    }
}

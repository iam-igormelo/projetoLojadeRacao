package LojadeRacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Usuarios {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        boolean login = false;
        while (login == false) {
            System.out.println("===============================");
            System.out.println("BEM VINDO AO IMPERIO DAS RACOES");
            System.out.println("===============================");

            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("USUARIO: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("SENHA: ");
                    String senhaUsuario = scanner.nextLine();

                    if(verificarUsuario(nomeUsuario, senhaUsuario) == false) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("===============================");
                        System.out.println("BEM VINDO AO IMPERIO DAS RACOES");
                        System.out.println("===============================");
                        System.out.println("Login invalido, tente novamente!");
                    } else {
                        login = true;
                        validInput = true;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Usuario invalido! Por favor, tente novamente.");
                    scanner.nextLine(); // Limpa o buffer após o erro de entrada
                }
            }

            System.out.print("\033[H\033[2J");
            System.out.flush();

            boolean menu = true;
            while(menu){
                if(menu == false) {
                    break;
                }
                System.out.println("===============================");
                System.out.println("BEM VINDO AO IMPERIO DAS RACOES");
                System.out.println("===============================");
                System.out.println("1. Realizar Venda.");
                System.out.println("2. Ver Estoque.");
                System.out.println("3. Ver Historico.");
                System.out.println("4. Cadastrar Produto.");
                System.out.println("5. Remover Produto.");
                if (usuarioLogado.getNome() == "Administrador") {
                    System.out.println("6. Cadastrar Usuario.");
                    System.out.println("7. Remover Usuario.");
                    System.out.println("8. Usuarios Cadastrados.");
                    System.out.println("9. Deslogar.");
                    System.out.println("10. Sair.");
                } else {
                    System.out.println("6. Deslogar.");
                    System.out.println("7. Sair.");
                }
                
                int opcaoMenu = 0;
                validInput = false;
            
                while (!validInput) {
                    try {
                        System.out.print("O que deseja fazer? ");
                        opcaoMenu = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer
                        validInput = true;  // Se a entrada for válida, sai do loop
                    } catch (InputMismatchException e) {
                        System.out.println("Opção inválida! Por favor, tente novamente.");
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
                        usuarioLogado.realizarVenda(nomeProdutoVenda, categProdutoVenda, quantProdutoVenda);
                        break;
                    case 2:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        usuarioLogado.verEstoque();
                        break;
                    case 3:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        usuarioLogado.verHistorico();
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
                        usuarioLogado.cadastrarProduto(nomeNovoProduto, categNovoProduto, valorNovoProduto, quantNovoProduto);
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
                        usuarioLogado.removerProduto(nomeProduto, categProduto, quantProduto);
                        break;
                    case 6:
                        if (usuarioLogado.getNome() == "Administrador") {
                            System.out.println("Qual usuario deseja cadastrar?");
                            System.out.print("Nome: ");
                            String nomeNovoUsuario = scanner.nextLine();
                            System.out.print("Login: ");
                            String loginNovoUsuario = scanner.nextLine();
                            System.out.print("Senha: ");
                            String senhaNovoUsuario = scanner.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            novoUsuario(nomeNovoUsuario, loginNovoUsuario, senhaNovoUsuario);
                        } else {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            login = false;
                            menu = false;
                        }
                        break;
                    case 7:
                        if (usuarioLogado.getNome() == "Administrador") {
                            System.out.println("Qual usuario deseja remover?");
                            System.out.print("Nome: ");
                            String nomeNovoUsuario = scanner.nextLine();
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            removerUsuario(nomeNovoUsuario);
                        } else {
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            menu = false;
                        }
                        break;
                    case 8:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        if (usuarioLogado.getNome() == "Administrador") {
                            verUsuarios();
                        } else {
                            menu = false;
                        }
                        break;
                    case 9:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        if (usuarioLogado.getNome() == "Administrador") {
                            menu = false;
                            login = false;
                        } else {
                            login = false;
                        }
                        break;
                    case 10:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        if (usuarioLogado.getNome() == "Administrador") {
                            menu = false;
                        } else {
                            System.out.println("Opcao invalida!");
                        }
                        break;
                    default:
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Opcao invalida!");
                        break;
                }
            }
        }
        scanner.close();
        System.out.println("PROGRAMA ENCERRADO");
    }
}

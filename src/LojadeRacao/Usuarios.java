package LojadeRacao;

import java.util.ArrayList;

public class Usuarios {
    public static ArrayList<Funcionario> usuarios = new ArrayList<>();
    public static Funcionario usuarioLogado;

    static {
        usuarios.add(new Funcionario("Administrador", "admin", "admin123"));
        usuarios.add(new Funcionario("Vendedor", "vendedor", "vendedor123"));
    }

    public static boolean verificarUsuario(String login, String senha) {
        for (Funcionario funcionario : usuarios) {
            if (funcionario.getLogin().equalsIgnoreCase(login) && funcionario.getSenha().equalsIgnoreCase(senha)) {
                usuarioLogado = funcionario;
                return true;
            }
        }
        return false;
    }

    public static void novoUsuario(String nome, String login, String senha) {
        Funcionario funcionario = new Funcionario(nome, login, senha);
        usuarios.add(funcionario);
        System.out.println("Usuario cadastrado com sucesso!");
    }

    public static void removerUsuario(String nome) {
        if (nome.equalsIgnoreCase("Administrador")) {
            System.out.println("Nao e possivel remover uma conta de administrador.");
            return;
        } else {
            for (Funcionario funcionario : usuarios) {
                if (funcionario.getNome().equalsIgnoreCase(nome)) {
                    usuarios.remove(funcionario);
                    System.out.println("Usuario removido com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Usuario nao encontrado!");
    }

    public static void verUsuarios() {
        System.out.println("====================== USUARIOS CADASTRADOS =======================");
        for(Funcionario funcionario : usuarios) {
            System.out.println(funcionario);
        }
        System.out.println("===================================================================");
    }
}

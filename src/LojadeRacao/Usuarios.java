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

    public void novoUsuario(String nome, String login, String senha) {
        Funcionario funcionario = new Funcionario(nome, login, senha);
        usuarios.add(funcionario);
    }
}

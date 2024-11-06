package LojadeRacao;

public class Funcionario {
    private String nome;
    private String login;
    private String senha;
    private Estoque estoque;

    // CONSTRUTOR
    public Funcionario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    // METODOS
    public void cadastrarProduto(String nome, String categoria, float preco) {
  
    }

    public void realizarVenda(Produto produto, int quantidade, double valor) {

    }


    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
}

package LojadeRacao;


public class Funcionario extends Estoque {
    private String nome;
    private String login;
    private String senha;
    private HistoricoVenda historico = new HistoricoVenda();

    // CONSTRUTOR
    public Funcionario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public void realizarVenda(String nome, String categoria, int quantidade) {
        if(removerProduto(nome, categoria, quantidade) == 1) {
            System.out.println("VENDA REALIZADA!");
            historico.registrarVenda(nome, quantidade);
        } else {
            System.out.println("A venda nao pode ser realizada.");
        }
    }

    public void verHistorico() {
        historico.verHistorico();
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
}

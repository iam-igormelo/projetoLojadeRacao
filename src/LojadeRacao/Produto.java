package LojadeRacao;

public class Produto {
    // ATRIBUTOS
    private String nome;
    private String categoria;
    private double preco;
    private int quantidade;

    // CONSTRUTOR
    public Produto(String nome, String categoria, double preco, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // METODO PARA LISTAR O PRODUTO
    @Override
    public String toString() {
        return "Nome=" + nome +", Categoria=" + categoria + ", Preco=R$" + preco + ", Quantidade=" + quantidade;
    }

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

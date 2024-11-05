package LojadeRacao;

public class Produto {
    // ATRIBUTOS
    private int codigo;
    private String nome;
    private String categoria;
    private float preco;

    // CONSTRUTOR
    public Produto(int codigo, String nome, String categoria, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    // METODO PARA LISTAR O PRODUTO
    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + "]";
    }

    // GETTERS E SETTERS
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
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
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}

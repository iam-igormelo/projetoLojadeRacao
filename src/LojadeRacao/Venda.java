package LojadeRacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
    // ATRIBUTOS
    private String nome;
    private String categoria;
    private double preco;
    private int quantidade;
    private String dataVenda;

    // CONSTRUTOR
    public Venda(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        LocalDateTime data = LocalDateTime.now(); // PEGA A DATA E HORA ATUAL DO SISTEMA
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // CRIA UMA FORMATACAO MAIS LEGIVEL PARA A DATA E HORA
        this.dataVenda = data.format(formato);
    }

    // METODO PARA LISTAR A VENDA
    @Override
    public String toString() {
        return "Nome=" + nome +", Quantidade=" + quantidade + ", Data=" + dataVenda;
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

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    
}

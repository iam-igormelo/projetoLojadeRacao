package LojadeRacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
    // ATRIBUTOS
    private String dataVenda;
    private Produto produto;
    private int quantidade;
    private double valor;

    // CONSTRUTOR
    public Venda(Produto produto, int quantidade, double valor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
        LocalDateTime data = LocalDateTime.now(); // PEGA A DATA E HORA ATUAL DO SISTEMA
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // CRIA UMA FORMATACAO MAIS LEGIVEL PARA A DATA E HORA
        this.dataVenda = data.format(formato);
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}

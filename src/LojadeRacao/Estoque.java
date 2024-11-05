package LojadeRacao;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> estoque = new ArrayList<>();

    public void addProduto(Produto produto) {
        estoque.add(produto);
    }

    public void removerProduto(Produto nome) {
        estoque.remove(nome);
    }

    public void listarProdutos() {
        for(Produto produto : estoque) {
            System.out.println(produto);
        }
    }
}

package LojadeRacao;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> estoque = new ArrayList<>();

    public void cadastrarProduto(String nome, String categoria, double preco) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                // Se o produto já existe, aumenta a quantidade
                produto.setQuantidade(produto.getQuantidade() + 1);
                System.out.println("Produto atualizado: " + produto);
                return;
            }
        }

        // Se o produto não existe, cria um novo com quantidade inicial 1
        Produto novoProduto = new Produto(nome, categoria, preco, 1);
        estoque.add(novoProduto);
        System.out.println("Produto cadastrado: " + novoProduto);
    }

    public void removerProduto(String nome, int quantidade) {
        for (Produto produto : estoque) {
            if(produto.getNome().equalsIgnoreCase(nome)) {
                if(produto.getQuantidade() >= quantidade) {
                    // Se o produto já existe, diminui a quantidade
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    System.out.println("Quantidade do produto " + produto + " atualizada");
                } else if(produto.getQuantidade() <= 0) {
                    // Caso contrário, remove o produto da lista
                    estoque.remove(produto);
                    System.out.println("Produto removido: " + produto);
                } else {
                    System.out.println("Nao tem produto suficiente no estoque, resta(m) apenas " + produto.getQuantidade());
                }
                return; // Interrompe o método
            } 
        }
        System.out.println("Produto não encontrado.");
    }

    public void listarProdutos() {
        for(Produto produto : estoque) {
            System.out.println(produto);
        }
    }
}

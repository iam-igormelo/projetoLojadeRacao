package LojadeRacao;

import java.util.ArrayList;

public class Estoque {
    private static ArrayList<Produto> estoque = new ArrayList<>();

    static {
        estoque.add(new Produto("Pedigree", "Cachorro", 45.20, 20));
        estoque.add(new Produto("Whiskas", "Gato", 30.50, 20));
        estoque.add(new Produto("Nativos", "Passaro", 21.10, 20));
        estoque.add(new Produto("Friskies", "Gato", 25.70, 20));
        estoque.add(new Produto("Dog Chow", "Cachorro", 41.20, 20));
    }

    public void cadastrarProduto(String nome, String categoria, double preco, int quantidade) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                // Se o produto já existe, aumenta a quantidade
                produto.setQuantidade(produto.getQuantidade() + quantidade);
                System.out.println(quantidade + " unidade(s) do produto " + produto.getNome() + " adicionada(s) ao estoque, " + "Quantidade=" + produto.getQuantidade());
                return;
            }
        }

        // Se o produto não existe, cria um novo
        Produto novoProduto = new Produto(nome, categoria, preco, quantidade);
        estoque.add(novoProduto);
        System.out.println("Novo produto cadastrado com sucesso: " + novoProduto);
    }

    public void removerProduto(String nome, int quantidade) {
        for (Produto produto : estoque) {
            if(produto.getNome().equalsIgnoreCase(nome)) {
                if(produto.getQuantidade() >= quantidade) {
                    // Se o produto já existe, diminui a quantidade
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    System.out.println(quantidade + " unidade(s) do produto " + produto.getNome() + " removido(s) do estoque, " + "Quantidade=" + produto.getQuantidade());
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

    public void verEstoque() {
        System.out.println("======================= PRODUTOS EM ESTOQUE =======================");
        for(Produto produto : estoque) {
            System.out.println(produto);
        }
        System.out.println("===================================================================");
    }
}

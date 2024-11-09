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
            if (produto.getNome().equalsIgnoreCase(nome) && produto.getCategoria().equalsIgnoreCase(categoria)) {
                // Se o produto já existe, aumenta a quantidade
                produto.setPreco(preco);
                produto.setQuantidade(produto.getQuantidade() + quantidade);
                System.out.println(quantidade + " unidade(s) do produto " + produto.getNome() + " adicionada(s) ao estoque, " + "Quantidade=" + produto.getQuantidade());
                return;
            } else {
                // Se o produto não existe, cria um novo
                Produto novoProduto = new Produto(nome, categoria, preco, quantidade);
                estoque.add(novoProduto);
                System.out.println("Novo produto cadastrado com sucesso: " + novoProduto);
                return;
            }
        }
    }

    public int removerProduto(String nome, String categoria, int quantidade) {
        for (Produto produto : estoque) {
            if(produto.getNome().equalsIgnoreCase(nome) && produto.getCategoria().equalsIgnoreCase(categoria)) {
                if(produto.getQuantidade() >= quantidade) {
                    // Se o produto já existe, diminui a quantidade
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    System.out.println(quantidade + " unidade(s) do produto " + produto.getNome() + " removido(s) do estoque, " + "Quantidade=" + produto.getQuantidade());
                    return 1;
                } else if(produto.getQuantidade() <= 0) {
                    // Caso contrário, remove o produto da lista
                    estoque.remove(produto);
                    System.out.println("O registro do produto " + produto.getNome() + " foi removido do estoque.");
                    return 2;
                } else {
                    System.out.println("Nao tem produto " + produto.getNome() + " suficiente no estoque, resta(m) apenas " + produto.getQuantidade() + " unidade(s)");
                }
                return 3; // Interrompe o método
            } 
        }
        System.out.println("Produto nao encontrado.");
        return 0;
    }

    public void verEstoque() {
        System.out.println("======================= PRODUTOS EM ESTOQUE =======================");
        for(Produto produto : estoque) {
            System.out.println(produto);
        }
        System.out.println("===================================================================");
    }
}

package LojadeRacao;

public class App {
    public static void main(String[] args) throws Exception {
        // Produto p1 = new Produto("Pedigree", "Cachorro", 45.20f);
        // Produto p2 = new Produto("Whiskas", "Gato", 30.50f);
        // Produto p3 = new Produto("Nativos", "Passaro", 21.10f);
        // Produto p4 = new Produto("Friskies", "Gato", 25.70f);
        // Produto p5 = new Produto("Dog Chow", "Cachorro", 41.20f);


        Estoque estoque = new Estoque();

        // Cadastrando produtos
        estoque.cadastrarProduto("Pedigree", "Cachorro", 45.20);
        estoque.cadastrarProduto("Whiskas", "Gato", 30.50);
        estoque.cadastrarProduto("Pedigree", "Cachorro", 45.20);
        estoque.cadastrarProduto("Pedigree", "Cachorro", 45.20);

        // Listando produtos
        estoque.listarProdutos();

        // // Removendo produtos
        // estoque.removerProduto("Pedigree", 1); // Diminui a quantidade
        // estoque.removerProduto("Pedigree", 2); // Remove a camiseta completamente
        // estoque.removerProduto("Whiskas", 3); // Diminui a quantidade da caneca

        // // Listando novamente
        // estoque.listarProdutos();

    }
}

package LojadeRacao;

public class App {
    public static void main(String[] args) throws Exception {
        Estoque estoque = new Estoque();

        // "Pedigree", "Cachorro", 45.20
        // "Whiskas", "Gato", 30.50
        // "Nativos", "Passaro", 21.10
        // "Friskies", "Gato", 25.70
        // "Dog Chow", "Cachorro", 41.20

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

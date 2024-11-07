package LojadeRacao;

public class Main {
    public static void main(String[] args) throws Exception {
        Estoque estoque = new Estoque();
        HistoricoVenda historico = new HistoricoVenda();

        // "Pedigree", "Cachorro", 45.20
        // "Whiskas", "Gato", 30.50
        // "Nativos", "Passaro", 21.10
        // "Friskies", "Gato", 25.70
        // "Dog Chow", "Cachorro", 41.20

        // Cadastrando produtos
        estoque.cadastrarProduto("Pedigree", "Cachorro", 45.20, 3);
        estoque.cadastrarProduto("Whiskas", "Gato", 30.50, 3);
        estoque.cadastrarProduto("Pedigree", "Cachorro", 45.20, 4);
        estoque.cadastrarProduto("Pedigree", "Cachorro", 45.20, 10);

        // Listando produtos
        estoque.listarProdutos();

        // Removendo produtos
        estoque.removerProduto("Pedigree", 1);
        estoque.removerProduto("Pedigree", 2);
        estoque.removerProduto("Whiskas", 3);

        // Listando novamente
        estoque.listarProdutos();

        // registrando venda
        historico.registrarVenda("Pedigree", 2);
        historico.registrarVenda("Pedigree", 3);
        historico.registrarVenda("Pedigree", 1);

        // listando o historico de vendas
        historico.verHistorico();

    }
}

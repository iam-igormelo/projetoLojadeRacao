package LojadeRacao;

public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario vendedor = new Funcionario("Marcos", "marcos2024", "marcos123");

        // "Pedigree", "Cachorro", 45.20
        // "Whiskas", "Gato", 30.50
        // "Nativos", "Passaro", 21.10
        // "Friskies", "Gato", 25.70
        // "Dog Chow", "Cachorro", 41.20

        // Cadastrando produtos
        vendedor.cadastrarProduto("Pedigree", "Cachorro", 45.20, 3);
        vendedor.cadastrarProduto("Whiskas", "Gato", 30.50, 3);
        vendedor.cadastrarProduto("Pedigree", "Cachorro", 45.20, 4);
        vendedor.cadastrarProduto("Pedigree", "Cachorro", 45.20, 10);

        // vendo estoque
        vendedor.verEstoque();

        // Removendo produtos
        vendedor.removerProduto("Pedigree", 1);
        vendedor.removerProduto("Pedigree", 2);
        vendedor.removerProduto("Whiskas", 3);

        // verificando estoque
        vendedor.verEstoque();

        // registrando venda
        vendedor.realizarVenda("Pedigree", 2);
        vendedor.realizarVenda("Pedigree", 3);
        vendedor.realizarVenda("Pedigree", 1);

        // listando o historico de vendas
        vendedor.verHistorico();

        // Listando produtos
        vendedor.verEstoque();
    }
}

package LojadeRacao;

public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario vendedor = new Funcionario("Marcos", "marcos2024", "marcos123");

        // verificando estoque
        vendedor.verEstoque();

        // removendo produtos
        vendedor.removerProduto("Pedigree", 1);
        vendedor.removerProduto("Pedigree", 2);
        vendedor.removerProduto("Whiskas", 3);

        // verificando estoque
        vendedor.verEstoque();

        // realizando venda
        vendedor.realizarVenda("Pedigree", 2);
        vendedor.realizarVenda("Pedigree", 3);
        vendedor.realizarVenda("Pedigree", 1);

        // verificando historico de vendas
        vendedor.verHistorico();

        // verificando estoque
        vendedor.verEstoque();

        // cadastrando produtos
        vendedor.cadastrarProduto("Pedigree", "Cachorro", 45.20, 3);
        vendedor.cadastrarProduto("Whiskas", "Gato", 30.50, 3);
        vendedor.cadastrarProduto("Pedigree", "Cachorro", 45.20, 4);
        vendedor.cadastrarProduto("Pedigree", "Cachorro", 45.20, 10);

        // verificando estoque
        vendedor.verEstoque();

        // removendo mais produto do que tem no estoque
        vendedor.removerProduto("Pedigree", 30);

        // verificando estoque
        vendedor.verEstoque();
    }
}

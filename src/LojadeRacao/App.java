package LojadeRacao;

public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto(1, "Pedigree", "Cachorro", 45.20f);
        Produto p2 = new Produto(2, "Whiskas", "Gato", 30.50f);
        Produto p3 = new Produto(3, "Nativos", "Passaro", 21.10f);
        Produto p4 = new Produto(4, "Friskies", "Gato", 25.70f);
        Produto p5 = new Produto(5, "Dog Chow", "Cachorro", 41.20f);

        // System.out.println(p1.toString());
        // System.out.println(p2.toString());

        Estoque estoque = new Estoque();
        estoque.addProduto(p1);
        estoque.addProduto(p2);
        estoque.addProduto(p3);
        estoque.addProduto(p4);
        estoque.addProduto(p5);
        estoque.removerProduto(p1);

        estoque.listarProdutos();
    }
}

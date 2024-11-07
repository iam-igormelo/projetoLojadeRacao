package LojadeRacao;

import java.util.ArrayList;

public class HistoricoVenda {
    private ArrayList<Venda> historico = new ArrayList<>();

    public void registrarVenda(String nome, int quantidade) {
        Venda venda = new Venda(nome, quantidade);
        historico.add(venda);
    }

    public void verHistorico() {
        System.out.println("======================= HISTORICO DE VENDAS =======================");
        for(Venda venda : historico) {
            System.out.println(venda);
        }
        System.out.println("===================================================================");
    }
}

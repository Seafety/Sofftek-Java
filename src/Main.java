import model.Contrato;
import model.Demanda;
import model.Equipe;
import model.Custo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Contrato contrato = new Contrato(1, "Descrição do Contrato", new Date(), new Date(),
                "Projeto_01", "Funcional", "Basis",
                "Perfis;Transporte", 252, 50000.0, 10, 71.78,
                30, 66.34, 40, 53.13, 10, 24.15, 10, 14.40,37.80,77.02);

        double valorTotal = contrato.calcularValorTotal();

        System.out.println("Valor Total do Contrato: " + valorTotal);

        Demanda demanda = new Demanda(1, "TASK105721218-1", new Date(), new Date(),
                "Closed", "GUSB", "Gui", "Financeiro", 2024 , 2,
                16, 2.1, "Horas de Rework", "N1");

        Equipe equipe = new Equipe(1, "Consultor", new Date(), new Date(),
                "4890722-A0643", "Sr", new Date(), new Date(), "Férias");

        Custo custo = new Custo(1, "O custo foi este", new Date(), new Date(), 15.0);


        System.out.println("Descrição do Projeto (Contrato): " + contrato.getDescricao());
        System.out.println("Consultor (Demanda): " + demanda.getConsultor());
        System.out.println("Código AT (Equipe): " + equipe.getCodigoAT());
        System.out.println("Valor AT (Custo): " + custo.getValorAT());
    }



}
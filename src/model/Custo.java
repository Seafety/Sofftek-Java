package model;
import java.util.Date;

public class Custo extends Projeto {

    private double valorAT;

    public Custo(int id, String descricao, Date inicioProjeto, Date fimProjeto, double valorAT) {
        super(id, descricao, inicioProjeto, fimProjeto);
        this.valorAT = valorAT;
    }

    public double getValorAT() {
        return valorAT;
    }

    public void setValorAT(double valorAT) {
        this.valorAT = valorAT;
    }
}

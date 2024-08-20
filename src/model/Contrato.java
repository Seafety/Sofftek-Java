package model;

import java.util.Date;

public class Contrato extends Projeto {

    private String projeto;
    private String tipoContrato;
    private String modulo;
    private String tipoDemanda;
    private double baseline;
    private double valorContrato;
    private int expert;
    private double custoVendaExpert;
    private int senior;
    private double custoVendaSenior;
    private int pleno;
    private double custoVendaPleno;
    private int junior;
    private double custoVendaJunior;
    private int estagiario;
    private double custoVendaEstagiario;
    private double horasGestao;
    private double custoVendaGestao;

    public Contrato(int id, String descricao, Date inicioProjeto, Date fimProjeto,
                    String projeto, String tipoContrato, String modulo, String tipoDemanda,
                    double baseline, double valorContrato, int expert, double custoVendaExpert,
                    int senior, double custoVendaSenior, int pleno, double custoVendaPleno,
                    int junior, double custoVendaJunior, int estagiario, double custoVendaEstagiario, double horasGestao, double custoVendaGestao) {
        super(id, descricao, inicioProjeto, fimProjeto);
        this.projeto = projeto;
        this.tipoContrato = tipoContrato;
        this.modulo = modulo;
        this.tipoDemanda = tipoDemanda;
        this.baseline = baseline;
        this.valorContrato = valorContrato;
        this.expert = expert;
        this.custoVendaExpert = custoVendaExpert;
        this.senior = senior;
        this.custoVendaSenior = custoVendaSenior;
        this.pleno = pleno;
        this.custoVendaPleno = custoVendaPleno;
        this.junior = junior;
        this.custoVendaJunior = custoVendaJunior;
        this.horasGestao = horasGestao;
        this.custoVendaGestao = custoVendaGestao;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getTipoDemanda() {
        return tipoDemanda;
    }

    public void setTipoDemanda(String tipoDemanda) {
        this.tipoDemanda = tipoDemanda;
    }

    public double getBaseline() {
        return baseline;
    }

    public void setBaseline(double baseline) {
        this.baseline = baseline;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public int getExpert() {
        return expert;
    }

    public void setExpert(int expert) {
        this.expert = expert;
    }

    public double getCustoVendaExpert() {
        return custoVendaExpert;
    }

    public void setCustoVendaExpert(double custoVendaExpert) {
        this.custoVendaExpert = custoVendaExpert;
    }

    public int getSenior() {
        return senior;
    }

    public void setSenior(int senior) {
        this.senior = senior;
    }

    public double getCustoVendaSenior() {
        return custoVendaSenior;
    }

    public void setCustoVendaSenior(double custoVendaSenior) {
        this.custoVendaSenior = custoVendaSenior;
    }

    public int getPleno() {
        return pleno;
    }

    public void setPleno(int pleno) {
        this.pleno = pleno;
    }

    public double getCustoVendaPleno() {
        return custoVendaPleno;
    }

    public void setCustoVendaPleno(double custoVendaPleno) {
        this.custoVendaPleno = custoVendaPleno;
    }

    public int getJunior() {
        return junior;
    }

    public void setJunior(int junior) {
        this.junior = junior;
    }

    public double getCustoVendaJunior() {
        return custoVendaJunior;
    }

    public void setCustoVendaJunior(double custoVendaJunior) {
        this.custoVendaJunior = custoVendaJunior;
    }

    public double getHorasGestao() {
        return horasGestao;
    }

    public void setHorasGestao(double horasGestao) {
        this.horasGestao = horasGestao;
    }

    public double getCustoVendaGestao() {
        return custoVendaGestao;
    }

    public void setCustoVendaGestao(double custoVendaGestao) {
        this.custoVendaGestao = custoVendaGestao;
    }

    public int getEstagiario() {
        return estagiario;
    }

    public void setEstagiario(int estagiario) {
        this.estagiario = estagiario;
    }

    public double getCustoVendaEstagiario() {
        return custoVendaEstagiario;
    }

    public void setCustoVendaEstagiario(double custoVendaEstagiario) {
        this.custoVendaEstagiario = custoVendaEstagiario;
    }

    public double calcularValorTotal() {
        return this.valorContrato + (this.expert * this.custoVendaExpert) +
                (this.senior * this.custoVendaSenior) + (this.pleno * this.custoVendaPleno) +
                (this.junior * this.custoVendaJunior) + (this.estagiario * this.custoVendaEstagiario) + (this.horasGestao * this.custoVendaGestao);
    }
}

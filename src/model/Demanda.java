package model;

import java.util.Date;

public class Demanda extends Projeto{

    private String statusChamado;
    private String IS;
    private String consultor;
    private String moduloChamado;
    private int exercicio;
    private int periodo;
    private int dia;
    private double horas;
    private String tipoHoras;
    private String complexidade;

    public Demanda(int id, String descricao, Date inicioProjeto, Date fimProjeto,
                   String statusChamado, String IS, String consultor, String moduloChamado, int exercicio,
                   int periodo, int dia, double horas, String tipoHoras, String complexidade) {
        super(id, descricao, inicioProjeto, fimProjeto);
        this.statusChamado = statusChamado;
        this.IS = IS;
        this.consultor = consultor;
        this.exercicio = exercicio;
        this.periodo = periodo;
        this.dia = dia;
        this.horas = horas;
        this.tipoHoras = tipoHoras;
        this.complexidade = complexidade;
    }

    public String getStatusChamado() {
        return statusChamado;
    }

    public void setStatusChamado(String statusChamado) {
        this.statusChamado = statusChamado;
    }

    public String getIS() {
        return IS;
    }

    public void setIS(String IS) {
        this.IS = IS;
    }

    public String getConsultor() {
        return consultor;
    }

    public String getModuloChamado() {
        return moduloChamado;
    }

    public void setModuloChamado(String moduloChamado) {
        this.moduloChamado = moduloChamado;
    }

    public void setConsultor(String consultor) {
        this.consultor = consultor;
    }

    public int getExercicio() {
        return exercicio;
    }

    public void setExercicio(int exercicio) {
        this.exercicio = exercicio;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public String getTipoHoras() {
        return tipoHoras;
    }

    public void setTipoHoras(String tipoHoras) {
        this.tipoHoras = tipoHoras;
    }

    public String getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(String complexidade) {
        this.complexidade = complexidade;
    }
}

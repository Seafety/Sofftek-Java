package model;

import java.util.Date;

public class Equipe extends Projeto{

    private String codigoAT;
    private String senioridade;
    private Date ausenciaIni;
    private Date ausenciaFin;
    private String ausenciaTipo;

    public Equipe(int id, String descricao, Date inicioProjeto, Date fimProjeto,
                  String codigoAT, String senioridade, Date ausenciaIni,
                  Date ausenciaFin, String ausenciaTipo) {
        super(id, descricao, inicioProjeto, fimProjeto);
        this.codigoAT = codigoAT;
        this.senioridade = senioridade;
        this.ausenciaIni = ausenciaIni;
        this.ausenciaFin = ausenciaFin;
        this.ausenciaTipo = ausenciaTipo;
    }

    public String getCodigoAT() {
        return codigoAT;
    }

    public void setCodigoAT(String codigoAT) {
        this.codigoAT = codigoAT;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public Date getAusenciaIni() {
        return ausenciaIni;
    }

    public void setAusenciaIni(Date ausenciaIni) {
        this.ausenciaIni = ausenciaIni;
    }

    public Date getAusenciaFin() {
        return ausenciaFin;
    }

    public void setAusenciaFin(Date ausenciaFin) {
        this.ausenciaFin = ausenciaFin;
    }

    public String getAusenciaTipo() {
        return ausenciaTipo;
    }

    public void setAusenciaTipo(String ausenciaTipo) {
        this.ausenciaTipo = ausenciaTipo;
    }
}

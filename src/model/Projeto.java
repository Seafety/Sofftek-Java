package model;
import java.util.Date;

public class Projeto {

    private int id;
    private String descricao;
    private Date inicioProjeto;
    private Date fimProjeto;


    public Projeto(int id, String descricao, Date inicioProjeto, Date fimProjeto) {
        this.id = id;
        this.descricao = descricao;
        this.inicioProjeto = inicioProjeto;
        this.fimProjeto = fimProjeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getInicioProjeto() {
        return inicioProjeto;
    }

    public void setInicioProjeto(Date inicioProjeto) {
        this.inicioProjeto = inicioProjeto;
    }

    public Date getFimProjeto() {
        return fimProjeto;
    }

    public void setFimProjeto(Date fimProjeto) {
        this.fimProjeto = fimProjeto;
    }
}

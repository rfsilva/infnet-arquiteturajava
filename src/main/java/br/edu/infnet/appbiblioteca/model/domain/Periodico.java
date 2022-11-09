package br.edu.infnet.appbiblioteca.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_periodico")
public class Periodico extends Material {

    private String editora;
    private String abrangencia;
    private Integer totalPaginas;
    
    public String getTipoMaterial() {
        return "PERIÓDICO";
    }
    
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getAbrangencia() {
        return abrangencia;
    }
    public void setAbrangencia(String abrangencia) {
        this.abrangencia = abrangencia;
    }
    public Integer getTotalPaginas() {
        return totalPaginas;
    }
    public void setTotalPaginas(Integer totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString())
            .append(getId()).append(";")
            .append(editora).append(";")
            .append(abrangencia).append(";")
            .append(totalPaginas);
        return builder.toString();
    }

}

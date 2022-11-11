package br.edu.infnet.appbiblioteca.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_midia")
public class Midia extends Material {
    
    private String tipo;
    private Boolean raro;
    private String fabricante;
    private Integer anoFabricacao;
    
    public String getTipoMaterial() {
        return "MIDIA";
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getRaro() {
        return raro;
    }

    public void setRaro(Boolean raro) {
        this.raro = raro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString())
            .append(getId()).append(";")
            .append(tipo).append(";")
            .append(raro).append(";")
            .append(fabricante).append(";")
            .append(anoFabricacao);
        return builder.toString();
    }
}

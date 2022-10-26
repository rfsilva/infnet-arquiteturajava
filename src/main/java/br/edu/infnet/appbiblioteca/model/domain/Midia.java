package br.edu.infnet.appbiblioteca.model.domain;

public class Midia extends Material {
    
    private String tipo;
    private Boolean raro;
    private String fabricante;
    private Integer anoFabricacao;
    
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
            .append(tipo).append(";")
            .append(raro).append(";")
            .append(fabricante).append(";")
            .append(anoFabricacao);
        return builder.toString();
    }
}

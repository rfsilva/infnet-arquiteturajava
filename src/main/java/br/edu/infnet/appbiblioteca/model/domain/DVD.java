package br.edu.infnet.appbiblioteca.model.domain;

public class DVD extends Item {

    private String estudio;
    private Integer totalMinutos;
    private String categoria;
    
    public String getEstudio() {
        return estudio;
    }
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    public Integer getTotalMinutos() {
        return totalMinutos;
    }
    public void setTotalMinutos(Integer totalMinutos) {
        this.totalMinutos = totalMinutos;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString())
            .append(estudio).append(";")
            .append(totalMinutos).append(";")
            .append(categoria).append(";");
        return builder.toString();
    }

}

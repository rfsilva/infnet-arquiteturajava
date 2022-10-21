package br.edu.infnet.appbiblioteca.model.domain;

public class Mapa extends Item {

    private Integer tipo;
    private String escala;
    private String projecaoCartografica;
    
    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    public String getEscala() {
        return escala;
    }
    public void setEscala(String escala) {
        this.escala = escala;
    }
    public String getProjecaoCartografica() {
        return projecaoCartografica;
    }
    public void setProjecaoCartografica(String projecaoCartografica) {
        this.projecaoCartografica = projecaoCartografica;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString())
            .append(tipo).append(";")
            .append(escala).append(";")
            .append(projecaoCartografica).append(";");
        return builder.toString();
    }

}

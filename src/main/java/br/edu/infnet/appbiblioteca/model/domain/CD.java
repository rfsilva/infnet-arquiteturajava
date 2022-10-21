package br.edu.infnet.appbiblioteca.model.domain;

public class CD extends Item {
    
    private Integer totalFaixas;
    private String interprete;
    private String gravadora;
    
    public Integer getTotalFaixas() {
        return totalFaixas;
    }
    public void setTotalFaixas(Integer totalFaixas) {
        this.totalFaixas = totalFaixas;
    }
    public String getInterprete() {
        return interprete;
    }
    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }
    public String getGravadora() {
        return gravadora;
    }
    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString())
            .append(totalFaixas).append(";")
            .append(interprete).append(";")
            .append(gravadora).append(";");
        return builder.toString();
    }
}

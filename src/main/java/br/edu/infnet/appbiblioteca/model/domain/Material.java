package br.edu.infnet.appbiblioteca.model.domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public abstract class Material {

    private String nome;
    private String descricao;
    private Double valor;
    private LocalDate dataPublicacao;
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }
    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(nome).append(";")
            .append(descricao).append(";")
            .append(sdf.format(dataPublicacao)).append(";");
        return builder.toString();
    }
    
    
}

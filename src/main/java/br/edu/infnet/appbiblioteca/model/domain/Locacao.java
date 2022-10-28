package br.edu.infnet.appbiblioteca.model.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Locacao {

    private Integer id;
    private String descricao;
    private LocalDateTime dataLocacao;
    private Boolean web;
    private Cliente cliente;
    private List<Material> materiais;
    
    public Locacao() {
        materiais = new ArrayList<>();
        this.dataLocacao = LocalDateTime.now();
    }
    
    public Locacao(Cliente cliente) {
        this();
        this.cliente = cliente;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }
    public void setDataLocacao(LocalDateTime data) {
        this.dataLocacao = data;
    }
    public Boolean getWeb() {
        return web;
    }
    public void setWeb(Boolean web) {
        this.web = web;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Material> getMateriais() {
        return materiais;
    }
    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(id).append(";")
                .append(descricao).append(";")
                .append(dataLocacao).append(";")
                .append(web).append(";")
                .append(cliente).append(";")
                .append(materiais.size())
                .toString();
    }
    
}

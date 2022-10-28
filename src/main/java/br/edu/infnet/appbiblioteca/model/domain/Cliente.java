package br.edu.infnet.appbiblioteca.model.domain;

import java.time.LocalDate;

public class Cliente {

    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;
    private String endereco;
    private Boolean ativo;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
    @Override
    public String toString() {
        return new StringBuilder()
                .append(id).append(";")
                .append(nome).append(";")
                .append(cpf).append(";")
                .append(email).append(";")
                .append(dataNascimento).append(";")
                .append(endereco).append(";")
                .append(ativo)
                .toString();
    } 
}

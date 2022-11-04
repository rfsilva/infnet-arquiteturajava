package br.edu.infnet.appbiblioteca.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    
    @OneToMany(mappedBy = "usuario")
    private List<Cliente> clientes;
    
    @OneToMany(mappedBy = "usuario")
    private List<Livro> livros;
    
    @OneToMany(mappedBy = "usuario")
    private List<Material> materiais;
    
    @OneToMany(mappedBy = "usuario")
    private List<Midia> midias;
    
    @OneToMany(mappedBy = "usuario")
    private List<Periodico> periodicos;
    
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public List<Livro> getLivros() {
        return livros;
    }
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    public List<Material> getMateriais() {
        return materiais;
    }
    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }
    public List<Midia> getMidias() {
        return midias;
    }
    public void setMidias(List<Midia> midias) {
        this.midias = midias;
    }
    public List<Periodico> getPeriodicos() {
        return periodicos;
    }
    public void setPeriodicos(List<Periodico> periodicos) {
        this.periodicos = periodicos;
    }
    @Override
    public String toString() {
        return new StringBuilder()
                .append(id).append(";")
                .append(nome).append(";")
                .append(email).append(";")
                .toString();
    } 
}

package br.edu.infnet.appbiblioteca.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
    
    @OneToMany(mappedBy = "usuario")
    private List<Locacao> locacoes;
    
    @OneToMany(mappedBy = "usuario")
    private List<Material> materiais;
    
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
    public List<Locacao> getLocacoes() {
        return locacoes;
    }
    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
    public List<Material> getMateriais() {
        return materiais;
    }
    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

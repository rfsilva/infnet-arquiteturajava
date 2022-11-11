package br.edu.infnet.appbiblioteca.model.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_locacao")
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private LocalDateTime dataLocacao;
    private Boolean web;
    
    @ManyToOne(cascade = CascadeType.DETACH)
    private Cliente cliente;
    
    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "tb_locacao_materiais", 
        joinColumns = @JoinColumn(name = "id_locacao"), 
        inverseJoinColumns = @JoinColumn(name = "id_material"))
    private List<Material> materiais;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

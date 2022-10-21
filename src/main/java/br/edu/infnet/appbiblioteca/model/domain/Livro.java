package br.edu.infnet.appbiblioteca.model.domain;

public class Livro extends Item {

    private String autor;
    private Integer totalPaginas;
    private String editora;
    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getTotalPaginas() {
        return totalPaginas;
    }
    public void setTotalPaginas(Integer totalPaginas) {
        this.totalPaginas = totalPaginas;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString())
            .append(autor).append(";")
            .append(totalPaginas).append(";")
            .append(editora).append(";");
        return builder.toString();
    }

    
}

package br.edu.infnet.appbiblioteca.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appbiblioteca.model.domain.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Integer> {
    
    @Query("from Livro l where l.usuario.id = :idUsuario")
    List<Livro> findByUsuario(@Param("idUsuario") Integer idUsuario);
}

package br.edu.infnet.appbiblioteca.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appbiblioteca.model.domain.Midia;

@Repository
public interface MidiaRepository extends CrudRepository<Midia, Integer> {
    
    @Query("from Midia m where m.usuario.id = :idUsuario")
    List<Midia> findByUsuario(@Param("idUsuario") Integer idUsuario);
}

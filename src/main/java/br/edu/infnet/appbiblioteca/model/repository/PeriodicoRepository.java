package br.edu.infnet.appbiblioteca.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appbiblioteca.model.domain.Periodico;

@Repository
public interface PeriodicoRepository extends CrudRepository<Periodico, Integer> {
    
    @Query("from Periodico p where p.usuario.id = :idUsuario")
    List<Periodico> findByUsuario(@Param("idUsuario") Integer idUsuario);
}

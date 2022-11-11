package br.edu.infnet.bibliotecaclienteapi.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.infnet.bibliotecaclienteapi.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    
    @Query("from Cliente c where c.idUsuario = :idUsuario")
    List<Cliente> findByUsuario(@Param("idUsuario") Integer idUsuario);
}

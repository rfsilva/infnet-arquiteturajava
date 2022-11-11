package br.edu.infnet.appbiblioteca.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appbiblioteca.model.domain.Material;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Integer> {
    
    @Query("from Material m where m.usuario.id = :idUsuario")
    List<Material> findByUsuario(@Param("idUsuario") Integer idUsuario);
}

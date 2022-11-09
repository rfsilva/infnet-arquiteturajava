package br.edu.infnet.appbiblioteca.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appbiblioteca.model.domain.Locacao;

@Repository
public interface LocacaoRepository extends CrudRepository<Locacao, Integer> {
    
    @Query("from Locacao l where l.usuario.id = :idUsuario")
    List<Locacao> findByUsuario(@Param("idUsuario") Integer idUsuario);
}

package br.edu.infnet.bibliotecausuarioapi.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.bibliotecausuarioapi.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    
    public Usuario findByEmail(String email);
}

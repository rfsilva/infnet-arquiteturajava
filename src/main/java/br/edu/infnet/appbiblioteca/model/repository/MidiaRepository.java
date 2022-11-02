package br.edu.infnet.appbiblioteca.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appbiblioteca.model.domain.Midia;

@Repository
public interface MidiaRepository extends CrudRepository<Midia, Integer> {
}

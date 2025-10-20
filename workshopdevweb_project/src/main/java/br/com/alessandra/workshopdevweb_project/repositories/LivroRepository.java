package br.com.alessandra.workshopdevweb_project.repositories;

import br.com.alessandra.workshopdevweb_project.domain.Livro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Long> {
}

package nithya.springjava.springwebapp.repositories;

import nithya.springjava.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

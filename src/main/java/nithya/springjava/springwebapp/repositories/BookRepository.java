package nithya.springjava.springwebapp.repositories;

import nithya.springjava.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}

package nithya.springjava.springwebapp.repositories;

import nithya.springjava.springwebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

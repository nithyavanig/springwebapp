package nithya.springjava.springwebapp.bootstrap;

import nithya.springjava.springwebapp.domain.Author;
import nithya.springjava.springwebapp.domain.Book;
import nithya.springjava.springwebapp.domain.Publisher;
import nithya.springjava.springwebapp.repositories.AuthorRepository;
import nithya.springjava.springwebapp.repositories.BookRepository;
import nithya.springjava.springwebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;
    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author("Eric", "Evans");
        Book buk1= new Book("blueUm","34567");
        author1.getBooks().add(buk1);
        buk1.getAuthors().add(author1);

        Publisher pub1 = new Publisher();
        pub1.setName("Mathan");
        pub1.setAddress("tnagar");
        pub1.setCity("chennai");
        pub1.setState("tamilnadu");
        pub1.setZipcode("456123");
        publisherRepository.save(pub1);

        pub1.getBooks().add(buk1);
        buk1.setPublisher(pub1);

        authorRepository.save(author1);
        bookRepository.save(buk1);
        publisherRepository.save(pub1);


        Author author2 = new Author("Ruskin", "Bond");
        Book buk2= new Book("" +
                "blue","12346");
        author1.getBooks().add(buk2);
        buk2.getAuthors().add(author2);
//        Publisher pub2 = new Publisher("vasan","ukkadam","coimbatore","telangana","345678");
        pub1.getBooks().add(buk2);
        buk2.setPublisher(pub1);

        authorRepository.save(author2);
        bookRepository.save(buk2);
        publisherRepository.save(pub1);

        System.out.println("Author count"+ authorRepository.count());
        System.out.println("Books count"+bookRepository.count());
        System.out.println("Publisher count"+ publisherRepository.count());
        System.out.println("Publisher books count"+pub1.getBooks().size());
    }
}

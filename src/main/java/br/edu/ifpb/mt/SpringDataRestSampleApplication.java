package br.edu.ifpb.mt;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifpb.mt.sdr.model.Author;
import br.edu.ifpb.mt.sdr.model.Book;
import br.edu.ifpb.mt.sdr.repository.AuthorRepository;
import br.edu.ifpb.mt.sdr.repository.BookRepository;

/**
 * 
 * @author <a href="https://github.com/FranckAJ">Franck Aragão</a>
 */
@SpringBootApplication
public class SpringDataRestSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestSampleApplication.class, args);
	}
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;

	@PostConstruct
	@Transactional
	public void onLoad(){
		
		Author joao = new Author();
		joao.setName("João");
		authorRepository.save(joao);
		
		
		Book book = new Book();
		book.setTitle("Spring MVC");
		book.setDescription("Description of book");
		book.setNumbeOfPages(320);
		
		book.addAuthor(joao);
		
		bookRepository.save(book);
		
	}
}

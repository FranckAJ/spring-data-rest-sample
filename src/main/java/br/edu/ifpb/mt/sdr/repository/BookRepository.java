package br.edu.ifpb.mt.sdr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.mt.sdr.model.Book;

/**
 * 
 * 
 * <p>
 * <b> Book Repository </b>
 * </p>
 *
 * <p>
 * This is repositoty of a @Book 
 * </p>
 * 
 * 
 * @author <a href="https://github.com/FranckAJ">Franck Aragão</a>
 *
 */
public interface BookRepository extends JpaRepository<Book, Long>{

}

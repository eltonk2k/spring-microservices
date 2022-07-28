package br.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
	

}

package com.lab3.demo.repository;
import com.lab3.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
    


public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitle(String title);
}

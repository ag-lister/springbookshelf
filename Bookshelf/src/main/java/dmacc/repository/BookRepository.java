package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> { }
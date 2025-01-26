package com.raj.SpringJpaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.SpringJpaProject.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}

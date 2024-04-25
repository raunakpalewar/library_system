package com.example.library.controllers;
import com.example.library.models.*;
import com.example.library.repositories.authorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
 @Autowired
 private AuthorRepository authorRepository;

 @GetMapping
 public List<Author> getAllAuthors() {
     return authorRepository.findAll();
 }

 @PostMapping
 public Author createAuthor(@RequestBody Author author) {
     return authorRepository.save(author);
 }

}
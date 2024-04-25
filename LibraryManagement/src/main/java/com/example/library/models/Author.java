package com.example.library.models;

//Author.java
import javax.persistence.*;

@Entity
public class Author {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;

 private String biography;

 // Getters and setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getBiography() {
     return biography;
 }

 public void setBiography(String biography) {
     this.biography = biography;
 }
}
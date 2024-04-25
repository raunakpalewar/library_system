package com.example.library.models;


//Rental.java
import javax.persistence.*;
import java.util.Date;

@Entity
public class Rental {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @ManyToOne
 private Book book;

 private String renterName;

 private Date rentalDate;

 private Date returnDate;

 // Getters and setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public Book getBook() {
     return book;
 }

 public void setBook(Book book) {
     this.book = book;
 }

 public String getRenterName() {
     return renterName;
 }

 public void setRenterName(String renterName) {
     this.renterName = renterName;
 }

 public Date getRentalDate() {
     return rentalDate;
 }

 public void setRentalDate(Date rentalDate) {
     this.rentalDate = rentalDate;
 }

 public Date getReturnDate() {
     return returnDate;
 }

 public void setReturnDate(Date returnDate) {
     this.returnDate = returnDate;
 }
}
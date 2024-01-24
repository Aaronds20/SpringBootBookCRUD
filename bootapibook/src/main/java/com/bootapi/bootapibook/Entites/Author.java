package com.bootapi.bootapibook.Entites;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
 @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int authorId;
private String firstname;
private String lastname;
private String language;

@OneToOne(mappedBy = "author")
@JsonBackReference
private Book book;



public int getAuthorId() {
    return authorId;
}
public void setAuthorId(int authorId) {
    this.authorId = authorId;
}
public String getFirstname() {
    return firstname;
}
public void setFirstname(String firstname) {
    this.firstname = firstname;
}
public String getLastname() {
    return lastname;
}
public void setLastname(String lastname) {
    this.lastname = lastname;
}
public String getLanguage() {
    return language;
}
public void setLanguage(String language) {
    this.language = language;
}
public Book getBook() {
    return book;
}
public void setBook(Book book) {
    this.book = book;
}


}

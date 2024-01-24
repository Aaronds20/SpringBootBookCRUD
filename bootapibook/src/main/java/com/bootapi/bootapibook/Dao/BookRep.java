package com.bootapi.bootapibook.Dao;

import org.springframework.data.repository.CrudRepository;

import com.bootapi.bootapibook.Entites.Book;



public interface BookRep extends CrudRepository<Book,Integer>{
    public Book findById(int id);
}

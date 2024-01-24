package com.bootapi.bootapibook.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bootapi.bootapibook.Dao.BookRep;
import com.bootapi.bootapibook.Entites.Book;

@Component
public class BookService {
    
@Autowired
    BookRep bookRep;

    // private static List<Book> list=new ArrayList<>();

    // static{
    //     list.add(new Book(12,"Python","ABC"));
    //     list.add(new Book(11,"C++","DFR"));
    //     list.add(new Book(13,"HTML","KHJ"));
    // }

    public List<Book> getAllBooks(){
         List<Book> list=(List<Book>) this.bookRep.findAll();
         return list;
    }

    public Book getBookbyId(int id){
        Book b=null;
        try {
    // b=list.stream().filter(e->e.getId()==id).findFirst().get();
     b = this.bookRep.findById(id);
        } catch (Exception e) {
           e.printStackTrace();
        }
return b;
    }

    public Book addBook(Book b){
      Book result= bookRep.save(b);
        return result;
    }

    public void deleteBook(int bid){
        // list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
        bookRep.deleteById(bid);
    }

    public void updateBook(Book book, int id) {
        // list=list.stream().map(b->{
        //     if(b.getId()==id){
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());
        book.setId(id);
        bookRep.save(book);
    }
}

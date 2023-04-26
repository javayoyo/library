package com.icia.lib.service;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookService {

    // dto > service > repository 주입을 받을때
    @Autowired
    private BookRepository bookRepository;

    public int save(BookDTO bookDTO) {
        System.out.println("bookDTO = " + bookDTO);
        int result = bookRepository.save(bookDTO);
        return result;
    }
    public List<BookDTO> findAll() {
        List<BookDTO> bookDTOList = bookRepository.findAll();
        if (bookDTOList.size() == 0) {
            return null;
        } else {
            return bookDTOList;
        }
    }

        public BookDTO findById(Long id){
            return bookRepository.findById(id);
        }

        public void  update(BookDTO bookDTO) {
        bookRepository.update(bookDTO);
        }

    public void delete(Long id) {
        bookRepository.delete(id);
    }



}

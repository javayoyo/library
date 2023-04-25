package com.icia.lib.service;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
        if(bookDTOList.size() == 0) {
            return null;
        }else {
            return bookDTOList;
        }
    }

}

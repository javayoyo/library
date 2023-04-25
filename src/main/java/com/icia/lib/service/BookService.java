package com.icia.lib.service;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class BookService {

    // dto > service > repository 주입을 받을때
    @Autowired
    private BookRepository bookRepository;

    public int save(BookDTO bookDTO) {
        System.out.println("bookDTO = " + bookDTO);
        return 0;

    }


}

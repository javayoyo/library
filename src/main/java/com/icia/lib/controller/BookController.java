package com.icia.lib.controller;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    // BookService 의존성 주입(필드주입)

    @Autowired
    private BookService bookService;

    // 도서 등록 화면
    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    // 도서 등록 처리
    @PostMapping("/save")
    public String save(@ModelAttribute BookDTO bookDTO) {
        int saveResult = bookService.save(bookDTO);
        if(saveResult > 0) {
            System.out.println("등록성공");
            return "index";
        }else  {
            System.out.println("등록실패");
            return "index";
        }
    }

    @GetMapping("/list")
    public String list() {
        return "list";
    }




}

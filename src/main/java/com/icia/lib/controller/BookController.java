package com.icia.lib.controller;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
    public String save(@ModelAttribute BookDTO bookDTO, Model model) {
        int saveResult = bookService.save(bookDTO);
        model.addAttribute("result", saveResult);
        return "saveResult";
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<BookDTO> bookDTOList = bookService.findAll();
        for (BookDTO bookDTO: bookDTOList) {
            System.out.println("bookDTO = " + bookDTO);
        }
        model.addAttribute("bookList", bookDTOList);
        return "list";

    }

//    detail > 값을 가지고 가야 함
    @GetMapping("/detail")
    public String findById(@RequestParam("id") Long id, Model model) {
    BookDTO bookDTO = bookService.findById(id);
    model.addAttribute("book",bookDTO);
    return "detail";
    }

//    처리과정 : 수정화면을 띄워주기위한 요청 > 정보를 수정
    // 수정화면 출력
    @GetMapping("/update")
    public String updateForm(@RequestParam("id") Long id, Model model) {
        BookDTO bookDTO = bookService.findById(id);
        model.addAttribute("book", bookDTO);
        return "update";
    }

    // 수정처리
    @PostMapping("/update")
    public String update(@ModelAttribute BookDTO bookDTO) {
        bookService.update(bookDTO);
        // 수정이 완료되면 상세페이지를 다시 출력 > 다시 주소요청
        // redirect 요청 : 다른 컨트롤러의 주소를 요청(jsp 페이지 이름을 리턴하는 것이 아님)
        return "redirect:/detail?id="+bookDTO.getId();

    }
    // 삭제처리
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id) {
        bookService.delete(id);
        // 삭제 처리 후 목록 출력 > 목록을 출력하기 위한 주소 요청(주소값을 기준으로 요청)
        return "redirect:/list";
    }

}

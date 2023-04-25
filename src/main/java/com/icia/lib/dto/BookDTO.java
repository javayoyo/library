package com.icia.lib.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class BookDTO {

    private Long id;
    private String bookName;
    private String bookPublisher;
    private String bookAuthor;
    private int bookPrice;

}

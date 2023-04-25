package com.icia.lib.repository;

import com.icia.lib.dto.BookDTO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    @Autowired
    private SqlSessionTemplate sql;


    public int save(BookDTO bookDTO) {
        /* insert 수행결과를 int로 리턴. insert 수행이 되지 않았으면 0, 됐으면 1 */
        return sql.insert("Book.save", bookDTO);
        // ㄴ insert 매개변수(매퍼를 호출할 변수,실제 쿼리에 적용할 값)

    }
}

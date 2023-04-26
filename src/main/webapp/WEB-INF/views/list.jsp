<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-25
  Time: 오전 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h2>list 입니다</h2>
<table class="table table-dark table-hover">

    <tr>
        <th>id</th>
        <th>name</th>
<%--        <th>publisher</th>--%>
<%--        <th>author</th>--%>
<%--        <th>price</th>--%>
        <th>조회</th>
        <th>조회(js)</th>
        <th>수정</th>
        <th>삭제</th>

    </tr>

    <c:forEach items="${bookList}" var="book">

        <tr>
            <td>${book.id}</td>
            <td><a href="/detail?id=${book.id}">${book.bookName}</a></td>
<%--            <td><${book.bookPublisher}/td>--%>
<%--            <td>${book.bookAuthor}</td>--%>
<%--            <td>${book.bookPrice}</td>--%>
            <td>
    <%-- 상세 조회를 위한 요청주소 : detail
    같이 보내줘야 하는 값: id / 반복문 안에서 사용가능 --%>

<%--숙제 : detail 요청을 처리하는 컨트롤러 메서드를 만들고
조회결과를 detail.jsp 에 출력하자.
BookRepository 에서는 sql.selectOne() 을 사용하고
mapper 에서는 parameterType="Long"으로 주고
resultType = "book"으로 하면 됩니다.
--%>
<%-- /detail?id=1 --%>

                <a href="/detail?id=${book.id}">조회</a>
            </td>
            <td>
                <button onclick="detail_book('${book.id}')">조회</button>
            </td>
            <td>
                <button onclick="update_book('${book.id}')">수정</button>
            </td>
            <td>
                <button onclick="delete_book('${book.id}')">삭제</button>
            </td>

        </tr>
    </c:forEach>
<%--  반복문 안에서만 ${ } 사용 가능 / 싱글쿼터로 묶어 매개변수로 사용 --%>

</table>
</body>

<script>
    const detail_book = (id) => {
    location.href = "/detail?id=" +id;
    }
    const update_book = (id) => {
        location.href = "/update?id=" +id;
    }
    const delete_book = (id) => {
        location.href = "/delete?id=" +id;
    }
</script>

</html>

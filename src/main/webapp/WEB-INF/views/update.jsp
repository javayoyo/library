<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-26
  Time: 오전 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>update.jsp</h2>
<%--value 값을 통해 가져온 값을 미리 채울 수 있다--%>
<%--readonly 보여주기 가능하나 수정은 불가--%>
<%--hidden 타입 > 화면에 보이지 않지만 넘겨야 하는 값(사용자노출 불필요) --%>
<%--name 과 value 값이 있어야 컨트롤러에 넘기기 가능--%>
<%--model 은 일회용 저장소 비슷--%>

<form action="/update" method="post">

  <input type="text" name="id" value="${book.id}" readonly><br>
  <input type="text" name="bookName" value="${book.bookName}"><br>
  <input type="text" name="bookPublisher" value="${book.bookPublisher}"><br>
  <input type="text" name="bookAuthor"value="${book.bookAuthor}"><br>
  <input type="text" name="bookPrice" value="${book.bookPrice}"><br>
  <input type="submit" value="수정">
</form>

</body>
</html>

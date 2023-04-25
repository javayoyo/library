<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-25
  Time: 오후 2:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <script>
    const result = '${result}';
    console.log(result);
    if(result > 0) {
        alert("신규 도서 등록 성공! index로 돌아갑니다!");
        location.href = "/";
    }else {
        alert("뭘 잘못했니?");
        location.href = "/save";
    }

  </script>

</head>

<body>
<h2>saveResult.jsp 입니다</h2>

</body>
</html>

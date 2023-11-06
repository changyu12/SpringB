<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 등록</title>

</head>
<body>
<%@include file="menu.jsp" %>
<div class="container">
<form action="/create" method="post">
<div class="mb-3">
<p>제목 : <input class="form-control form-control-lg" type="text" name="btitle">
</div>
<div class="mb-3">
<p>내용 : <input class="form-control form-control" type="text" name="bcontent">
</div>
<div class="mb-0">
<p>작성자 : <input class="form-control form-control-sm" type="text" name="bwriter">
</div>
<input type="submit" value="등록">
</form>
</div>



                      
                      
                    


  
</body>
</html>
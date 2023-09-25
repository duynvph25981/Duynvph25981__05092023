<%--
  Created by IntelliJ IDEA.
  User: Duy
  Date: 9/5/2023
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail</title>
    <title>Trang chủ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body class="container">
<form action="/san-pham/add" method="post">
    <label class="form-label">Nam Bao Hanh</label>
    <input type="text" class="form-control" name="namBH" value="${spdetail.namBH}">
    <label class="form-label">So Luong Ton</label>
    <input type="text" class="form-control" name="soLuongTon" value="${spdetail.soLuongTon}">
    <label class="form-label">Gia Nhap</label>
    <input type="text" class="form-control" name="giaNhap" value="${spdetail.giaNhap}">
    <label class="form-label">Mo Ta</label>
    <input type="text" class="form-control" name="moTa" value="${spdetail.moTa}">
    <button type="submit"class="btn btn-primary" onclick="thongBao2()">Sua</button>
</form>

</body>
</html>

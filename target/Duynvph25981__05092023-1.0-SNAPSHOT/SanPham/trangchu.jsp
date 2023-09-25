<%--
  Created by IntelliJ IDEA.
  User: Duy
  Date: 8/23/2023
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Trang chủ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body class="container">
<form action="/san-pham/add" method="post">
    <label class="form-label">Nam Bao Hanh</label>
    <input type="text" class="form-control" name="namBH">
    <label class="form-label">So Luong Ton</label>
    <input type="text" class="form-control" name="soLuongTon">
    <label class="form-label">Gia Nhap</label>
    <input type="text" class="form-control" name="giaNhap">
    <label class="form-label">Mo Ta</label>
    <input type="text" class="form-control" name="moTa">
    <button type="submit"class="btn btn-primary" onclick="thongBao2()">Them</button>
</form>
<table class="table">
    <thead>
    <tr>
        <td>Nam Bao Hanh</td>
        <td>So Luong Ton</td>
        <td>Gia Nhap</td>
        <td>Mo Ta</td>
        <td>Chức Năng</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSP}" var="u">
        <tr>
            <td>${u.namBH}</td>
            <td>${u.soLuongTon}</td>
            <td>${u.giaNhap}</td>
            <td>${u.moTa}</td>
            <td>
                <a href="/san-pham/delete?id=${u.id}" class="btn btn-primary" onclick="thongBao1()">Xoa</a>
                <a href="/san-pham/detail?id=${u.id}" class="btn btn-primary">Detail</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
<script>
    let result;
    function thongBao1(){
        alert("Xoá thành công")
    }
    function thongBao2(){
        alert("Thêm thành công")
    }
</script>
</html>

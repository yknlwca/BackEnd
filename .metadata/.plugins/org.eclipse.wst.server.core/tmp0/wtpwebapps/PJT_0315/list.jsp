<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.ssafy.fit.model.dto.Review"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>리뷰 목록</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2>리뷰 목록</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">제목</th>
            <th scope="col">작성자</th>
            <th scope="col">작성시간</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<Review> reviews = (List<Review>)request.getAttribute("reviews");
            if(reviews != null) {
                for(Review review : reviews) {
        %>
        <tr onclick="location.href='detail.jsp?id=<%=review.getId()%>'">
            <th scope="row"><%=review.getId()%></th>
            <td><%=review.getTitle()%></td>
            <td><%=review.getAuthor()%></td>
            <td><%=review.getCreatedAt()%></td>
        </tr>
        <%
                }
            }
        %>
        </tbody>
    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>

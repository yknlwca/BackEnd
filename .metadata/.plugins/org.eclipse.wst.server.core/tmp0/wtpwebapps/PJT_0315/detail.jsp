<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.ssafy.fit.model.dto.Review"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>리뷰 상세 정보</title>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet">
</head>
<body>
    <div class="review-detail">
        <%
        Review review = (Review) request.getAttribute("review");
        if(review != null) {
        %>
            <h2><%=review.getTitle()%></h2>
            <p>작성자: <%=review.getAuthor()%></p>
            <p>작성시간: <%=review.getCreatedAt()%></p>
            <p>조회수: <%=review.getHit()%></p>
            <p>내용:<br> <%=review.getContent()%></p>
        <%
        } else {
        %>
            <p>리뷰 정보를 불러오는 데 실패했습니다.</p>
        <%
        }
        %>
    </div>
    <a href="<%=request.getContextPath()%>/review?action=list">리뷰 목록으로 돌아가기</a>
</body>
</html>

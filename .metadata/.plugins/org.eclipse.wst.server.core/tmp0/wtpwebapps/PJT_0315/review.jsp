<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="com.ssafy.fit.model.dto.Review"%>

<!DOCTYPE html>
<html lang="en">
`
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet">


<title>SSAFIT 운동 영상 리뷰</title>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.header-nav {
	display: flex;
	justify-content: center;
	height: 70px;
	background-color: white;
	color: black;
	line-height: 70px;
	border-bottom: 2px solid #ccc;
	/* 헤더 밑줄 추가 */
}

.header-nav h2 i {
	margin-right: 10px;
	/* 오른쪽 아이콘 간격 */
	margin-left: 10px;
	/* 왼쪽 아이콘 간격 */
}

.youtube-thumbnail {
	text-align: center;
	/* 영상 가운데 정렬 */
	padding: 20px 0;
	/* 여백 추가 */
	border-bottom: 2px solid #ccc;
	/* 영상 밑줄 추가 */
}

.youtube-thumbnail img {
	max-width: 50%;
	height: auto;
	border-radius: 10px;
}

.action-buttons {
	display: flex;
	justify-content: space-between;
	/* 컨테이너 내 요소들 사이 간격 최대화 */
	align-items: center;
	/* 세로 중앙 정렬 */
	padding: 20px 0;
	/* 상하 여백 */
	border-bottom: 2px solid #ccc;
	/* 하단 경계선 */
}

.search-container {
	display: flex;
	align-items: center;
}

.search-container input[type="search"] {
	border: none;
	outline: none;
	background-color: transparent;
	border-bottom: 1px solid #ccc;
	/* 검색창 밑줄 */
	margin-left: 10px;
	/* 돋보기 아이콘과의 간격 */
}

.search-container button.search-icon {
	background: none;
	border: none;
	cursor: pointer;
}

.table-hover tbody tr:hover {
	background-color: #f5f5f5;
	/* 호버 시 배경색 변경 */
	cursor: pointer;
}

.review-modal-body {
	max-height: 80%;
	overflow-y: auto;
	word-wrap: break-word;
}

.back-btn {
	font-size: 13px;
	padding: 6px 8px;
}

.modal-title {
	font-weight: bolder;
}

.modal-footer {
	height: 10%;
}
</style>
</head>

<body>
	<header>
		<div class="container">
			<i class="ssafy" role="mainIcon"><a href="index.jsp"> <svg
						xmlns="http://www.w3.org/2000/svg" fill="currentColor"
						class="bi bi-amd" viewBox="0 0 16 16">
          <path
							d="m.334 0 4.358 4.359h7.15v7.15l4.358 4.358V0zM.2 9.72l4.487-4.488v6.281h6.28L6.48 16H.2z" />
        </svg>
			</a> </i>
			<div class="menu">
				<a href="index.jsp" class="home"><span>home</span></a> <a
					href="index.jsp" class="searchGym"><span>헬스장 찾기</span></a> <i
					class="signUp"><a href="#"> <svg
							xmlns="http://www.w3.org/2000/svg" fill="currentColor"
							class="bi bi-person-fill-add" viewBox="0 0 16 16">
            <path
								d="M12.5 16a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7m.5-5v1h1a.5.5 0 0 1 0 1h-1v1a.5.5 0 0 1-1 0v-1h-1a.5.5 0 0 1 0-1h1v-1a.5.5 0 0 1 1 0m-2-6a3 3 0 1 1-6 0 3 3 0 0 1 6 0" />
            <path
								d="M2 13c0 1 1 1 1 1h5.256A4.5 4.5 0 0 1 8 12.5a4.5 4.5 0 0 1 1.544-3.393Q8.844 9.002 8 9c-5 0-6 3-6 4" />
          </svg>
				</a> </i> <i class="login"><a href="#"> <svg
							xmlns="http://www.w3.org/2000/svg" fill="currentColor"
							class="bi bi-box-arrow-in-right" viewBox="0 0 16 16">
            <path fill-rule="evenodd"
								d="M6 3.5a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-2a.5.5 0 0 0-1 0v2A1.5 1.5 0 0 0 6.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-8A1.5 1.5 0 0 0 5 3.5v2a.5.5 0 0 0 1 0z" />
            <path fill-rule="evenodd"
								d="M11.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L10.293 7.5H1.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708z" />
          </svg>
				</a> </i>
			</div>
		</div>
	</header>


	<div class="youtube-thumbnail">
		<a href="https://www.youtube.com/watch?v=gMaB-fG4u4g" target="_blank">
			<img src="https://img.youtube.com/vi/gMaB-fG4u4g/maxresdefault.jpg"
			alt="YouTube 썸네일">
		</a>
	</div>

	<div class="action-buttons">
		<div class="search-container">
			<form action="/search" method="GET">
				<input type="search" name="q" placeholder="검색...">
				<button type="submit">&#128269;</button>
			</form>
		</div>
		<!-- review.jsp 내에 리뷰 작성 모달을 활성화하는 버튼 추가 -->
		<button type="button" class="btn btn-primary" data-bs-toggle="modal"
			data-bs-target="#writeReviewModal">리뷰 작성하기</button>

		<!-- 리뷰 작성 모달 -->
		<div class="modal fade" id="writeReviewModal" tabindex="-1"
			aria-labelledby="writeReviewModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="writeReviewModalLabel">새 리뷰 작성</h5>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close"></button>
					</div>
					<div class="modal-body">
						<!-- 여기에 reviewForm 구현 -->
						<form id="reviewForm"
							action="<%=request.getContextPath()%>/review?action=write"
							method="post">
							<div class="mb-3">
								<label for="reviewTitle" class="form-label">제목</label> <input
									type="text" class="form-control" id="reviewTitle" name="title"
									required>
							</div>
							<div class="mb-3">
								<label for="reviewContent" class="form-label">내용</label>
								<textarea class="form-control" id="reviewContent" name="content"
									rows="3" required></textarea>
							</div>
							<div class="mb-3">
								<label for="reviewAuthor" class="form-label">작성자</label> <input
									type="text" class="form-control" id="reviewAuthor"
									name="author" required>
							</div>
							<button type="submit" class="btn btn-primary">저장</button>
						</form>
						<form id="reviewForm"
							action="<%=request.getContextPath()%>/review?action=write"
							method="post">
							<!-- 폼 내용 -->
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>



	<div class="container mt-4">
		<h2>리뷰 목록</h2>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
					<th>작성시간</th>
					<th>작업</th>
					<!-- 새로운 열 추가 -->
				</tr>
			</thead>
			<tbody>
				<%
				List<Review> reviews = (List<Review>) request.getAttribute("reviews");
				if (reviews != null && !reviews.isEmpty()) {
					for (Review review : reviews) {
				%>
				<tr>
					<td><%=review.getId()%></td>
					<td><%=review.getTitle()%></td>
					<td><%=review.getAuthor()%></td>
					<td><%=review.getHit()%></td>
					<td><%=review.getCreatedAt()%></td>
					<td>
						<!-- 수정 버튼 --> <!-- 수정 버튼 -->
						<button type="button" class="btn btn-sm btn-primary"
							onclick="openEditModal(<%=review.getId()%>, '<%=review.getTitle()%>', '<%=review.getContent()%>')">수정</button>

						<!-- 삭제 버튼 --> <a
						href="<%=request.getContextPath()%>/review.jsp"
						class="btn btn-sm btn-danger"
						onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a>
						
						<!-- review?action=delete&id=<%=review.getId()%> -->
					</td>
				</tr>
				<%
				}
				} else {
				%>
				<tr>
					<td colspan="6">리뷰가 없습니다.</td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>

	<!-- 글 수정 모달 -->
	<div class="modal fade" id="editReviewModal" tabindex="-1"
		role="dialog" aria-labelledby="editReviewModalLabel"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="editReviewModalLabel">리뷰 수정</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<!-- 수정 폼 -->
					<form id="updateReviewForm">
						<input type="hidden" id="editReviewId" name="id">
						<div class="form-group">
							<label for="editReviewTitle">제목</label> <input type="text"
								class="form-control" id="editReviewTitle" name="title" required>
						</div>
						<div class="form-group">
							<label for="editReviewContent">내용</label>
							<textarea class="form-control" id="editReviewContent"
								name="content" required></textarea>
						</div>
						<button type="submit" class="btn btn-primary">저장</button>
					</form>
				</div>
			</div>
		</div>
	</div>



	<script>
    let reviews = [
        <c:forEach var="review" items="${reviews}" varStatus="status">
        {
            id: ${review.id},
            title: "${review.title}",
            content: "${review.content}",
            author: "${review.author}"
        }${status.last ? '' : ','}
        </c:forEach>
    ];

function renderReviews() {
    // 리뷰 목록 렌더링 로직
}

function deleteReview(id) {
    reviews = reviews.filter(review => review.id !== id);
    renderReviews(); // 리뷰 목록 갱신
}

function openEditModal(id) {
    // 수정할 리뷰 데이터를 모달에 채움
    const review = reviews.find(r => r.id === id);
    if (review) {
        document.getElementById('editReviewId').value = review.id;
        document.getElementById('editReviewTitle').value = review.title;
        document.getElementById('editReviewContent').value = review.content;
        $('#editReviewModal').modal('show'); // Bootstrap 모달 사용 예시
    }
}

function updateReview() {
    // 폼에서 입력된 데이터를 바탕으로 리뷰 목록 갱신
    const id = parseInt(document.getElementById('editReviewId').value);
    const title = document.getElementById('editReviewTitle').value;
    const content = document.getElementById('editReviewContent').value;
    const reviewIndex = reviews.findIndex(r => r.id === id);
    if (reviewIndex !== -1) {
        reviews[reviewIndex] = { ...reviews[reviewIndex], title, content };
        renderReviews(); // 리뷰 목록 갱신
        $('#editReviewModal').modal('hide'); // 모달 숨김
    }
}

// 페이지 로드 시 리뷰 목록 렌더링
document.addEventListener('DOMContentLoaded', renderReviews);
</script>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
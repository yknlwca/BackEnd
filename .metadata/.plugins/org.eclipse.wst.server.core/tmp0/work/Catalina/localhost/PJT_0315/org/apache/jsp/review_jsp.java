/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.19
 * Generated at: 2024-03-15 07:39:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.List;
import com.ssafy.fit.model.dto.Review;

public final class review_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.ssafy.fit.model.dto.Review");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("`\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>SSAFIT 운동 영상 리뷰</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write(".header-nav {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	height: 70px;\r\n");
      out.write("	background-color: white;\r\n");
      out.write("	color: black;\r\n");
      out.write("	line-height: 70px;\r\n");
      out.write("	border-bottom: 2px solid #ccc;\r\n");
      out.write("	/* 헤더 밑줄 추가 */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header-nav h2 i {\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("	/* 오른쪽 아이콘 간격 */\r\n");
      out.write("	margin-left: 10px;\r\n");
      out.write("	/* 왼쪽 아이콘 간격 */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".youtube-thumbnail {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	/* 영상 가운데 정렬 */\r\n");
      out.write("	padding: 20px 0;\r\n");
      out.write("	/* 여백 추가 */\r\n");
      out.write("	border-bottom: 2px solid #ccc;\r\n");
      out.write("	/* 영상 밑줄 추가 */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".youtube-thumbnail img {\r\n");
      out.write("	max-width: 50%;\r\n");
      out.write("	height: auto;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".action-buttons {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: space-between;\r\n");
      out.write("	/* 컨테이너 내 요소들 사이 간격 최대화 */\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	/* 세로 중앙 정렬 */\r\n");
      out.write("	padding: 20px 0;\r\n");
      out.write("	/* 상하 여백 */\r\n");
      out.write("	border-bottom: 2px solid #ccc;\r\n");
      out.write("	/* 하단 경계선 */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-container {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-container input[type=\"search\"] {\r\n");
      out.write("	border: none;\r\n");
      out.write("	outline: none;\r\n");
      out.write("	background-color: transparent;\r\n");
      out.write("	border-bottom: 1px solid #ccc;\r\n");
      out.write("	/* 검색창 밑줄 */\r\n");
      out.write("	margin-left: 10px;\r\n");
      out.write("	/* 돋보기 아이콘과의 간격 */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-container button.search-icon {\r\n");
      out.write("	background: none;\r\n");
      out.write("	border: none;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".table-hover tbody tr:hover {\r\n");
      out.write("	background-color: #f5f5f5;\r\n");
      out.write("	/* 호버 시 배경색 변경 */\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".review-modal-body {\r\n");
      out.write("	max-height: 80%;\r\n");
      out.write("	overflow-y: auto;\r\n");
      out.write("	word-wrap: break-word;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back-btn {\r\n");
      out.write("	font-size: 13px;\r\n");
      out.write("	padding: 6px 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".modal-title {\r\n");
      out.write("	font-weight: bolder;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".modal-footer {\r\n");
      out.write("	height: 10%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<i class=\"ssafy\" role=\"mainIcon\"><a href=\"index.jsp\"> <svg\r\n");
      out.write("						xmlns=\"http://www.w3.org/2000/svg\" fill=\"currentColor\"\r\n");
      out.write("						class=\"bi bi-amd\" viewBox=\"0 0 16 16\">\r\n");
      out.write("          <path\r\n");
      out.write("							d=\"m.334 0 4.358 4.359h7.15v7.15l4.358 4.358V0zM.2 9.72l4.487-4.488v6.281h6.28L6.48 16H.2z\" />\r\n");
      out.write("        </svg>\r\n");
      out.write("			</a> </i>\r\n");
      out.write("			<div class=\"menu\">\r\n");
      out.write("				<a href=\"index.jsp\" class=\"home\"><span>home</span></a> <a\r\n");
      out.write("					href=\"index.jsp\" class=\"searchGym\"><span>헬스장 찾기</span></a> <i\r\n");
      out.write("					class=\"signUp\"><a href=\"#\"> <svg\r\n");
      out.write("							xmlns=\"http://www.w3.org/2000/svg\" fill=\"currentColor\"\r\n");
      out.write("							class=\"bi bi-person-fill-add\" viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path\r\n");
      out.write("								d=\"M12.5 16a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7m.5-5v1h1a.5.5 0 0 1 0 1h-1v1a.5.5 0 0 1-1 0v-1h-1a.5.5 0 0 1 0-1h1v-1a.5.5 0 0 1 1 0m-2-6a3 3 0 1 1-6 0 3 3 0 0 1 6 0\" />\r\n");
      out.write("            <path\r\n");
      out.write("								d=\"M2 13c0 1 1 1 1 1h5.256A4.5 4.5 0 0 1 8 12.5a4.5 4.5 0 0 1 1.544-3.393Q8.844 9.002 8 9c-5 0-6 3-6 4\" />\r\n");
      out.write("          </svg>\r\n");
      out.write("				</a> </i> <i class=\"login\"><a href=\"#\"> <svg\r\n");
      out.write("							xmlns=\"http://www.w3.org/2000/svg\" fill=\"currentColor\"\r\n");
      out.write("							class=\"bi bi-box-arrow-in-right\" viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path fill-rule=\"evenodd\"\r\n");
      out.write("								d=\"M6 3.5a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-2a.5.5 0 0 0-1 0v2A1.5 1.5 0 0 0 6.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-8A1.5 1.5 0 0 0 5 3.5v2a.5.5 0 0 0 1 0z\" />\r\n");
      out.write("            <path fill-rule=\"evenodd\"\r\n");
      out.write("								d=\"M11.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L10.293 7.5H1.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708z\" />\r\n");
      out.write("          </svg>\r\n");
      out.write("				</a> </i>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"youtube-thumbnail\">\r\n");
      out.write("		<a href=\"https://www.youtube.com/watch?v=gMaB-fG4u4g\" target=\"_blank\">\r\n");
      out.write("			<img src=\"https://img.youtube.com/vi/gMaB-fG4u4g/maxresdefault.jpg\"\r\n");
      out.write("			alt=\"YouTube 썸네일\">\r\n");
      out.write("		</a>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"action-buttons\">\r\n");
      out.write("		<div class=\"search-container\">\r\n");
      out.write("			<form action=\"/search\" method=\"GET\">\r\n");
      out.write("				<input type=\"search\" name=\"q\" placeholder=\"검색...\">\r\n");
      out.write("				<button type=\"submit\">&#128269;</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- review.jsp 내에 리뷰 작성 모달을 활성화하는 버튼 추가 -->\r\n");
      out.write("		<button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\"\r\n");
      out.write("			data-bs-target=\"#writeReviewModal\">리뷰 작성하기</button>\r\n");
      out.write("\r\n");
      out.write("		<!-- 리뷰 작성 모달 -->\r\n");
      out.write("		<div class=\"modal fade\" id=\"writeReviewModal\" tabindex=\"-1\"\r\n");
      out.write("			aria-labelledby=\"writeReviewModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("			<div class=\"modal-dialog\">\r\n");
      out.write("				<div class=\"modal-content\">\r\n");
      out.write("					<div class=\"modal-header\">\r\n");
      out.write("						<h5 class=\"modal-title\" id=\"writeReviewModalLabel\">새 리뷰 작성</h5>\r\n");
      out.write("						<button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"\r\n");
      out.write("							aria-label=\"Close\"></button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"modal-body\">\r\n");
      out.write("						<!-- 여기에 reviewForm 구현 -->\r\n");
      out.write("						<form id=\"reviewForm\"\r\n");
      out.write("							action=\"");
      out.print(request.getContextPath());
      out.write("/review?action=write\"\r\n");
      out.write("							method=\"post\">\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label for=\"reviewTitle\" class=\"form-label\">제목</label> <input\r\n");
      out.write("									type=\"text\" class=\"form-control\" id=\"reviewTitle\" name=\"title\"\r\n");
      out.write("									required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label for=\"reviewContent\" class=\"form-label\">내용</label>\r\n");
      out.write("								<textarea class=\"form-control\" id=\"reviewContent\" name=\"content\"\r\n");
      out.write("									rows=\"3\" required></textarea>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label for=\"reviewAuthor\" class=\"form-label\">작성자</label> <input\r\n");
      out.write("									type=\"text\" class=\"form-control\" id=\"reviewAuthor\"\r\n");
      out.write("									name=\"author\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-primary\">저장</button>\r\n");
      out.write("						</form>\r\n");
      out.write("						<form id=\"reviewForm\"\r\n");
      out.write("							action=\"");
      out.print(request.getContextPath());
      out.write("/review?action=write\"\r\n");
      out.write("							method=\"post\">\r\n");
      out.write("							<!-- 폼 내용 -->\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container mt-4\">\r\n");
      out.write("		<h2>리뷰 목록</h2>\r\n");
      out.write("		<table class=\"table table-hover\">\r\n");
      out.write("			<thead>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>번호</th>\r\n");
      out.write("					<th>제목</th>\r\n");
      out.write("					<th>작성자</th>\r\n");
      out.write("					<th>조회수</th>\r\n");
      out.write("					<th>작성시간</th>\r\n");
      out.write("					<th>작업</th>\r\n");
      out.write("					<!-- 새로운 열 추가 -->\r\n");
      out.write("				</tr>\r\n");
      out.write("			</thead>\r\n");
      out.write("			<tbody>\r\n");
      out.write("				");

				List<Review> reviews = (List<Review>) request.getAttribute("reviews");
				if (reviews != null && !reviews.isEmpty()) {
					for (Review review : reviews) {
				
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>");
      out.print(review.getId());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(review.getTitle());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(review.getAuthor());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(review.getHit());
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(review.getCreatedAt());
      out.write("</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<!-- 수정 버튼 --> <!-- 수정 버튼 -->\r\n");
      out.write("						<button type=\"button\" class=\"btn btn-sm btn-primary\"\r\n");
      out.write("							onclick=\"openEditModal(");
      out.print(review.getId());
      out.write(',');
      out.write(' ');
      out.write('\'');
      out.print(review.getTitle());
      out.write("', '");
      out.print(review.getContent());
      out.write("')\">수정</button>\r\n");
      out.write("\r\n");
      out.write("						<!-- 삭제 버튼 --> <a\r\n");
      out.write("						href=\"");
      out.print(request.getContextPath());
      out.write("/review.jsp\"\r\n");
      out.write("						class=\"btn btn-sm btn-danger\"\r\n");
      out.write("						onclick=\"return confirm('정말 삭제하시겠습니까?');\">삭제</a>\r\n");
      out.write("						\r\n");
      out.write("						<!-- review?action=delete&id=");
      out.print(review.getId());
      out.write(" -->\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				}
				} else {
				
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td colspan=\"6\">리뷰가 없습니다.</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<!-- 글 수정 모달 -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"editReviewModal\" tabindex=\"-1\"\r\n");
      out.write("		role=\"dialog\" aria-labelledby=\"editReviewModalLabel\"\r\n");
      out.write("		aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h5 class=\"modal-title\" id=\"editReviewModalLabel\">리뷰 수정</h5>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">\r\n");
      out.write("					<!-- 수정 폼 -->\r\n");
      out.write("					<form id=\"updateReviewForm\">\r\n");
      out.write("						<input type=\"hidden\" id=\"editReviewId\" name=\"id\">\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label for=\"editReviewTitle\">제목</label> <input type=\"text\"\r\n");
      out.write("								class=\"form-control\" id=\"editReviewTitle\" name=\"title\" required>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label for=\"editReviewContent\">내용</label>\r\n");
      out.write("							<textarea class=\"form-control\" id=\"editReviewContent\"\r\n");
      out.write("								name=\"content\" required></textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("						<button type=\"submit\" class=\"btn btn-primary\">저장</button>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("    let reviews = [\r\n");
      out.write("        <c:forEach var=\"review\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reviews}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" varStatus=\"status\">\r\n");
      out.write("        {\r\n");
      out.write("            id: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${review.id}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(",\r\n");
      out.write("            title: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${review.title}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\",\r\n");
      out.write("            content: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${review.content}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\",\r\n");
      out.write("            author: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${review.author}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("        }");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.last ? '' : ','}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </c:forEach>\r\n");
      out.write("    ];\r\n");
      out.write("\r\n");
      out.write("function renderReviews() {\r\n");
      out.write("    // 리뷰 목록 렌더링 로직\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function deleteReview(id) {\r\n");
      out.write("    reviews = reviews.filter(review => review.id !== id);\r\n");
      out.write("    renderReviews(); // 리뷰 목록 갱신\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function openEditModal(id) {\r\n");
      out.write("    // 수정할 리뷰 데이터를 모달에 채움\r\n");
      out.write("    const review = reviews.find(r => r.id === id);\r\n");
      out.write("    if (review) {\r\n");
      out.write("        document.getElementById('editReviewId').value = review.id;\r\n");
      out.write("        document.getElementById('editReviewTitle').value = review.title;\r\n");
      out.write("        document.getElementById('editReviewContent').value = review.content;\r\n");
      out.write("        $('#editReviewModal').modal('show'); // Bootstrap 모달 사용 예시\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function updateReview() {\r\n");
      out.write("    // 폼에서 입력된 데이터를 바탕으로 리뷰 목록 갱신\r\n");
      out.write("    const id = parseInt(document.getElementById('editReviewId').value);\r\n");
      out.write("    const title = document.getElementById('editReviewTitle').value;\r\n");
      out.write("    const content = document.getElementById('editReviewContent').value;\r\n");
      out.write("    const reviewIndex = reviews.findIndex(r => r.id === id);\r\n");
      out.write("    if (reviewIndex !== -1) {\r\n");
      out.write("        reviews[reviewIndex] = { ...reviews[reviewIndex], title, content };\r\n");
      out.write("        renderReviews(); // 리뷰 목록 갱신\r\n");
      out.write("        $('#editReviewModal').modal('hide'); // 모달 숨김\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 페이지 로드 시 리뷰 목록 렌더링\r\n");
      out.write("document.addEventListener('DOMContentLoaded', renderReviews);\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

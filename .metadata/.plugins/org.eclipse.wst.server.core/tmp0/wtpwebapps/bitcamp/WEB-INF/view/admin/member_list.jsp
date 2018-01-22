<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<link rel="stylesheet" href="../../css/admin_main.css" />
<body>
<h1>관리자 메인 페이지</h1>
<div id="admin_wrapper">
<aside id="admin_aside">
	<a>회원관리</a>
</aside>
<section id="admin_section">
<h1>회원관리</h1>
	<article>
	<select name="" id="member_search" >
		<option>ID</option>
		<option>이름</option>
		<option>성별</option>
		</select>
		<input type="text" />
		<button>검색</button>
	<table id="admin_table">
		<tr>
			<th>NO</th>
			<th>ID</th>
			<th>이 름</th>
			<th>생년월일</th>
			<th>성 별</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>주 소</th>
		</tr>
		
	</table>
	<button id="add_member_btn">추가</button>
	</article>
</section>
<script src="../../js/admin/member_list.js"></script>
</div>
 <%@ include file="../common/footer.jsp"%>
</body>
</html>
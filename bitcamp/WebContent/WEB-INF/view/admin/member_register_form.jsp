<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="../../css/member_register_form.css" />
<body>
<h1>관리자 메인 페이지</h1>
<div id="add_member_wrapper">
<aside id="add_member_aside">
	<a>회원관리</a>
</aside>
<section id="add_member_section">
<h1>회원관리</h1>
	<article>
	<form id="member_register_form" action="member_register.jsp">
	<table id="add_member_table">

	<tr id="add_member_table tr">
		<td  id="add_member_table td">ID</td>
		<td><input name="id" type="text"/></td>
		
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input name="pass" type="text"/></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input name="name" type="text"/></td>
	</tr>
	<tr>
		<td>생년월일</td>
		<td><input name="ssn" type="text"/></td>
	</tr>
	<tr>
		<td>성별</td>
		<td><input name="gender" type="text"/></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input name="phone" type="text"/></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input name="email" type="text" /></td>
	</tr>
	<tr>
		<td>프로필</td>
		<td><input name="profile" type="text" /></td>
	</tr>
	<tr>
		<td>주소</td>
		<td><input name="addr" type="text"/></td>
	</tr>
	<tr>
	<td></td>
	<td><button id="member_register_btn">추가</button></td></tr>
	</table>
	</form>
	</article>
</section>
<script src="../../js/admin/member_register_form.js"></script>
</div>
 <%@ include file="../common/footer.jsp"%>
</body>
</html>
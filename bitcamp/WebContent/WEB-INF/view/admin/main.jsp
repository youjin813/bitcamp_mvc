<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="../../css/admin_main.css" />
<body>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/nav.jsp"%>
<h1>관리자 메인 페이지</h1>
<div id="admin_wrapper">
<aside id="admin_aside">
	<a id="member_mgmt_link">회원관리</a>
</aside>
<section id="admin_section">
<h1>회원관리</h1>
	<article>
	<table id="admin_table">
		<tr>
			<td>
			<button id="create_table_btn">테이블 생성</button>
			</td>
			<td>준비중</td>
			<td>준비중</td>
		</tr>
		<tr>
			<td>준비중</td>
			<td>준비중</td>
			<td>테이블 생성 <br />
				<form id="admin_create" name="admin_create" action="${pageContext.request.contextPath}/admin/create_table.do">
					<select name="admin_list" id="admin_main">
						<option value="member">회원</option>
						<option value="attend">출석</option>
						<option value="bank">은행</option>
						<option value="mobile">통신사</option>
					</select>
					<button name="create" id="create">생 성</button>
				</form>
			</td>
		</tr>
	</table>
	</article>
</section>
<script>
	document.querySelector('#create').addEventListener('click',
		function(){
		alert('클릭');	
		document.querySlectoer('#admin_create').submit;
		},false); 
	
	
</script>

</div>
 <%@ include file="../common/footer.jsp"%>
</body>

</html>
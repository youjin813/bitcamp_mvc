<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Index</title>
	<link rel="stylesheet" href="${ctx}/../css/common.css" />
	<link rel="stylesheet" href="${ctx}/../css/admin_main.css" />
	<link rel="stylesheet" href="${ctx}/resources/css/index.css" />
	<link rel="shortcut icon"  href="../img/favicon.ico" />
	<script src="../js/index.js"></script>
</head>
<body>
<div id="wrapper">
<header id="index_header">
	<h1>BIT CAMP SAMPLE PROJECT</h1>
</header>
<section id="index_section">
<article>
<table id="index_table">
	<tr>
		<td colspan="5">
	  			<form id="index_login_form" action="${ctx}/user.do">
	  				<table id="index_login_box">
	  				<tr>
	  					<td >
							<input id="index_input_id" type="text" name="id" placeholder="ID"/>						  					
	  					</td>
	  					<td rowspan="2">
	  						<button id="index_login_btn">로그인</button>
	  						
	  					</td>
	  				</tr>
	  				<tr>
	  					<td>
	  						<input id="index_input_pass" type="text" name="pass" placeholder="PASSWORD"/>
	  						<input type="hidden" name="cmd" value="login" />
	  						<input type="hidden" name="page" value="mypage" />
	  					</td>
	  				</tr>
	  			 </table>	
			</form>
			<a id="go_admin_link">관리자</a>
			<a id="go_join_link">회원가입</a>
			<a id="go_jdbc_link">JDBCTest</a>
</table>
</article>
</section>
</div>
<%@ include file="../common/footer.jsp"%>
</body>
<script>
	document.querySelector('#index_login_btn').addEventListener('click',
		function(){
		alert('로그인 하시겠습니까?');
		document.querySelector('#index_login_form').submit;
		},false);
	
	document.querySelector('#go_admin_link').addEventListener('click',
			function(){
		alert('관리자?');
		location.href="${ctx}/admin/main.do"
	},false);
	
	document.querySelector('#go_join_link').addEventListener("click",
		function(){
		alert('회원이 아니신가요?');
		location.href ="${ctx}/user.do?cmd=move&page=join"
	},false);
	
	document.querySelector('#go_jdbc_link').addEventListener("click",
			function(){
				location.href = "${ctx}/common/jdbc_test.do"
			},false);
	
</script>
</html>
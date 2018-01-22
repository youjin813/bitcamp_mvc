<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/nav.jsp"%>
<h1>마이페이지</h1>
<article>
<form name="change_pass" id="change_pass" action="${ctx}/user.do">
	<table id="mypage_table">
		<tr>
			<td rowspan="5"><img src="${ctx}/resources/img/profile.png" /></td>
			<td class="column">ID</td>
			<td>${sessionScope.user.id}</td>
			<td class="column">PW</td>
			<td>${sessionScope.user.pass}</td>
		</tr>
		<tr>
			<td class="column">NAME</td>
			<td>${sessionScope.user.name}</td>
			<td class="column">GENDER</td>
			<td>${sessionScope.user.ssn}</td>
		</tr>
		<tr>
			<td class="column">BIRTHDAY</td>
			<td>${sessionScope.user.ssn}</td>
			<td class="column">PHONE</td>
			<td>${sessionScope.user.phone}</td>
		</tr>
		<tr>
			<td class="column">EMAIL</td>
			<td>${sessionScope.user.email}</td>
			<td class="column">ADDRESS</td>
			<td>${sessionScope.user.addr}</td>
		</tr>
			<tr>
			<td class="column">ACCOUNT</td>
			<td>${sessionScope.account.account_num}</td>
			<td class="column"></td>
			<td></td>
		</tr>
	</table>
		<button id="pass_update_btn" name ="pass_update_btn" style="width: 200px">비밀번호 변경</button>
		<input type="hidden" name="cmd" value="move" />
		<input type="hidden" name="dir" value="user" />
		<input type="hidden" name="page" value="change_pass" />
</form>	
		<button id="delete_btn" name ="delete_btn" style="width: 200px">탈퇴</button> 
		<button id="logout_btn" name ="logout_btn" style="width: 200px">로그아웃</button> 
	</article>
	
<%@ include file="../common/footer.jsp"%>

<script>
	document.querySelector('#pass_update_btn').addEventListener('click',
			function() {
			alert('비밀번호를 변경하시겠습니까?')	
			document.querySelector('#change_pass').submit();
			},false);
	
	document.querySelector('#delete_btn').addEventListener('click',
			function(){
			alert('탈퇴하시겠습니까?')
			location.href="${ctx}/user.do?cmd=delete";
			},false);
	
	document.querySelector('#logout_btn').addEventListener('click',
			function(){
			alert('로그아웃하시겠습니까')
			location.href="${ctx}/user.do";
			},false);
</script>
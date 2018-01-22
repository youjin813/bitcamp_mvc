<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/nav.jsp"%>
<body>

<h1>비밀번호변경</h1>

<form id="change_pass_form"name="change_pass_form" action="${ctx}/user.do">
	<table>
		<tr>
			<td>현재 비밀번호</td>
			<td>
			<input type="text" value="${sessionScope.user.pass}"  />
			</td>
		</tr>
		<tr>
			<td>수정 비밀번호</td>
			<td>
				<input type="text" name="newPass" />
			</td>
		</tr>
		<tr>
			<td>수정 비밀번호 확인</td>
			<td>
			<input name="change_check" type="text" />
			<input type="text" size="35px" /><br />
			<input type="hidden" name="cmd" value="change_pass" />
			<input type="hidden" name="dir" value="bitcamp" />
			<input type="hidden" name="page" value="main" />
			</td>
		</tr>
		<tr>
			<td>
				<button id="confirm">확인</button>
				<button id="cancel">취소</button>		
			</td>
		</tr>
	</table>
</form>
</body>
<script>
	document.querySelector('#confirm').addEventListener('click',
			function(){
		document.querySelector('#change_pass_form').submit();
	},false);
</script>
</html>
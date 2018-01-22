<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<body>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/nav.jsp"%>
<h1>SKTELECOM</h1>
		<button id="phone_open" name="phone_open">번호 개통</button><br />

<%@ include file="../common/footer.jsp"%>
</body>
 <script>
document.querySelector('#phone_open').addEventListener('click',
		function(){
		alert('핸드폰 개통 하시겠습니까?');
		location.href="${ctx}/mobile.do?cmd=open_phone&dir=user&page=mypage"
	},false);
</script>
</html>

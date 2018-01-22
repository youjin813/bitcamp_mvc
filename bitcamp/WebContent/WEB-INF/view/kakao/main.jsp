<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<body>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/nav.jsp"%>
<h1>카카오뱅크</h1>

		<button id="create_account" name="create_account">통장개설</button><br />
		<button>입금</button><br />
		<button>출금</button><br />
		<button>송금</button><br />
		<button>통장해지</button><br />

<%@ include file="../common/footer.jsp"%>
</body>
 <script>
 document.querySelector('#create_account').addEventListener('click',
		 function () {
		 alert('통장개설하시겠습니까?');
		 location.href="${ctx}/kakao.do?cmd=create_account&dir=user&page=mypage"
		},false);
</script>
</html>

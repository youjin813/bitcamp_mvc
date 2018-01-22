<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<body>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/nav.jsp"%>
<section>
<article>
<form action="result.jsp">
	구매 금액 : <input type="text" name="money" placeholder="게임 당 1000원 최대 5게임" />	
	<input type="submit" value="전 송" />
</form>
</article>
</section>
<aside></aside>
<%@ include file="../common/footer.jsp"%>
</body>
 <script src="../../js/lotto.js"></script>
</html>
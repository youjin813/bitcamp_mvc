<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bitcamp.css" />
<body>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/nav.jsp"%>
<div id="wrapper">
<section>
<h1>비트캠프</h1>

<table id="attend_table">
	<tr>
		<th>요일</th>
		<th>월</th>
		<th>화</th>
		<th>수</th>
		<th>목</th>
		<th>금</th>
	</tr>
	<tr>
		<td>상태</td>
		<td>
		<select name="result" id="">
		<option>출석</option>
		<option>지각</option>
		<option>조퇴</option>
		<option>결석</option>
		</select>
		</td>
		<td>
		<select name="result" id="">
		<option>출석</option>
		<option>지각</option>
		<option>조퇴</option>
		<option>결석</option>
		</select>
		</td>
		<td>
		<select name="result" id="">
		<option>출석</option>
		<option>지각</option>
		<option>조퇴</option>
		<option>결석</option>
		</select>
		</td>
		<td>
		<select name="result" id="">
		<option>출석</option>
		<option>지각</option>
		<option>조퇴</option>
		<option>결석</option>
		</select>
		</td>
		<td>
		<select name="result" id="">
		<option>출석</option>
		<option>지각</option>
		<option>조퇴</option>
		<option>결석</option>
		</select>
		</td>

	</tr>
	<tr>
		<td>결과</td>
		<td><input type="text" name="result"/></td>
		<td><input type="text" name="result"/></td>
		<td><input type="text" name="result"/></td>
		<td><input type="text" name="result"/></td>
		<td><input type="text" name="result"/></td>
	</tr>
	<tr>
	<td colspan="6">
	<input type="hidden" name="id" value="g" />
	<button id="attend_result" style="width: 200px; margin: 0 auto;">확인</button>
	</td>
	</tr>
</table>
</section>
</div>
<%@ include file="../common/footer.jsp"%>
<script>

</script>
</body>
</html>


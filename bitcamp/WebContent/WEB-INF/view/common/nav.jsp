<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<nav id="nav">
	<ul style="height: 10%">
		<li style="width: 20%; text-align: center;">
			<a id="burgerking" href="${ctx}/user.do?cmd=move&dir=burgerking&page=main">버거킹</a></li>
		<li style="width: 20%; text-align: center">
			<a id="kakao_btn" >카카오뱅크</a></li>
		<li style="width: 20%; text-align: center">
			<a id="bitcamp" href="${ctx}/user.do?cmd=move&dir=bitcamp&page=main">비트캠프</a></li>
		<li style="width: 20%; text-align: center">
			<a id="sktelecom_btn">SK 텔레콤</a></li>
		<li style="width: 20%; text-align: center">
			<a id="lotto">로또</a></li>
		<li style="width: 20%; text-align: center">
			<a id="lotto"  href="${ctx}/user.do?cmd=move&dir=user&page=mypage">마이페이지</a></li>
		<li style="width: 20%; text-align: center">
			<a id="lotto">로그아웃</a></li>
	</ul>	
</nav>	
<script>
	document.querySelector('#kakao_btn').addEventListener('click',
			function(){
			location.href="${ctx}/kakao.do?page=main";
			},false);
	
	document.querySelector('#sktelecom_btn').addEventListener('click',
			function(){
			location.href="${ctx}/mobile.do?dir=sktelecom&page=main";
	},false);
</script>
window.onload=excute;
function excute() {
	document.querySelector('#nav_burgerking').onclick = goBurgerking;
	document.querySelector('#nav_kakao').onclick = goKakao;
	document.querySelector('#nav_bit').onclick = goBitcamp;
	document.querySelector('#nav_sk').onclick = goSktelecom;
	document.querySelector('#nav_lotto').onclick = goLotto;
	document.querySelector('#burgerking_order_btn').onclick = burgerkingOrder;
	document.querySelector('#footer_bitCamp').onclick = gofooter;
	document.querySelector('#header_home').onclick = goHome;
	document.querySelector('#header_logout').onclick = goLogOut;
	
}

function goBurgerking() {
	location.href="../burgerking/main.jsp";
}
function goKakao() {
	location.href="../kakao/main.jsp";
}
function goBitcamp() {
	location.href="../bitcamp/main.jsp";
}
function goSktelecom() {
	location.href="../sktelecom/main.jsp";
}
function goLotto() {
	location.href="../lotto/main.jsp";
}
function burgerkingOrder() {
	document.auervSelector('#order form').submit();
}
function gofooter() {
	location.href="http://bitcamp.co.kr/index.php?main_page=home";
}
function goHome() {
	location.href="../index.jsp";
}
function goLogOut() {
	location.href="../index.jsp";
}

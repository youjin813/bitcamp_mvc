function init(){
	var goAdminLink = document.querySelector('#go_admin_link');
	var goJoinLink = document.querySelector('#go_join_link');
	var indexLoginBtn = document.querySelector('#index_login_btn');
	goAdminLink.addEventListener("click",goAdmin,false);
	goJoinLink.addEventListener("click",goJoin,false);
	indexLoginBtn.addEventListener("click",indexLogin,false);
	
}
function indexLogin(e){
	var loginId = document.querySelector('#index_input_id').value;
	var joinId = sessionStorage.getItem('id');
	if(!(loginId === joinId)){
		e.preventDefault();
		alert('입력하신'+loginId+'는 틀립니다.');
	}
	alert('회원가입한 아이디'+ id);
}
function goAdmin(){
	if(confirm('관리자?')){
		alert('안녕하세요 관리자님');
		location.href="admin/main.jsp";
	}else{
		alert('관리자만 접근 가능합니다.');
	}
}
function goJoin(){
	alert('회원이 아니신가요?');
	location.href="member/join.jsp";
}
window.addEventListener('load',init,false);

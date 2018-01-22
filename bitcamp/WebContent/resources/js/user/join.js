function init(){
	var checkDuplBtn = document.querySelector("#check_dupl_btn");
	var joinconfirmBtn = document.querySelector("#join_confirm_btn");
	checkDuplBtn.addEventListener("click",checkDuplication,false);
	joinconfirmBtn.addEventListener("click",joinconfirm,false);
}
function checkDuplication(e){
	alert('중복체크 클릭');
	e.preventDefault();
}
function joinconfirm(e) {
	var joinId = document.querySelector('#join_id').value;
	alert('가입 확인 클릭'+joinId);
	sessionStorage.setItem('id',joinId);
	document.querySelector('#join_form').submit();
}
window.addEventListener("load",init,false);
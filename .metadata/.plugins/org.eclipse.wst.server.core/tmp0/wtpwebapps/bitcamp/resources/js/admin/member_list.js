function init(){
	document.querySelector('#add_member_btn').addEventListener('click',addMember,false);
}
function addMember(){
	location.href="member_register_form.jsp";
}
window.addEventListener('load',init,false);
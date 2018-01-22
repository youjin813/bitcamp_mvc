function init(){
	document.querySelector('#create_table_btn')
		.addEventListener('click',createTable,false);
}
function createTable(){
	location.href="member_list.jsp";
}
window.addEventListener('load',init,false);
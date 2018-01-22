function init() {
	var arr=['burgerking','kakao','bitcamp','sktelecom','lotto'];
	for (var i = 0; i < arr.length; i++) {
		document.querySelector('#'+arr[i]).addEventListener('click',
				function(e){
				location.href = "../"+this.id+"/main.jsp";
				},false);
	}
	document.querySelector('#header_home').addEventListener('click',
			function(e) {
				location.href = "../index.jsp";
			},false);
	document.querySelector('#header_logout').addEventListener('click',
			function(e) {
				location.href = "../index.jsp";
			},false);
	document.querySelector('#attend_result').addEventListener('click',bitcampResult,false);
		}
	function bitcampResult(){
		location.href = "result.jsp";
	}
window.addEventListener("load",init,false);
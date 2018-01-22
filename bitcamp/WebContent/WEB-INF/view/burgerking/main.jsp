<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<body>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/nav.jsp"%>
<section id="wrapper">
<article>
	<header>
		<hgroup>
			<h1><mark>버거킹</mark>주문 화면</h1>
			<h2>상품과 수량을 선택해주세요.</h2>
		</hgroup>
	</header>
</article>
	<article>
	<form id="order_form" action="result.jsp" style="width : 630px; margin: 0 auto;">
		<table>
			<tr>
				<td>
				<figure>
				<img src="../../img/hamburger.jpg" style="width:210px; height: 130px;" alt="" /><br />
				<figcaption>
				<input type="checkbox" name="menu" value="hamburger"/>햄버거 ￦5,500
				<input type="number" name="hamburger-count" style="width: 25px" min="1" max="9"/>개
				</figcaption>
				</figure>
				</td>
				<td>
				<figure>
				<img src="../../img/coke.jpg" style="width:210px; height: 130px;" alt="" /><br />
				<figcaption>
				<input type="checkbox" name="menu" value="coke"/>콜라 ￦1,000 
				<input type="number" name="coke-count" style="width: 25px" min="1" max="9"/>개
				</figcaption>
				</figure>
				</td>
				<td>
				<figure>
				<img src="../../img/chip.jpg" style="width:210px; height: 130px" alt="" /><br />
				<figcaption>
				<input type="checkbox" name="menu" value="chip"/>감자칩 ￦1,000
				<input type="number" name="chip-count" style="width: 25px" min="1" max="9"/>개
				</figcaption>
				</figure>
				</td>
			</tr>
				<tr>
				<td>
				<figure>
				<img src="../../img/coffee.jpg" style="width:210px; height: 130px" alt="" /><br />
				<figcaption>
				<input type="checkbox" name="menu" value="coffee"/>커피 ￦900
				<input type="number" name="coffee-count" style="width: 25px" min="1" max="9"/>개
				</figcaption>
				</figure>
				</td>
				<td>
				<figure>
				<img src="../../img/bagle.jpg" style="width:210px; height: 130px" alt="" /><br />
				<figcaption>
				<input type="checkbox" name="menu" value="bagle"/>베이글 ￦4.000
				<input type="number" name="bagle-count" style="width: 25px" min="1" max="9"/>개
				</figcaption>
				</figure>
				</td>
				<td>
				<figure>
				<img src="../../img/salad.jpg" style="width:210px; height: 130px" alt="" /><br />
				<figcaption>	
				<input type="checkbox" name="menu" value="salad"/>샐러드 ￦3.000
				<input type="number" name="salad-count" style="width: 25px" min="1" max="9"/>개
				</figcaption>
				</figure>
				</td>
				
			</tr>
			<tr>
				<td colspan="3">
				<input type="radio" name="place" value="매장식사" checked/>매장식사
				<input type="radio" name="place" value="테이크아웃"/>테이크아웃
			</td>
		</tr>	
		<tr>
			<td colspan="3">
			<input type="hidden" name="hamburger" value="5500"/>
			<input type="hidden" name="coke" value="1000"/>
			<input type="hidden" name="chip" value="1000"/>
			<input type="hidden" name="bagle" value="4000"/>
			<input type="hidden" name="salad" value="3000"/>
			<input type="hidden" name="coffee" value="900"/>
			<input id="burgerking_order_btn" type="button" value="전 송" style="width: 100px; margin-left: 250px"/>	
			</td>
	  </tr>
	 </table>
</form>
</article>
</section>		
<aside></aside>  			
 <%@ include file="../common/footer.jsp"%>
 </body>
 <script src="../../js/burgerking.js"></script>
</html>
 
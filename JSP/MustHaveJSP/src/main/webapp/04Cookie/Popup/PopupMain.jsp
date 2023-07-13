<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String popupMode = "on";
// "PopupClose" 쿠키가 만들어지면 popupMode = "off"
Cookie[] cookies = request.getCookies(); // 쿠키를 읽어 popupMode 값 설정
if (cookies != null) {
	for (Cookie c : cookies) {
		String cookieName = c.getName();
		String cookieValue = c.getValue();
		if (cookieName.equals("PopupClose")) { // "PopupClose" 쿠키가 존재하면
				popupMode = cookieValue; // popupMode 값 갱신
		}
	}
}
%>
<html>
<head>
<title>쿠키를 이용한 팝업 관리</title>
<style>
div#popup {
	top: 100px;
	left: 100px;
	color: yellow;
	width: 300px;
	height: 100px;
	background-color: gray;
}

div#popup>div {
	position: relative;
	top: 0px;
	border: 1px solid gray;
	padding: 10px;
	color: black;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
</script>
<script>
	$(function() {
		$('#closeBtn').click(function() { // 닫기 버튼 누르면
			$('#popup').hide();  // 팝업창 닫음
			// checkbox가 체크되면 그 값을 가져오고, 아니면 안 가져옴
			var chkVal = $("input:checkbox[id=inactiveToday]:checked").val();
			$.ajax({								
				url : './PopupCookie.jsp',			// PopupCookie.jsp 파일에
				type : 'get',						// HTTP GET 방식으로
				data : {inactiveToday : chkVal},	// inactiveToday
				dataType : "text",
				success : function(resData) {
					if (resData != '')
						location.reload();
				}
			});
		});
	});
</script>

</head>
<body>
	<h2>팝업 메인 페이지</h2>
	<%
	for (int i = 1; i <= 10; i++) {
		out.print("현재 팝업창은 " + popupMode + " 상태입니다.<br/>");
	}
	if (popupMode.equals("on")) {
	%>
	<div id="popup">
		<h2 align="center">공지사항 팝업입니다.</h2>
		<div align="right">
			<form name="popFrm">
				<input type="checkbox" id="inactiveToday" value=1 /> 하루 동안 열지 않음 <input
					type="button" id="closeBtn" value="닫기" />
			</form>
		</div>
	</div>
	<%
	}
	%>
</body>
</html>
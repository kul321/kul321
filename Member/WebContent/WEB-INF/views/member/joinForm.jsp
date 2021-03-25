<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div {
	width: 400px;
	border-collapse: collapse;
	border: 1px solid #ccc;
}
#title {
	margin: 0 auto;
}
</style>
</head>
<body>
<div id="bbs">
	<div id="bbs_title">
	회원가입
	</div>
	<form action="/WEB-INF/views/member/result.jsp" method="post" name="myForm">
	<div class = "bbsCreated_bottomLine">
	<dl>
		<dt>아&nbsp;이&nbsp;디</dt>
		<dd><input type="text" name="userid" size="35" maxlength="20" class="boxTF"/></dd>
	</dl>
	</div>
	
	<div class="bbsCreated_bottomLine">
	<dl>
		<dt>패스워드</dt>
		<dd><input type="text" name="userpw" size="35" maxlength="20" class="boxTF"/></dd>
	</dl>
	</div>
	
	<div class = "bbsCreated_bottomLine">
	<dl>
		<dt>닉&nbsp;네&nbsp;임</dt>
		<dd><input type="text" name="nick" size="35" maxlength="20" class="boxTF"/></dd>
	</dl>
	</div>
	<div class = "bbsCreated_bottomLine">
	<dl>
		<dt>이&nbsp;메&nbsp;일</dt>
		<dd><input type="text" name="nick" size="35" maxlength="20" class="boxTF"/></dd>
	</dl>
	</div>
	<div id="bbsCreated_footer">
		<input type="submit" value="가입하기"/>
	
	</div>
	
	</form>
</div>
</body>
</html>
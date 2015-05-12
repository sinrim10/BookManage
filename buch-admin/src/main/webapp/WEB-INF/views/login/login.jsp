<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>로그인</title>
<meta charset="UTF-8">

<!--[if IE]> 
<script src="/resources/js/html5shiv.js"></script>
<![endif]-->


<link href="/resources/css/design.css" rel="stylesheet">
<script type="text/javascript">
$(document).ready(function() {
        $("#btnsend1").click(function() {
                var action = $("#frm").attr('action');
                var frm_data = {
                		userid: $("#userid").val(),
                        password: $("#password").val(),
                        is_ajax: 1
                };
                $.ajax({
                        type: "POST",
                        url: "loginfind",
                        data: frm_data,
                        
                        success: function(response) {
                                if(response == 'success') {
                                	document.frmlogin.target = "_self";
                                	document.frmlogin.method = "post";
                                	document.frmlogin.action = "<c:url value='/home/main.buch'/>";
                                	document.frmlogin.submit();
                                }
                                else {
                                	alert("아이디 또는 비밀번호가 잘못되었습니다."); 
                                }
                        },
                        error:function(response){
                        	 alert('error');
                        }
                });
                return false;
        });
        
});


function doLogin() 
{

	document.frmlogin.target = "_self";
	document.frmlogin.method = "post";
	document.frmlogin.action = "<c:url value='home/main.buch'/>";
	document.frmlogin.submit();
	
}
</script>
</head>

<body>
<form name="frmlogin">
	<fieldset class ="loginfld" >
		<legend>로그인 정보</legend>
		<ul>
			<li><label for="uid" class="logtit">ID</label> 
			<input type="text"	id="uid" placeholder="아이디입력" required></li>
			<li><label for="pwd" class="logtit">PASSWORD</label> 
			<input	type="password" id="pwd" placeholder="비밀번호입력" required></li>
		</ul>
	</fieldset>
  <div class="centered">
      <input type="submit" id=btnsend value="확인" onclick="doLogin();">
      <input type="reset"  value="취소">
  </div>
  </form>
</body>
</html>
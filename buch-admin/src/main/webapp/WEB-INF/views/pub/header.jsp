<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<link rel="stylesheet" href="/resources/css/design.css">
<script src='/resources/user/publisher.js' type="text/javascript"></script>
<script type="text/javascript" src="/resources/js/jquery-1.9.1.js"></script>
<script>

function doPubFind() 
{
	document.frmpubfind.target = "_self";
	document.frmpubfind.method = "post";
	document.frmpubfind.action = "<c:url value='/pub/main'/>";
	document.frmpubfind.submit();
	
}

function doPubInsert() 
{

	document.frmpubfind.target = "_self";
	document.frmpubfind.method = "post";
	document.frmpubfind.action = "<c:url value='/pub/pubreg'/>";
	document.frmpubfind.submit();
	
}
function fn_search() {	

	var pubCd = $("#pubCd").val();

	var pubNm = $("#pubNm").val();	
	
	var busiPresident = $("#busiPresident").val();
	
	var param = "&pubCd="+encodeURIComponent(pubCd)+"&pubNm="+pubNm+"&busiPresident="+busiPresident;
	

	//param += "&keyword="+keyword;	
	//alert(param);
	fn_ajaxList(param);

	}

function fn_ajaxList(param) {

$("#datalist").clearGridData();  // 이전 데이터 삭제
    $("#datalist").setGridParam({	url:"/publisher/edit.buch?"+param, datatype:"json" }).trigger("reloadGrid"); 
}
</script>
	<form id="frmpubfind" name="frmpubfind" method="post">
		<fieldset class="pubfind">
			<legend>검색조건</legend>
			<ul>
				<li>
					<label for="pubCd" class="tit">출판사코드</label>
					<input type="text" id="pubCd" >
					<label for="pubNm" class="tit">출판사명</label>
					<input type="text" id="pubNm" >
					<label for="busiPresident" class="tit">사업자 대표자명</label>
					<input type="text" id="busiPresident" >
				</li>
			    <li>
					<button type="button" onclick="fn_search();">검색</button>
					<button type="button" onclick="doPubInsert();">등록</button>
				</li>
			</ul>
		</fieldset>
	</form>

<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script src='/resources/user/publisher.js' type="text/javascript"></script>
<script>
/* function doPubFind() 
{

	document.frmpubhd.target = "_self";
	document.frmpubhd.method = "post";
	document.frmpubhd.action = "<c:url value='home/main.buch'/>";
	document.frmpubhd.submit();
	
} */

/* function doPubInsert() 
{

	document.frmpubhd.target = "_self";
	document.frmpubhd.method = "post";
	document.frmpubhd.action = "<c:url value='/pub/pubreg'/>";
	document.frmpubhd.submit();
	
} */

function fn_search() {	

	var pubCd = $("#pubCd").val();

	var pubNm = $("#pubNm").val();	
	
	var param = "&keyfield="+pubCd;

	param += "&keyword="+encodeURIComponent(pubNm);	
	//alert(param);
	fn_ajaxList(param);

	}

function fn_ajaxList(param) {

$("#datalist").clearGridData();  // 이전 데이터 삭제
    $("#datalist").setGridParam({url:"/publisher/publisherListData.buch?"+param, datatype:"json" }).trigger("reloadGrid"); 
}
</script>

	<form name="frmpubhd" method="post">
		<fieldset >
			<legend>검색조건</legend>
			   <ol>
					<li>
						<label for="pubCd" class="tit">출판사코드</label>
						<input type="text" id="pubCd" >
						<label for="pubNm" class="tit">출판사명</label>
						<input type="text" id="pubNm" >
						<label for="busiPresident" class="tit">대표자명</label>
						<input type="text" id="busiPresident" >
					</li>
					<li>
						<label for="busiNo" class="tit">사업자번호</label>
						<input type="text" id="busiNo" >
						<label for="busiTel" class="tit">전화번호</label>
						<input type="text" id="busiTel" >
						<label for="busiFax" class="tit">팩스번호</label>
						<input type="text" id="busiFax" >
					</li>
				</ol>	
			<button type="button" onclick="fn_search();">검색</button>
			<button type="button" onclick="doPubInsert();">등록</button>
		</fieldset>
	</form>

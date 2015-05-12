<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<script>
function doGoodsInsert() 
{

	document.frm.target = "_self";
	document.frm.method = "post";
	document.frm.action = "<c:url value='/goods/goodsreg'/>";
	document.frm.submit();
	
}

function doGoodsEdit() 
{

	document.frm.target = "_self";
	document.frm.method = "post";
	document.frm.action = "<c:url value='/goods/goodsedit'/>";
	document.frm.submit();
	
}
</script>
<p>상품메인</p>
<form name="frm" method="post">
      <button type="submit" onclick="doGoodsInsert();">등록</button>
      <button type="submit" onclick="doGoodsEdit();">수정</button>
</form>
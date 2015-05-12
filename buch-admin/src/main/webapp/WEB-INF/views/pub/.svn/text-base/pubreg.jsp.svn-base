<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <link rel="stylesheet" href="//code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.9.1.js"></script>
  <script src="//code.jquery.com/ui/1.10.3/jquery-ui.js"></script>



<script>
$(function() {
	  $( "#closeDt" ).datepicker({
	    dateFormat : 'yy-mm-dd',
	    changeMonth : true,
	    changeYear : true,
	    dayNamesMin : ["일","월","화","수","목","금","토"],
	    monthNamesShort : ["1월","2월","3월","4월","5월","6월","7월","8월",
	                       "9월","10월","11월","12월"]
	  });
	  $( "#sttlementDt" ).datepicker({
		    dateFormat: 'yy-mm-dd',
		    changeMonth : true,
		    changeYear : true,
		    dayNamesMin : ["일","월","화","수","목","금","토"],
		    monthNamesShort : ["1월","2월","3월","4월","5월","6월","7월","8월",
		                       "9월","10월","11월","12월"]
		  });
	});

</script>
<link rel="stylesheet" href="/resources/css/design.css">

<form:form  method="post" modelAttribute="publisherVo"  action="/publisher/insert.buch">

 <fieldset>
     <legend>등록항목</legend>
     	<ol>
			<li>
				<form:label path="pubCd">출판사코드</form:label>
				<form:input path="pubCd" />
				<form:label path="pubGb"> 구분</form:label>
				<form:select  path="pubGb">
					<form:option value="01">직거래출판사</form:option>
					<form:option value="02">소도매</form:option>
					<form:option value="03">물류창고</form:option>
				</form:select>
				<form:label path="pubNm"> 출판사명</form:label>
				<form:input path="pubNm" />
				<form:label path="busiNo"> 사업자번호</form:label>
				<form:input path="busiNo" />
			</li>
			<li>
				<form:label path="busiPresident">대표자이름</form:label>
				<form:input path="busiPresident" />
				<form:label path="busiTel">전화번호</form:label>
				<form:input path="busiTel" />
				<form:label path="busiFax">FAX번호</form:label>
				<form:input path="busiFax" />
			</li>	
			<li>
				<form:label path="busiZip">우편번호</form:label>
				<form:input path="busiZip" />
				<form:label path="busiAddr1">주소1</form:label>
				<form:input path="busiAddr1" />
				<form:label path="busiAddr2">주소2</form:label>
				<form:input path="busiAddr2"/>
			</li>
			<li>
				<form:label path="busiIndustry">업종</form:label>
				<form:input path="busiIndustry" />
				<form:label path="busiItem">종목</form:label>
				<form:input path="busiItem" />
				<form:label path="taxGb">세금구분</form:label>
				<form:select path="taxGb">
					<form:option value="01">과세</form:option>
					<form:option value="02">면세</form:option>
				</form:select>
			</li>
			<li>
				<form:label path="billType">계산서발행</form:label>
				<form:select path="billType">
					<form:option value="01">발행</form:option>
					<form:option value="02">미발행</form:option>
				</form:select>
				<form:label path="dealType">거래구분</form:label>
				<form:select path="dealType">
					<form:option value="01">거래</form:option>
					<form:option value="02">중지</form:option>
					<form:option value="03">보류</form:option>
				</form:select>				
				<form:label path="closeDt">폐점일자</form:label>
				<form:input path="closeDt" />
				
			</li>
			<li>
				<form:label path="busiDelivery">배본대행처</form:label>
				<form:input path="busiDelivery" />
				<form:label path="busiEmail">메일주소</form:label>
				<form:input path="busiEmail" />
				<form:errors path="busiEmail" cssClass="error"/>
				<form:label path="sttlementDt">결재일</form:label>
				<form:input  path="sttlementDt" />
			</li>
			<li>
				<form:label path="useYn">사용유무</form:label>
				<form:input path="useYn"/>
			</li>
	
		</ol>
		<form:hidden path="regId" />
		<form:hidden path="regDt" />
		<input type="submit" class="button" value="등록">			
 </fieldset>
 </form:form>
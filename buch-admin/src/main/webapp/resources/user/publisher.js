
function go_register_action(){
	doCodeSearch();
	frm.submit();
}
function doCodeSearch()
{  var action = $("#frm").attr('action');
	$.post("/publisher/publisher.buch");
	
}
$(function() {
	$("#datalist").jqGrid({
		url : '/publisher/publisherListData.buch',
		async: false,
		datatype : "json",
	/*	postData: {
			pubCd: function() { return $("#pubCd").val(); },
		    maxPrice: function() { return $("#maxPrice").val(); },
		},*/
		mtype: 'POST',
		colNames : [ '코드', '출판사명' ,'대표자', '전화번호', '팩스', '우편번호', '주소'],
		colModel : [ 
						{name:'pubCd'             ,index:'pubCd'              , width:80, align: "center", editable: true},
						{name:'pubNm'             ,index:'pubNm'              , width:140, align: "center", editable: true},
						{name:'busiPresident'     ,index:'busiPresident'      , width:80, align: "center", editable: true},
						{name:'busiTel'           ,index:'busiTel'            , width:100, align: "center", editable: true},
						{name:'busiFax'           ,index:'busiFax'            , width:100, align: "center", editable: true},
						{name:'busiZip'           ,index:'busiZip'            , width:80, align: "center", editable: true},
						{name:'busiAddr1'         ,index:'busiAddr1'          , width:200 , align: "center", editable: true},
		],
		rowNum : 20,
		rowList : [ 10, 20, 30 ],
		height:"auto",width:"auto",
		pager : '#pagingDiv',
		sortname : 'pubCd',
		viewrecords : true,
		sortorder : "asc",
		caption : "출판사 리스트",
		editurl:'/publisher/edit.buch'/*,
		ondblClickRow : function(id) {
			location.href = "/pub/pubedit";
			
		},
		cellEdit:true,
	    		jsonReader : {
			repeatitems : false
		// json key와 밸류로사용하기 위해
		},
		loadError : function(xhr, status, error) {
			alert(xhr.responseText); // 
		},
		loadComplete : function(data) {
		}*/
	});



		// 리스트

	$("#datalist").jqGrid("navGrid", "#pagingDiv",
			{edit: true, add:true, del:true},
			{closeAfterEdit: true, reloadAfterSubmit: true},
			{closeAfterAdd: true, reloadAfterSubmit: true},
			{reloadAfterSubmit: true},
			{sopt : ["eq","ne","lt","le","gt","ge","bw","bn","ew","en","cn","nc","in","ni"]});
});


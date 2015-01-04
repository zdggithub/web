<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Borrow</title>
</head>
<style type="text/css"> 
a.button:hover {
    padding: 2px 25px;
    margin-right: 20px;
    height: 20px;
    line-height: 20px;
}
</style>
<script type="text/javascript" src="http://js.jrj.com.cn/myjrj/js/jquery.js"></script>
<body>
 <h1>我的借款</h1>
  <tr>
  <td></td>
  <td><a href="/com/addBorrow" target="_parent">增加借款</a></td>
  <td></td>
  <td><a href="/com/updateBorrow" target="_parent">修改借款</a></td>
  </tr>
 <table border = "1" width = "100%">
  <tr>
   <td>借款序号</td>
   <td>借款总额</td>
   <td>年利率</td>
   <td>借款创建时间</td>
   <td>借款修改时间</td>
   <td>借款期数</td>
   <td>月还款额</td>
   <td>总还款额</td>
   <td>借款标题</td>
   <td>借款目的</td>
   <td>借款说明</td>
   <td>借款状态</td>
   <td>操作</td>
  </tr>
  
  <c:forEach var="sub" items="${borrow}" >
   <tr id="br_<c:out value="${sub.id}" />">
    <td><c:out value="${sub.id}" /></td>
    <td><c:out value="${sub.totalLoan}" />元</td>
    <td><c:out value="${sub.annualRate}" />%</td>
    <td><c:out value="${sub.ctime}" /></td>
    <td><c:out value="${sub.utime}" /></td>
    <td><c:out value="${sub.periods}" />月</td>
    <td><c:out value="${sub.monthlyRepayment}" />元</td>
    <td><c:out value="${sub.totalRepayment}" />元</td>
    <td><c:out value="${sub.title}" /></td>
    <td><c:out value="${sub.purpose}" /></td>
    <td><c:out value="${sub.illustrate}" /></td>
    <td class='tdstate'><c:out value="${sub.state}" /></td>
    <td><a href="javascript:void(0);"  onclick="modifyStatus('<c:out value="${sub.id}" />');">修改</a></td>
   </tr>
  </c:forEach>
 </table> 
 
</body>
<script type="text/javascript">
function modifyStatus(id){
	var dd = 'br_'+id;
	//alert($('#'+dd).html());
	//alert($('#'+dd).find('.tdstate').html());
	$.ajax({
		type: "post",
		url: "/com/updateStatus",
		data: {'id':id},
		dataType:"json",
		timeout:10000,
		cache: false,
		beforeSend: function(XMLHttpRequest) {
		},
		success: function(data, textStatus) {
			var ss = data.state;
			$('#'+dd).find('.tdstate').html(ss);
		}
	}); 
}
function delete1(id){
	
	$.ajax({
		type: "post",
		url: queryUrl_,
		data: queryUrlData.toString(),
		dataType:"json",
		timeout:10000,
		cache: false,
		beforeSend: function(XMLHttpRequest) {
		},
		success: function(data, textStatus) {
			
		}
	});
}
</script>

</html>

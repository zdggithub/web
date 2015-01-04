<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>

<body>
  <h1>所有借款</h1>
  <table border = "1" width = "100%">
  <tr>
      <td>借款序号</td>
      <td>借款用戶</td>
      <td>借款总额</td>
      <td>年利率</td>
      <td>借款创建时间</td>
      <td>借款更新时间</td>
      <td>借款成功时间</td>
      <td>借款期数</td>
      <td>月还款额</td>
      <td>总还款额</td>
      <td>借款标题</td>
      <td>借款目的</td>
      <td>借款说明</td>
      <td>借款状态</td>
  </tr>
  
  <c:forEach var="sub" items="${manage}" >
  	<tr>
      <td><c:out value="${sub.id}" /></td>
      <td><c:out value="${sub.userId}" /></td>
      <td><c:out value="${sub.totalLoan}" />元</td>
      <td><c:out value="${sub.annualRate}" />%</td>
      <td><c:out value="${sub.ctime}" /></td>
      <td><c:out value="${sub.utime}" /></td>
      <td><c:out value="${sub.btime}" /></td>
      <td><c:out value="${sub.periods}" />月</td>
      <td><c:out value="${sub.monthlyRepayment}" />元</td>
      <td><c:out value="${sub.totalRepayment}" />元</td>
      <td><c:out value="${sub.title}" /></td>
      <td><c:out value="${sub.purpose}" /></td>
      <td><c:out value="${sub.illustrate}" /></td>
      <td><c:out value="${sub.state}" /></td>
 	</tr>
  </c:forEach>
 
  </table>
</body>
</html>

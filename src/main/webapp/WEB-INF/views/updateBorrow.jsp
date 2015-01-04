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
  <form action="/com/updateBorrow">
  <h1 align="center">更新借款</h1>
  <table>
  	<tr>
      <td>借款总额<input name="totalLoan"></input></td>
 	</tr>
    <tr>
      <td>年化利率<input name="annualRate"></input></td>
      <td>借款期数<input name="periods"></input></td>
    </tr>
  	<tr>
      <td>月还款额<input name="monthlyRepayment" ></input></td>
      <td>总还款额<input name="totalRepayment" ></input></td>
  	</tr>
 	 <tr>
      <td>借款标题<input name="title"></input></td>
      <td>借款目的<input name="purpose"></input></td>
 	 </tr>
 	 <tr>
      <td>借款说明<textarea name="illustrate" clos="100" rows="5" warp="virtual"></textarea></td>
 	 </tr>
  </table>
  <input type="submit" value="确认修改"></input>
  
  </form>

</body>
</html>

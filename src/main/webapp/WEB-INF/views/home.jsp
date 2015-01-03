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


  <h1><c:out value = "${abc}" default = "NULL"/></h1>
  <h1><c:out value="${username}" /></h1>
  <h1><c:out value="${data.name}" /></h1>
  <h1><c:out value="${list[1].name}" /></h1>
  
  <h1 align="center">借款统计</h1>
  <table border = "1" width = "100%">
  <c:forEach var="sub" items="${tongji}" >
  <tr> 
       <td width="25%">总借入金额</td> 
       <td width="25%"><c:out value="${sub.zonge}" />元</td> 
       <td width="25%">发布借款笔数</td> 
       <td width="25%"><c:out value="${sub.fabujiekuanbishu}" />笔</td> 
  </tr>
  </c:forEach>
  
  <h1 > </h1>
  <tr> 
       <td width="25%">总借入金额</td> 
       <td width="25%"><c:out value="${tongji[0].zonge}" />元</td> 
       <td width="25%">发布借款笔数</td> 
       <td width="25%"><c:out value="${tongji[0].fabujiekuanbishu}" />笔</td> 
  </tr>
  <tr> 
       <td>已还本息</td> 
       <td><c:out value="${tongji[0].yihuanbenxi}" />元</td> 
       <td>成功借款笔数</td> 
       <td><c:out value="${tongji[0].chenggongjiekuanbishu}" />笔</td> 
  </tr>
  <tr> 
       <td>待还本息</td> 
       <td><c:out value="${tongji[0].daihuanbenxi}" />元</td> 
       <td>正常还清期数</td> 
       <td><c:out value="${tongji[0].zhengchanghuanqingqishu}" />期</td> 
  </tr> 
  <tr> 
       <td>待还期数</td> 
       <td><c:out value="${tongji[0].daihuanqishu}" />期</td> 
       <td>平均利率</td> 
       <td><c:out value="${tongji[0].pingjunlilv}" />%</td> 
  </tr> 
  <tr style="display:none;"> 
       <td>借款奖励支出</td> 
       <td><c:out value="${tongji[0].yihuanbenxi}" />元</td> 
       <td></td> 
       <td></td> 
  </tr>
  </table>
  
</body>
</html>

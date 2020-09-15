<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">
	a{
		text-decoration: none;
	}
</style>
</head>
<body>
	<div
		style="background-color: black; color: white; font-size: 18px; padding: 10px;">
		欢迎您登录：【 ${vip.realName}】 | <a href="exit.do">安全退出</a>
	</div>
	<div style="display: flex;">
		<div style="flex: 1;"><jsp:include page="menus.jsp"></jsp:include></div>
		<div style="flex: 4;">
			<form action="mainPage.do" method="post">
				商品类别: <select name="goodsTypeId">
					<option value="">请选择</option>
					<c:forEach items="${typeList}" var="t">
						<option value="${t.typeId}">${t.typeName}</option>
					</c:forEach>
				</select> 商品标题:<input type="text" name="goodsTitle" /> 价格区间:<input
					type="text" name="minPrice" placeholder="￥" />-<input type="text"
					name="maxPrice" placeholder="￥" /><br /> 生产区间:<input type="date"
					name="minDate" />-<input type="date" name="maxDate" /> <input
					type="submit" value="查询" />
			</form>
			<table>
				<tr>
					<th>编号</th>
					<th>标题</th>
					<th>价格</th>
					<th>产地</th>
					<th>生产日期</th>
					<th>所属类别</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${list}" var="g" varStatus="id">
					<tr>
						<td>${id.index+1}</td>
						<td>${g.goodsTitle}</td>
						<td>${g.goodsPrice}</td>
						<td>${g.goodsAddr}</td>
						<td>${g.goodsDate}</td>
						<td>${g.createType.typeName}</td>
						<td><a href="delGoods.do?goodsId=${g.goodsId}" onclick="return confirm('确定删除该记录?')">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>
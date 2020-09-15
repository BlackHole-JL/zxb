<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div
		style="background-color: black; color: white; font-size: 18px; padding: 10px;">
		欢迎您登录：【 ${vip.realName}】 | <a href="exit.do">安全退出</a>
	</div>
	<div style="display: flex;">
		<div style="flex: 1;"><jsp:include page="menus.jsp"></jsp:include></div>
		<div style="flex: 4;">
			<form action="addSubmit.do" method="post">
				标题:<input type="text" name="goodsTitle" /><br /> 价格:<input
					type="number" name="goodsPrice" /><br /> 产地:<input type="text"
					name="goodsAddr" /><br /> 生产日期:<input type="date"
					name="goodsDate" /><br /> 所属类别:<select name="goodsTypeId">
					<c:forEach items="${typeList}" var="t">
						<option value="${t.typeId}">${t.typeName}</option>
					</c:forEach>
				</select><br /> <input type="submit" value="添加" /> <input type="reset"
					value="重置" />
			</form>
		</div>
	</div>
</body>
</html>
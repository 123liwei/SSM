<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.11.1-min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>SSM整合</h1>
		<img alt="lll" src="${pageContext.request.contextPath}/images/ssm.jpg">
		<table>
			<tr>
				<td><a href="${pageContext.request.contextPath}/jump/to.do?target=addStudent">注册学生</a></td>
				<td><a href="${pageContext.request.contextPath}/jump/to.do?target=findStudent">显示列表</a></td>
			</tr>
		</table>
	</div>
</body>
</html>
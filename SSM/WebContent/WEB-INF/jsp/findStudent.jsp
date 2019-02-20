<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.1-min.js"></script>
<script type="text/javascript">
	$(function(){
		studentPage();
	})
	function studentPage(){
		$.ajax({
				
			url:"${pageContext.request.contextPath}/student/findStudent.do",
			type:"post",
			success:function(resp){
				$("#tbl_student").html("");
				$.each(resp,function(i,n){
					$("#tbl_student").append("<tr>")
					.append("<td>"+n.id+"</td>")
					.append("<td>"+n.name+"</td>")
					.append("<td>"+n.age+"</td>")
					.append("</tr>")
				})
			},
			error:function(){
				alert("请求失败");
			}
		})

	}
</script>
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<p>浏览学生</p>
		<table>
			<thead>
				<tr>
					<td>id</td>
					<td>姓名</td>
					<td>年龄</td>			
				</tr>
			</thead>
			<tbody id="tbl_student">
				
			</tbody>
		</table>
	</div>
</body>
</html>
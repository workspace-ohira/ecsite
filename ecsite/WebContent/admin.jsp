<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>admin画面</title>
</head>
<body>
	<div id="main">

		<div id="top">
			<p>管理者画面</p>
		</div>

		<div id="text-center">

			商品<br>
			<s:form action="ItemCreateAction">
				<s:submit value="新規登録"/>
			</s:form>

			<s:form action="ItemListAction">
				<s:submit value="商品一覧"/>
			</s:form>

			ユーザー<br>
			<s:form action="UserCreateAction">
				<s:submit value="新規登録"/>
			</s:form>

			<s:form action="UserListAction">
				<s:submit value="ユーザー一覧"/>
			</s:form>

		</div>

	</div>

</body>
</html>
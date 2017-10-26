<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 调试标签 -->
<s:debug></s:debug>

<s:radio name="sex" list="{'男','女'}"></s:radio>
<s:select list="{'宝钗','黛玉','晴雯'}"></s:select>

<s:select list="#{'1':'南昌','2':'武汉','3':'长沙'}"></s:select>
</body>
</html>
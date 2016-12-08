
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false" %>
 <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="web/src/main/webapp/resourse/css/home.css" rel="stylesheet">
<link href="web/src/main/webapp/resourse/css/bootstrap.min.css" rel="stylesheet">

<title>Insert title here</title>
</head>
<body>

<header>
	    	<tiles:insertAttribute name="header" />
	    </header>

    <tiles:insertAttribute name="body" />
    <footer>
    	<tiles:insertAttribute name="footer" />
    </footer>
    <script src="<c:url value="/resource/js/jquery-3.1.1.min.js"/>"></script>
    <script src="<c:url value="/resource/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/resource/js/home/home.js"/>" type="text/javascript"></script>  
 	
</body>
</html>
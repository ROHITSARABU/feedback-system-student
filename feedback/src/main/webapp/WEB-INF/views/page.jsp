<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Feedback System -${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>
<body>


	<div class="wrapper">


		<!-- navigation bar -->

		<%@include file="./shared/navbar.jsp"%>



		<div class="content">
			<!-- page content -->
			<c:if test="${userClickHome ==true}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- load only when user click admin -->
			<c:if test="${userClickAdmin ==true}">
				<%@include file="admin.jsp"%>
			</c:if>

			<!-- load only when user click student -->
			<c:if test="${userClickStudent ==true}">
				<%@include file="student.jsp"%>
			</c:if>

			<!-- load only when user click faculty -->
			<c:if test="${userClickFaculty ==true}">
				<%@include file="faculty.jsp"%>
			</c:if>

			<!-- load only when user click contact -->
			<c:if test="${userClickContact ==true}">
				<%@include file="contact.jsp"%>
			</c:if>

			<!-- load only when user click about -->
			<c:if test="${userClickAbout ==true}">
				<%@include file="about.jsp"%>
			</c:if>


			<!-- load only when user click about -->
			<c:if
				test="${userClickAllProducts == true or userClickCategoryProducts == true}">
				<%@include file="adminarea.jsp"%>
			</c:if>
		</div>

		<!-- footer -->

		<%@include file="./shared/footer.jsp"%>



		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.min.js"></script>


		<!-- self coded javascript -->
		<script src="${js}/myapp.js"></script>


	</div>
</body>
</html>
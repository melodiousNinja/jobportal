<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

	<p><b>Matching Job Results:</b><p>

	<ol>
		<c:forEach var="advert" items="${matchingJobAdverts}">
		
			<li>${advert}</li>
			
		</c:forEach>
	</ol>


</body>
</html>

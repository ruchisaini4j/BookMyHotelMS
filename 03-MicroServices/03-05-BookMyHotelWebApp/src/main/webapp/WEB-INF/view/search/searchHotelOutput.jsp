<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Search Hotels</title>
<c:url value="/css/common.css" var="commonCss"/>
<link rel="stylesheet" href="${commonCss}">
</head>
<body>
<br/>
<h2 class="b-shadow">Hotels based on search criteria!!!!! </h2>
<br/>

<br/>
<c:choose>
<c:when test="${not empty hotelNamesList}">
<h2>Hotels that match your criteria are shown below </h2>

		<ul>
			<c:forEach var="hotelNameValue" items="${hotelNamesList}" varStatus="loop">
			
			
				<li><a href="/hotel/hotelDetails.htm/${hotelIdsList[loop.index]}">${hotelNameValue}</a></li>
			</c:forEach>
		</ul>
 
	</c:when>
	<c:otherwise>
	<h2>No Hotels  match your search criteria</h2>
	</c:otherwise>
</c:choose>

<br/>
<br/>


 <%@include file="../footer.jsp" %>

</body>
</html>
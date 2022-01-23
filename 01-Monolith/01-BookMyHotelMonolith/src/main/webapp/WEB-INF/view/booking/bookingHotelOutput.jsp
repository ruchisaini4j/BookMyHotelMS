<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Booking Confirmation</title>


</head>
<body>
<br/>
<h2 class="b-shadow">Booking Confirmation!!!!!</h2>
<br/>
<br/>
 <c:if test="${not empty status}">

		<ul>
			
				<li>${status}</li>
			
		</ul>

	</c:if> 
<br/>
<br/>



 <%@include file="../footer.jsp" %>
</body>
</html>
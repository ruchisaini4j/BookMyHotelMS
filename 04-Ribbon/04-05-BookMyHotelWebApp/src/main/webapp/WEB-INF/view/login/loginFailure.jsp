<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Registration Output</title>
<c:url value="/css/common.css" var="commonCss"/>
<link rel="stylesheet" href="${commonCss}">

</head>
<body>
<br/>
<h2 class="b-shadow">Login Failure!!!!!</h2>
<br/>
<h2>Reason of Login Failure is shown below -</h2>
<br/>
 <c:if test="${not empty status}">

		<ul>
			
				<li>${status}</li>
			
		</ul>

	</c:if> 
<br/>
<br/>



<c:url value="/login.htm" var="myhome"/>
<a href ="${myhome}">Back</a>

</body>
</html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Search Hotels</title>

<c:url value="/css/inputform.css" var="inputform"/>
<link rel="stylesheet" href="${inputform}">
</head>
<body>
<br/>
<h2 class="b-shadow">Welcome to Search Hotels!!!!! </h2>
<br/>
<h2>Specify the search criteria </h2>
<br/>


        
        <form:form action="/search/searchHotelOutput.htm" method="post" modelAttribute="search">
            <form:label path="city">City:</form:label>
            <form:input path="city" required="true"/><br/>
             
            <form:label path="state">State:</form:label>
            <form:input path="state" required="true"/><br/>
             
            <form:label path="country">Country:</form:label>
            <form:input path="country" required="true"/><br/>      
            
            
     
            <form:button>Search Hotels</form:button>
        </form:form>

<br/>
<br/>


 <%@include file="../footer.jsp" %>

</body>
</html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="topMenu.jsp"/>

<html>
<head>
<title>Login</title>
<c:url value="/css/common.css" var="commonCss"/>
<c:url value="/css/inputform.css" var="inputform"/>
<c:url value="/registration/addCustomer.htm" var="myAddCustomer"/>
<link rel="stylesheet" href="${inputform}">
</head>
<body>
<br/>
<h2 class="b-shadow">Login to BookMyHotel!!!!!</h2>
<br/>
<br/>
 
        
        <form:form action="/login.htm" method="post" modelAttribute="login">
 
             
            <form:label path="RegistrationId">Registration Id:</form:label>
            <form:input path="registrationId"/><br/>
             
            <form:label path="Password" >Password:</form:label>
            <form:input type="password" path="password"/><br/>    
           
            <form:button>Login</form:button>
        </form:form>

<br/>
<br/>
<ul>
  <li><a href="${myAddCustomer}">Dont Have an Account? Register!! </a></li>
  <li><br/><li/>
</ul>


</body>
</html>
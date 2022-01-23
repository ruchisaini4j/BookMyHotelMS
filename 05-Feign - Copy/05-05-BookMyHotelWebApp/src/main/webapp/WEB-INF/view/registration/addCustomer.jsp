<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../topMenu.jsp"/>

<html>
<head>
<title>Register Customer</title>
<c:url value="/css/common.css" var="commonCss"/>
<c:url value="/css/inputform.css" var="inputform"/>
<link rel="stylesheet" href="${inputform}">
</head>
<body>
<br/>
<h2 class="b-shadow">Register Customer!!!!!</h2>
<br/>
<h2>Add your details to get registered -</h2>
<br/>
<c:url value="/registration/addCustomer.htm" var="myAddCustomer"/>

        
        <form:form action="/registration/addCustomer.htm" method="post" modelAttribute="registration">
 
           
             
            <form:label path="CustomerName">Customer Name:</form:label>
            <form:input path="customerName"/><br/>
             
            <form:label path="Title">Title:</form:label>
            <form:input path="title"/><br/>    
            
            <form:label path="Address">Address:</form:label>
            <form:input path="address"/><br/>       
            
            <form:label path="CreditCardNumber">Credit Card Number:</form:label>
            <form:input path="creditCardNumber"/><br/>  
            
            <form:label path="">Password:</form:label>
            <form:input path="password"/><br/>     
     
            <form:button>Register</form:button>
        </form:form>

<br/>
<br/>




<c:url value="/login.htm" var="myhome"/>
<a href ="${myhome}">Back</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>




<h1>Welcome to SpringBoot mvc</h1>


<f:form action="register" method="get" modelAttribute="student">



Enter Roll : <f:input path="roll"/> <f:errors path="roll"/> <br><br>

Enter Name : <f:input path="name"/> <f:errors path="name"/><br><br>

Enter Marks : <f:input path="marks"/> <f:errors path=""/><br><br>


<input type="submit" value="Register">



</f:form>













<<%-- form action="register" method="get">


Enter Roll :<input type="text" name="roll"><br><br>
Enter Name :<input type="text" name="name"><br><br>
Enter Marks :<input type="text" name="marks"><br><br>

<input type="submit" value="Register">

</form> --%>



<br><br>


</body>
</html>
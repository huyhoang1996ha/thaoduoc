<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The GUEST Details</h3>
        <form:form method="POST" action="addUser" modelAttribute="User">
             <table>
                <tr>
                    <td><form:label path="userName">userName</form:label></td>
                    <td><form:input path="userName"/></td>
                </tr>
                <tr>
                    <td><form:label path="passWord">pass</form:label></td>
                    <td><form:input path="passWord"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
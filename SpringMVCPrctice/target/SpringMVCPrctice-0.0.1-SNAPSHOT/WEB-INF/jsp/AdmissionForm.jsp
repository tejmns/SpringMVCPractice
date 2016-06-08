<%--
  Created by IntelliJ IDEA.
  User: MNS
  Date: 6/7/2016
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AdmissionForm</title>
    <h2>${msg}</h2>
</head>
<body>
<form action="/submitAdmissionForm.html" method="post">

    <p>
        Student's Name: <input type="text" name="studentName"/>
    </p>
    <p>
        Student's Hobby: <input type="text" name="StudentHobby"/>
    </p>

    <input type="submit" value="Submit Form">
</form>
</body>
</html>

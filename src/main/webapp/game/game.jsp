
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Challenge Accepted</title>
</head>
<body>
<%
    if(request.getParameter("NameValue") != null){
        session.setAttribute("NameValue", request.getParameter("NameValue"));
    }
%>
<h2>¡<%= request.getParameter("NameValue")%>, haz aceptado el reto!</h2>
<h2>¿Subiras al puente de mando?</h2>
<form  action="/start" method="post">
    <input type="radio" name="challengeAccepted" value="false"><label>No</label>
    <input type="radio" name="challengeAccepted" value="true"><label>Si</label>
    <br>
    <button type="submit">He tomado una decisión</button>
</form>
</body>
</html>

<%@ page import="codegym.module3.models.Question" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.logging.Logger" %>
<%@ page import="org.slf4j.LoggerFactory" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Challenge Accepted</title>
</head>
<body>
<%

    if(request.getParameter("NameValue") != null){
        session.setAttribute("NameValue", request.getParameter("NameValue"));
    }

    Question question = (Question) request.getAttribute("nextQuestion");

    if (question == null){
%>
<h2>¡<%= request.getParameter("NameValue")%>, haz perdido la memoria</h2>
<h2>¿Aceptas el reto?</h2>
<form  action="../start-game" method="post">
    <input type="radio" name="ChallengeDecision" value="Rechazar el reto"><label>No</label>
    <input type="radio" name="ChallengeDecision" value="Aceptar el reto"><label>Si</label>
    <br>
    <button type="submit">He tomado una decisión</button>
</form>
    <%
        } else if (question.getAnswers() != null){ %>
    <h2><%= question.getLabel()%></h2>
    <h2><%= question.getQuest()%></h2>
<form  action="start-game" method="post">
<%
    Map<String, String> answer = question.getAnswers();
    for (Map.Entry<String, String> answers : answer.entrySet()){
%>
        <input type="radio" name="ChallengeDecision" value="<%=answers.getValue()%>"><label><%=answers.getValue()%></label>
        <br>
    <%}%>
        <button type="submit">He tomado una decisión</button>
    </form>
    <%
    } else { %>
<h2><%= question.getLabel()%></h2>
<h2><%= question.getQuest()%></h2>

<% request.removeAttribute("nextQuestion");%>
<form action="index.jsp">
    <input type="submit" value="Intentarlo de nuevo" />
</form>
        <%
    }
        %>
</body>
</html>

<html>
<head>
    <title>Questions Game</title>
</head>
<body>
<%@ page contentType="text/html; charset=UTF-8" %>
<h2>Introducción</h2>
<p>Estas jugando en un futuro distante - año 3018</p>
<h2>Conoce a la tripulación</h2>
<p>Mi nombre es John Squirrels, Capitan del Galactic Rush</p>
<p>Mi nombre es Eleanor Carrey, pero me puedes llamar Ellie. Soy la navegante de la Galactic Rush</p>

<form action="game/game.jsp" method="post">
    <label for="NameValue">Ingresa tu nombre</label>
    <br>
    <input id="NameValue" type="text" name="NameValue">
    <br><br>
    <button type="submit">Ingresar a la nave</button>
</form>
</body>
</html>
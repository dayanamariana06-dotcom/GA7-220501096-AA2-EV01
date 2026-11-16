
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TuPastelWeb - Inicio</title>
    <style>
        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: #fff5f7;
            color: #4b3038;
            text-align: center;
        }

        header {
            background: #d86b91;
            color: white;
            padding: 25px;
        }

        main {
            padding: 50px 20px;
        }

        .boton {
            display: inline-block;
            background: #d86b91;
            color: white;
            padding: 13px 25px;
            margin: 10px;
            border-radius: 8px;
            text-decoration: none;
        }

        .boton:hover {
            background: #b84c73;
        }
    </style>
</head>
<body>

    <header>
        <h1>TuPastelWeb</h1>
        <p>Endulzamos tus momentos especiales</p>
    </header>

    <main>
        <h2>¡Bienvenido a nuestra pastelería!</h2>
        <p>Registra tu cuenta o inicia sesión para descubrir nuestros deliciosos pasteles.</p>

        <a class="boton" href="registro.jsp">Registrarme</a>
        <a class="boton" href="login.jsp">Iniciar sesión</a>
    </main>

</body>
</html>

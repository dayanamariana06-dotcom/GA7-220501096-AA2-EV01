
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Iniciar sesión - TuPastelWeb</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #fff5f7;
            margin: 0;
            padding: 30px;
            color: #4b3038;
        }

        .contenedor {
            background: white;
            max-width: 420px;
            margin: auto;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 4px 15px #e8cbd5;
        }

        h1 {
            color: #d86b91;
            text-align: center;
        }

        label {
            display: block;
            margin-top: 15px;
        }

        input {
            width: 100%;
            padding: 11px;
            margin-top: 6px;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-radius: 6px;
        }

        button {
            width: 100%;
            margin-top: 22px;
            padding: 12px;
            background: #d86b91;
            color: white;
            border: none;
            border-radius: 7px;
            cursor: pointer;
        }
    </style>
</head>

<body>

<div class="contenedor">
    <h1>Iniciar sesión</h1>

    <form action="login" method="post">

        <label>Correo electrónico:</label>
        <input type="email" name="correo" required>

        <label>Contraseña:</label>
        <input type="password" name="contrasena" required>

        <button type="submit">Ingresar</button>

    </form>

    <p style="text-align:center;">
        ¿No tienes cuenta? <a href="registro.jsp">Regístrate aquí</a>
    </p>
</div>

</body>
</html>

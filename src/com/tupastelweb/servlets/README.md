# TuPastelWeb - Módulo de conexión y gestión de usuarios

## Descripción
Este proyecto corresponde al desarrollo de un módulo de software para el registro, consulta, actualización y eliminación de usuarios mediante Java y MySQL.

## Tecnologías utilizadas
- Java
- MySQL
- JDBC
- MySQL Connector/J
- Java Servlets
- JSP
- Visual Studio Code

## Base de datos
Nombre: tupastelweb_java

Tabla: usuarios

Campos:
- id
- nombre
- correo
- contrasena

## Operaciones CRUD
- Insertar usuarios.
- Consultar usuarios registrados.
- Actualizar información de usuarios.
- Eliminar usuarios.

## Conexión a la base de datos
La conexión se realiza mediante JDBC utilizando DriverManager y MySQL Connector/J.

## Archivos principales
- Conexion.java
- UsuarioDAO.java
- PruebaConexion.java
- PruebaCRUD.java
- LoginServlet.java
- RegistroServlet.java

## Pruebas
Se realizaron pruebas de conexión a MySQL y de las operaciones CRUD mediante la clase PruebaCRUD.
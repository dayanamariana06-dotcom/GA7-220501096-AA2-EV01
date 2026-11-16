package com.tupastelweb.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL =
        "jdbc:mysql://localhost:3306/tupastelweb_java";

    private static final String USUARIO = "root";
    private static final String CLAVE = "tuclavesegura";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection(
                URL, USUARIO, CLAVE
            );

            System.out.println("Conexión exitosa a MySQL.");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }

        return conexion;
    }
}
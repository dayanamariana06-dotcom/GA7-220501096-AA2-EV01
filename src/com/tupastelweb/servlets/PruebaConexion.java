package com.tupastelweb.servlets;

import java.sql.Connection;

public class PruebaConexion {
    public static void main(String[] args) {
        Connection conexion = Conexion.conectar();

        if (conexion != null) {
            System.out.println("¡Prueba JDBC exitosa!");
        } else {
            System.out.println("No se pudo conectar.");
        }
    }
}
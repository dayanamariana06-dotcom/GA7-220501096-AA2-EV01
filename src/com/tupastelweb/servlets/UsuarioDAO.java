package com.tupastelweb.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    // Registrar un usuario
    public boolean insertar(String nombre, String correo, String contrasena) {
        String sql = "INSERT INTO usuarios (nombre, correo, contrasena) VALUES (?, ?, ?)";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement consulta = conexion.prepareStatement(sql)) {

            consulta.setString(1, nombre);
            consulta.setString(2, correo);
            consulta.setString(3, contrasena);

            return consulta.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al registrar: " + e.getMessage());
            return false;
        }
    }

    // Consultar usuarios
    public void consultar() {
        String sql = "SELECT * FROM usuarios";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement consulta = conexion.prepareStatement(sql);
             ResultSet resultado = consulta.executeQuery()) {

            while (resultado.next()) {
                System.out.println(
                    resultado.getInt("id") + " - " +
                    resultado.getString("nombre") + " - " +
                    resultado.getString("correo")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar: " + e.getMessage());
        }
    }

    // Actualizar usuario
    public boolean actualizar(int id, String nombre, String correo) {
        String sql = "UPDATE usuarios SET nombre = ?, correo = ? WHERE id = ?";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement consulta = conexion.prepareStatement(sql)) {

            consulta.setString(1, nombre);
            consulta.setString(2, correo);
            consulta.setInt(3, id);

            return consulta.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
            return false;
        }
    }

    // Eliminar usuario
    public boolean eliminar(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement consulta = conexion.prepareStatement(sql)) {

            consulta.setInt(1, id);

            return consulta.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
            return false;
        }
    }
    // Validar inicio de sesión
public boolean validar(String correo, String contrasena) {

    String sql = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?";

    try (Connection conexion = Conexion.conectar();
         PreparedStatement consulta = conexion.prepareStatement(sql)) {

        consulta.setString(1, correo);
        consulta.setString(2, contrasena);

        try (ResultSet resultado = consulta.executeQuery()) {
            return resultado.next();
        }

    } catch (SQLException e) {
        System.out.println("Error al validar usuario: " + e.getMessage());
        return false;
    }
}
 // Consultar el ID de un usuario por su correo
    public int consultarIdPorCorreo(String correo) {
        String sql = "SELECT id FROM usuarios WHERE correo = ?";

        try (Connection conexion = Conexion.conectar();
             PreparedStatement consulta = conexion.prepareStatement(sql)) {

            consulta.setString(1, correo);

            try (ResultSet resultado = consulta.executeQuery()) {
                if (resultado.next()) {
                    return resultado.getInt("id");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar ID: " + e.getMessage());
        }

        return -1;
    }
}
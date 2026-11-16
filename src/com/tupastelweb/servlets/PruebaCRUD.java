package com.tupastelweb.servlets;

public class PruebaCRUD {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Registrar un usuario de prueba
        boolean registrado = usuarioDAO.insertar(
            "Usuario Prueba",
            "prueba.crud@gmail.com",
            "Temporal123"
        );

        System.out.println("Registro: " + registrado);

        // Consultar usuarios
        System.out.println("Lista de usuarios:");
        usuarioDAO.consultar();

        // Actualizar usuario
        boolean actualizado = usuarioDAO.actualizar(
            9,
            "Usuario Actualizado",
            "prueba.crud@gmail.com"
        );

        System.out.println("Actualización: " + actualizado);

        // Consultar nuevamente
        usuarioDAO.consultar();

        // Eliminar usuario de prueba
        boolean eliminado = usuarioDAO.eliminar(9);

        System.out.println("Eliminación: " + eliminado);

        // Consultar nuevamente
        usuarioDAO.consultar();
    }
}
package com.tupastelweb.servlets;

public class PruebaCRUD {

    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        String correoPrueba = "prueba.crud@gmail.com";

        // 1. Insertar usuario
        boolean registrado = usuarioDAO.insertar(
            "Usuario Prueba",
            correoPrueba,
            "Temporal123"
        );

        System.out.println("REGISTRO: " + registrado);

        // 2. Consultar usuarios
        System.out.println("CONSULTA DE USUARIOS:");
        usuarioDAO.consultar();

        // 3. Buscar el ID del usuario de prueba
        int idUsuario = usuarioDAO.consultarIdPorCorreo(correoPrueba);

        System.out.println("ID DEL USUARIO: " + idUsuario);

        // 4. Actualizar usuario
        if (idUsuario != -1) {

            boolean actualizado = usuarioDAO.actualizar(
                idUsuario,
                "Usuario Actualizado",
                correoPrueba
            );

            System.out.println("ACTUALIZACION: " + actualizado);

            // 5. Consultar después de actualizar
            usuarioDAO.consultar();

            // 6. Eliminar usuario de prueba
            boolean eliminado = usuarioDAO.eliminar(idUsuario);

            System.out.println("ELIMINACION: " + eliminado);

            // 7. Consultar después de eliminar
            usuarioDAO.consultar();

        } else {
            System.out.println("No se encontro el usuario de prueba.");
        }
    }
}
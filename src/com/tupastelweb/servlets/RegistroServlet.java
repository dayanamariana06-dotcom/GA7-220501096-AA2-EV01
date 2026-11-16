package com.tupastelweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("registro.jsp")
               .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");
        if (contrasena == null || contrasena.length() < 6) {
    response.sendError(400, "La contraseña debe tener al menos 6 caracteres.");
    return;
}

        try (PrintWriter out = response.getWriter()) {

            out.println("<html><body>");
            out.println("<h1>Registro recibido correctamente</h1>");
            out.println("<p>Bienvenido/a: " + 
                        escapeHtml(nombre) + "</p>");
            out.println("<p>Correo: " + 
                        escapeHtml(correo) + "</p>");
            out.println("<a href='login.jsp'>Iniciar sesión</a>");
            out.println("</body></html>");
        }
    }

    private String escapeHtml(String texto) {
        if (texto == null) {
            return "";
        }

        return texto.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&#39;");
    }
}

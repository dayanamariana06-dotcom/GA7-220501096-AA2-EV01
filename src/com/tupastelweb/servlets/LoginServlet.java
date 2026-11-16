
package com.tupastelweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("login.jsp")
               .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");

        try (PrintWriter out = response.getWriter()) {

            out.println("<html><body>");

            if ("cliente@tupastelweb.com".equals(correo)
                    && "123456".equals(contrasena)) {

                out.println("<h1>¡Bienvenido a TuPastelWeb!</h1>");
                out.println("<p>Inicio de sesión exitoso.</p>");

            } else {

                out.println("<h1>Error de autenticación</h1>");
                out.println("<p>El correo o la contraseña son incorrectos.</p>");
                out.println("<a href='login.jsp'>Intentar nuevamente</a>");
            }

            out.println("</body></html>");
        }
    }
}


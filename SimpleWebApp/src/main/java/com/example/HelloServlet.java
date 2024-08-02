package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final Logger logger = LogManager.getLogger(HelloServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        logger.info("Received name: {}", name);
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello, " + name + "!</h1>");
    }
}

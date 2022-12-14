/*
 * Introduction to Jakarta Enterprise Edition - JSP
 * 
 * https://github.com/egalli64/jeep
 */
package com.example.jeep.s02;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * A HTML-generating servlet (not commonly used)
 */
@SuppressWarnings("serial")
@WebServlet("/s02/timer")
public class Timer extends HttpServlet {
    private static final Logger log = LogManager.getLogger(Timer.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.traceEntry();

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        try (PrintWriter writer = response.getWriter()) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta charset=\"utf-8\">");
            writer.println("<link rel=\"icon\" href=\"data:;base64,=\">");
            writer.println("<link rel=\"stylesheet\" href=\"/jeep/css/simple.css\">");
            writer.println("<title>Hello Servlet</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<nav>");
            writer.println("<a href=\"..\\index.html\">Home</a>");
            writer.println("</nav>");
            writer.println("<h1>" + LocalTime.now() + "</h1>");
            writer.println("</body>");
            writer.println("</html>");
        }
    }
}

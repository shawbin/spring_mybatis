package com.doushabao.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * mavenTest
 */
public class HelloWorld extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("<p>hello maven</p>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        doGet(request,response);
    }

}

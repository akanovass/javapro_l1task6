package com.example.javapro_l1t6;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/result")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fullName = request.getParameter("user_name");
        int point = Integer.parseInt(request.getParameter("user_point"));
        char gpa;

        if(point>=90){
            gpa='A';
        }
        else if(point >= 75 && point <= 89){
            gpa='B';
        }
        else if(point >=60 && point <=74){
            gpa='C';
        }
        else if(point >=50 && point <=59){
            gpa='D';
        }
        else{
            gpa='F';
        }
        out.println("<h2>" + fullName +" got \"" + gpa + "\" for exam!</h2>");
    }
}

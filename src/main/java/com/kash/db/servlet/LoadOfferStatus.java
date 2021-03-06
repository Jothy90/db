package com.kash.db.servlet;

import com.kash.db.repository.DataLayer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class LoadOfferStatus extends HttpServlet {
    public void init(ServletConfig config)
            throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(true);
            session.setAttribute("data", DataLayer.getAll());
            RequestDispatcher dispatcher = request.getRequestDispatcher("db.jsp");
            dispatcher.forward(request, response);
    }
}
   

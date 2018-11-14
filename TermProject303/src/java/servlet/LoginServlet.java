/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;
import model.Account;
import model.controller.AccountJpaController;

/**
 *
 * @author Pongsakorn
 */
public class LoginServlet extends HttpServlet {

    @PersistenceUnit(unitName = "TestProjectPU")
    EntityManagerFactory emf;
    @Resource
    UserTransaction utx;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
            String emailStr = request.getParameter("email");
            String passwordStr = request.getParameter("password");
            if (emailStr != null && passwordStr != null && emailStr.trim().length() > 0 && passwordStr.trim().length() > 0) {
                int email = Integer.parseInt(emailStr);
                int password = Integer.parseInt(passwordStr);
                AccountJpaController accCtrl = new AccountJpaController(utx, emf);
                Account acc = accCtrl.findAccount(email);
                if (password == acc.getPin()) {
                    HttpSession session = request.getSession();
                    request.setAttribute("acc", acc);
                    getServletContext().getRequestDispatcher("/AllProduct.jsp").forward(request, response);
                    return;
                }
            }
        } catch (NullPointerException ne) {
            request.setAttribute("wrong", "Something wrong");
            getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
            return;
        }
        getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import model.controllor.AccountJpaController;


/**
 *
 * @author INT303
 */
public class RegisterServlet extends HttpServlet {

    @PersistenceUnit(unitName = "HopperShopPU")
    EntityManagerFactory emf;
    @Resource
    UserTransaction utx;
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
       String email = request.getParameter("email");
       String password = request.getParameter("accountPassword");
       String name = request.getParameter("accountName");
       String telNo = request.getParameter("telNo");
       String address = request.getParameter("address");
       String province = request.getParameter("province");
       String postalCode = request.getParameter("postalCode");
        
        if (email!=null&&password!=null&&name!=null&&telNo!=null&&address!=null&&province!=null&&postalCode!=null&&email.trim().length()>0
                &&password.trim().length()>0&&name.trim().length()>0&&telNo.trim().length()>0&&address.trim().length()>0&&province.trim().length()>0&&postalCode.trim().length()>0) {
            HttpSession session = request.getSession(false);
            if (session != null) {
                getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
                return;
            }
            password = cryptWithMD5(password);
            Account acc = new  Account(email,password,name,telNo,address,province,postalCode);
            AccountJpaController accCtrl = new AccountJpaController(utx, emf);
            accCtrl.create(acc);
            getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
            return;
         
        }
        getServletContext().getRequestDispatcher("/Register.jsp").forward(request, response);
    }

        public static String cryptWithMD5(String pass) throws NoSuchAlgorithmException{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] passBytes = pass.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < digested.length; i++) {
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            return sb.toString();    
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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

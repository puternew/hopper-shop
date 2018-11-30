/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;
import model.Product;
import model.controllor.ProductJpaController;

/**
 *
 * @author PANUPONG INTHILAD
 */
public class SearchProductServlet extends HttpServlet {
    @PersistenceUnit (unitName = "HopperShopPU")
    EntityManagerFactory emf;
    @Resource
    UserTransaction utx; 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
        String search = request.getParameter("search").toUpperCase();
        String[] brand = {"ADIDAS", "CONVERSE", "NIKE", "VANS"};
        String[] color = {"BLACK", "BLUE", "GRAY", "WHITE", "YELLOW", "GREEN", "RED", "BLACK-RED", "ZEBRA", "PINK", "ORANGE", "HAWAII", "SNAKE", "CREAM", "BLACK2", "RED2", "GOLDEN", "SILVER", "BLUE2", "WHITE-RED", "WHITE-BLUE", "WHITE-BLACK", "WHITE-RED", "BROWN"};
        ProductJpaController productCtrl = new ProductJpaController(utx, emf);
        String check = null;
        List<Product> products = null;

        
        for (String brandInShop : brand) {
            if (search.equals(brandInShop)) {
                check = search;
            }
        }
        if (check != null) {
            //find from brand
            products = productCtrl.findByBrand(search);
        } else {
            for (String colorInShop : color) {
                if (search.equals(colorInShop)) {
                    check = search;
                }
            }
            if (check != null) {
                   products = productCtrl.findByColor(search);
            } else {
                products = productCtrl.findByColor(search);
//                products = productCtrl.findByProductName(check);
            }
        }
        
        request.setAttribute("Product", products);
        getServletContext().getRequestDispatcher("/AllProduct.jsp").forward(request, response);
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

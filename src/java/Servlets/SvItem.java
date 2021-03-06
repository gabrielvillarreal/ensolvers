/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author villa
 */
@WebServlet(name = "SvItem", urlPatterns = {"/SvItem"})
public class SvItem extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //traigo los datos del JSP
        String description = request.getParameter("description");
        boolean chkItem = Boolean.parseBoolean(request.getParameter("chkItem"));
        
        request.getSession().setAttribute("description", description);
        request.getSession().setAttribute("chkItem", chkItem);
        
        Controladora control = new Controladora();
        control.crearItem(description,chkItem);
        request.getSession().setAttribute("listaItems", control.traerItems());
        
        response.sendRedirect("verItems.jsp");
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

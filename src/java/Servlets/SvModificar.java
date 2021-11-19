/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import Logica.Items;
import java.io.IOException;
import java.io.PrintWriter;
import static java.util.Objects.isNull;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author villa
 */
@WebServlet(name = "SvModificar", urlPatterns = {"/SvModificar"})
public class SvModificar extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        String desc = request.getParameter("description");
        String chkItem = request.getParameter("chkItem");
        boolean finished;
        if(isNull(chkItem)) {
            finished = false;
        } else {
            finished = true;
        }
        
        Controladora control = new Controladora();
        Items item = control.buscarItems(id);
        item.setDescription(desc);
        item.setItemFinish(finished);
        
        control.modificarItem(item);
        
        request.getSession().setAttribute("listaItems", control.traerItems());
        response.sendRedirect("verItems.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        
        Controladora control = new Controladora();
        Items item = control.buscarItems(id);
        
        HttpSession misession = request.getSession();
        misession.setAttribute("item", item);
        response.sendRedirect("ModificarItem.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

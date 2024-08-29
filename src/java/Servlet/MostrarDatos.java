/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "MostrarDatos", urlPatterns = {"/MostrarDatos"})
public class MostrarDatos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String idProducto = request.getParameter("idProducto");
            String cantidad = request.getParameter("cantidad");
            String categoriaID = request.getParameter("categoriaID");
            String nombreProducto = request.getParameter("nombreProducto");
            String descripcion = request.getParameter("descripcion");
            String nombreProveedor = request.getParameter("nombreProveedor");
            String precioCompra = request.getParameter("precioCompra");
            String precioVenta = request.getParameter("precioVenta");
            
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Datos del Producto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Detalles del Producto</h1>");
            out.println("<h3>ID Producto: " + idProducto + "</h3>");
            out.println("<h3>Cantidad: " + cantidad + "</h3>");
            out.println("<h3>Categoría: " + categoriaID + "</h3>");
            out.println("<h3>Nombre del Producto: " + nombreProducto + "</h3>");
            out.println("<h3>Descripción: " + descripcion + "</h3>");
            out.println("<h3>Nombre del Proveedor: " + nombreProveedor + "</h3>");
            out.println("<h3>Precio Unidad Compra: " + precioCompra + "</h3>");
            out.println("<h3>Precio Unidad Venta: " + precioVenta + "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
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

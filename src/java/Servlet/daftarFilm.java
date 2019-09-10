/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Alexander Adam
 */
@WebServlet(name = "daftarFilm", urlPatterns = {"/daftarFilm"})
public class daftarFilm extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            String[]film=new String[]{"Gundala","Exit","Ready or Not","Sadako","Angel has Fallen"};
            String no = null;
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title></title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><strong>Rekomendasi Film Bioskop Kesayangan Anda</strong></h1>");
            out.println("<p><strong>Daftar Film yang Sedang diputar Saat Ini</strong></p>");
            out.println("<ol>");
            for (int i = 0; i < film.length; i++) {
                out.println("<li>"+film[i]+"</li>");               
            }
            out.println("</ol>");         
            out.println("<p><strong>Daftar Film yang Akan Diputar Bulan Ini</strong></p>");
            out.println("<table border=\"1\">");
            out.println("<tr>");
            out.println("<td><b>No</b></td>");
            out.println("<td><b>Judul Film</b></td>");
            out.println("<td><b>Rating</b></td>");
            out.println("<td><b>Bintang Film</b></td>");
            out.println("<td><b>Tanggal Tayang</b></td>");
            out.println("</tr>");
            out.println("<tr>");  
            out.println("<td>1</td>");
            out.println("<td>IT Chapter Two</td>");
            out.println("<td>9.0</td>");
            out.println("<td>James McAvoy</td>");
            out.println("<td>4 september 2019</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.print("<td>2</td>");
            out.println("<td>Ad Astra</td>");
            out.println("<td>7.0</td>");
            out.println("<td>Brad Pitt</td>");
            out.println("<td>18 september 2019</td>");  
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>3</td>");
            out.println("<td>Maleficent 2</td>");
            out.println("<td>8.9</td>");
            out.println("<td>Angelina Jolie</td>");
            out.println("<td>30 september 2019</td>");                  
            out.println("</tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
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

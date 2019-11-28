/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Banco.Veiculo;
import Banco.VeiculoDAO;
/**
 *
 * @author Matheus
 */
@WebServlet(urlPatterns = {"/CadastroVeiculoServlet"})
public class CadastroVeiculoServlet extends HttpServlet {

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
        String CD_VEICULO = request.getParameter("CD_VEICULO");//int
        String MARCA_VEICULO = request.getParameter("MARCA_VEICULO");
        String MODELO_VEICULO = request.getParameter("MODELO_VEICULO");
        String COR_VEICULO = request.getParameter("COR_VEICULO");
        String PLACA_VEICULO = request.getParameter("PLACA_VEICULO");
        String HODOM_VEICULO = request.getParameter("HODOM_VEICULO");//int
        String ANO_VEICULO = request.getParameter("ANO_VEICULO");//int
        String ANO_MOD_VEICULO = request.getParameter("ANO_MOD_VEICULO");//int
        String TIPO_VEICULO = request.getParameter("TIPO_VEICULO");
        String DISPO_VEICULO = request.getParameter("DISPO_VEICULO");
        String SEGURO_VEICULO = request.getParameter("SEGURO_VEICULO");
        String NUM_APOLICE_VEICULO = request.getParameter("NUM_APOLICE_VEICULO");
        String OBS_VEICULO = request.getParameter("OBS_VEICULO");
        String VEICULO_PROPRIO = request.getParameter("VEICULO_PROPRIO");
        /*Veiculo veiculo = new Veiculo();
        VeiculoDAO dao = new VeiculoDAO();
        
        veiculo.setAno_modelo_veiculo(request.getParameter("ANO_MOD_VEICULO"));
        
        dao.insert(veiculo);*/
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroVeiculoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CadastroVeiculoServlet at " + request.getContextPath() + "</h1>");
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

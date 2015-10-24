/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shivam;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;
/**
 *
 * @author vasu jain
 */


public class saveServer extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     public GoogleResponse convertToLatLong(String fullAddress) throws IOException {

  /*
   * Create an java.net.URL object by passing the request URL in
   * constructor. Here you can see I am converting the fullAddress String
   * in UTF-8 format. You will get Exception if you don't convert your
   * address in UTF-8 format. Perhaps google loves UTF-8 format. :) In
   * parameter we also need to pass "sensor" parameter. sensor (required
   * parameter) — Indicates whether or not the geocoding request comes
   * from a device with a location sensor. This value must be either true
   * or false.
   */
   String URL = "http://maps.googleapis.com/maps/api/geocode/json";
  URL url = new URL(URL + "?address="
    + URLEncoder.encode(fullAddress, "UTF-8") + "&sensor=false");
  // Open the Connection
  URLConnection conn = url.openConnection();

  InputStream in = conn.getInputStream() ;
  ObjectMapper mapper = new ObjectMapper();
  GoogleResponse response = (GoogleResponse)mapper.readValue(in,GoogleResponse.class);
  in.close();
  return response;
  

 }
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String user = request.getParameter("name");
            String pass = request.getParameter("pass");
            String email = request.getParameter("email");
            String phone = request.getParameter("contact");
            String loc = request.getParameter("loc");
            String bg = request.getParameter("bg");
            String lati = null,longi = null;
          GoogleResponse res = convertToLatLong(loc);
  if(res.getStatus().equals("OK"))
  {
   for(Result result : res.getResults())
   {
    System.out.println("Lattitude of address is :"  +result.getGeometry().getLocation().getLat());
    System.out.println("Longitude of address is :" + result.getGeometry().getLocation().getLng());
    System.out.println("Location is " + result.getGeometry().getLocation_type());
     lati = result.getGeometry().getLocation().getLat();
     longi =result.getGeometry().getLocation().getLng();
   }
  }
  else
  {
   System.out.println(res.getStatus());
  }
     
  Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vasu",
            "root", "san");
    
    PreparedStatement pst = con.prepareStatement("insert into signup values(?,?,?,?,?,?,?)");
    pst.setString(1, user);
    pst.setString(2, pass);
    pst.setString(3, email);
    pst.setString(4, phone);
    pst.setString(5, bg);
    pst.setString(6, lati);
    pst.setString(7,longi);
    
   int i=pst.executeUpdate();
	 out.println("<b>You are successfully Registered</b>");
	 con.close();
          
    
    
    
        }
        
        catch(Exception e){
            System.out.println(e);
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

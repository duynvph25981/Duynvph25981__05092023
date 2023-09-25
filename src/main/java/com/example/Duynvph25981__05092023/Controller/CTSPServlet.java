package com.example.Duynvph25981__05092023.Controller;

import com.example.Duynvph25981__05092023.Entity.ChiTietSanPham;
import com.example.Duynvph25981__05092023.Repository.CTSPRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CTSPServlet", value = {
        "/san-pham/hien-thi",
        "/san-pham/add",
        "/san-pham/detail",
        "/san-pham/delete",
})
public class CTSPServlet extends HttpServlet {
    ArrayList<ChiTietSanPham> listSP = new ArrayList<>();
    CTSPRepository ctspr = new CTSPRepository();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String uri = request.getRequestURI();
    if(uri.contains("/san-pham/hien-thi")){
        listSP = ctspr.getAll();
        request.setAttribute("listSP",listSP);
        request.getRequestDispatcher("/SanPham/trangchu.jsp").forward(request,response);
    }else if(uri.contains("/san-pham/detail")){
        ChiTietSanPham spdetail = new ChiTietSanPham();
        String id = request.getParameter("id");
        spdetail= ctspr.getById(id);
        request.setAttribute("spdetail",spdetail);
        request.getRequestDispatcher("/SanPham/detail.jsp").forward(request,response);
    }else if(uri.contains("/san-pham/delete")){
        String id = request.getParameter("id");
        ctspr.delete(new ChiTietSanPham(id));
        response.sendRedirect("/san-pham/hien-thi");
    }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

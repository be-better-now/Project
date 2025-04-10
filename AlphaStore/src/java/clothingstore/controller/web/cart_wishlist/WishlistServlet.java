/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothingstore.controller.web.cart_wishlist;

import clothingstore.utils.WishlistUtil;
import clothingstore.dao.ProductDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import clothingstore.model.ProductDTO;

/**
 *
 * @author huuduy
 */
@WebServlet(name = "WishlistServlet", urlPatterns = {"/WishlistServlet"})
public class WishlistServlet extends HttpServlet {

    private static final String DISPATCHSERVLET = "DispatchServlet";
    private static final String WISHLIST_PAGE = "view/jsp/home/wishlist.jsp";
    private static final String WISHLIST_AJAX = "view/jsp/ajax/wishlist_ajax.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = WISHLIST_AJAX;
        ProductDAO pDao = new ProductDAO();
        WishlistUtil wUtil = new WishlistUtil();
        List<ProductDTO>  wishlists = null;
        HashMap<Integer, ProductDTO> listItem = null;
        try {
            HttpSession session = request.getSession();
            String action = request.getParameter("action");
            if(action == null) {
                url = WISHLIST_PAGE;
            }else {
                String product_id = request.getParameter("product_id");
                ProductDTO product = pDao.getProductByID(Integer.parseInt(product_id));
                if ("Add".equals(action)) {
                    wishlists = (List<ProductDTO>) session.getAttribute("WISHLIST");
                    if (wishlists == null) {
                        listItem = wUtil.createWishlist(product);
                    } else {
                        listItem = wUtil.addItemToWishlist(product);
                    }
                } else if ("Delete".equals(action)) {
                    url = WISHLIST_PAGE;
                    listItem = wUtil.removeItem(product);

                }
            }
            // Save to Cookie
            wishlists = new ArrayList<>(listItem.values());
            session.setAttribute("WISHLIST", wishlists);
            
            String strItemsWishlist = wUtil.convertToString();
            wUtil.saveWishlistToCookie(request, response, strItemsWishlist);
            
        } catch (Exception ex) {
            log("WishlistServlet error:" + ex.getMessage());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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

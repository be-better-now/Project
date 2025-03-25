/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FlowerDAO;
import dao.UserDAO;
import dto.FlowerDTO;
import dto.UserDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tungi
 */
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

    private static final String LOGIN_PAGE = "login.jsp";
    private final FlowerDAO flowerDAO = new FlowerDAO();

    // Kiểm tra đăng nhập
    private boolean isValidLogin(String userID, String password) {
        UserDAO udao = new UserDAO();
        UserDTO user = udao.readById(userID);
        return user != null && user.getPassword().equals(password);
    }

    // Lấy thông tin người dùng
    private UserDTO getUser(String userID) {
        UserDAO udao = new UserDAO();
        return udao.readById(userID);
    }

    // Xử lý đăng nhập
    private String processLogin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = LOGIN_PAGE;
        String userID = request.getParameter("txtUserID");
        String password = request.getParameter("txtPassword");
        if (isValidLogin(userID, password)) {
            UserDTO user = getUser(userID);
            request.getSession().setAttribute("user", user);
            url = "search.jsp"; // Chuyển đến trang chủ
        } else {
            request.setAttribute("message", "Sai UserID hoặc Password");
            url = "login.jsp";
        }
        return url;
    }

    // Xử lý đăng xuất
    private String processLogout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getSession().invalidate();
        return "login.jsp";
    }

    // Xử lý tìm kiếm
    private String processSearch(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "search.jsp";
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            String searchTerm = request.getParameter("searchTerm");
            if (searchTerm == null) {
                searchTerm = "";
            }
            List<FlowerDTO> flowers = flowerDAO.searchByTitle2(searchTerm);
            request.setAttribute("flowers", flowers);
            request.setAttribute("searchTerm", searchTerm);
        } else {
            url = LOGIN_PAGE;
        }
        return url;
    }

    // Xử lý xóa hoa
    private String processDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = LOGIN_PAGE;
        HttpSession session = request.getSession();
        UserDTO user = (UserDTO) session.getAttribute("user");
        if (user != null && "AD".equals(user.getRoleID())) {
            String id = request.getParameter("id");
            flowerDAO.updateQuantityToZero(id);
            url = processSearch(request, response);
        }
        return url;
    }

    // Xử lý thêm hoa
    private String processAdd(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = LOGIN_PAGE;
        HttpSession session = request.getSession();
        UserDTO user = (UserDTO) session.getAttribute("user");
        if (user != null && "AD".equals(user.getRoleID())) {
            try {
                boolean checkError = false;
                String flowerID = request.getParameter("txtFlowerID");
                String flowerName = request.getParameter("txtFlowerName");
                String quality = request.getParameter("txtQuality");
                String category = request.getParameter("txtCategory");
                double price = Double.parseDouble(request.getParameter("txtPrice"));
                int quantity = Integer.parseInt(request.getParameter("txtQuantity"));

                if (flowerID == null || flowerID.trim().isEmpty()) {
                    checkError = true;
                    request.setAttribute("txtFlowerID_error", "Flower ID không được để trống.");
                }
                if (quantity < 0) {
                    checkError = true;
                    request.setAttribute("txtQuantity_error", "Số lượng phải >= 0.");
                }

                FlowerDTO flower = new FlowerDTO(flowerID, flowerName, quality, category, price, quantity);
                if (!checkError) {
                    flowerDAO.create(flower);
                    url = processSearch(request, response);
                } else {
                    request.setAttribute("flower", flower);
                    url = "addFlower.jsp";
                }
            } catch (Exception e) {
                log("Error in processAdd: " + e.toString());
            }
        }
        return url;
    }

    // Xử lý thêm vào giỏ hàng
    private String processAddToCart(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "homepage.jsp";
        String flowerID = request.getParameter("flowerID");
        int quantity = Integer.parseInt(request.getParameter("quantity") != null ? request.getParameter("quantity") : "1");
        FlowerDTO flower = flowerDAO.readById(flowerID);
        if (flower != null && flower.getQuantity() >= quantity) {
            List<FlowerDTO> cart = (List<FlowerDTO>) request.getSession().getAttribute("cart");
            if (cart == null) {
                cart = new ArrayList<>();
            }
            // Kiểm tra xem hoa đã có trong giỏ chưa
            boolean found = false;
            for (FlowerDTO item : cart) {
                if (item.getFlowerID().equals(flowerID)) {
                    item.setQuantity(item.getQuantity() + quantity);
                    found = true;
                    break;
                }
            }
            if (!found) {
                flower.setQuantity(quantity); // Chỉ thêm số lượng yêu cầu
                cart.add(flower);
            }
            request.getSession().setAttribute("cart", cart);
            request.setAttribute("message", "Đã thêm " + flower.getFlowerName() + " vào giỏ hàng!");
        } else {
            request.setAttribute("message", "Không đủ số lượng hoặc sản phẩm không tồn tại.");
        }
        return url;
    }

    // Xử lý trang chủ
    private String processHome(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "homepage.jsp";
        List<FlowerDTO> flowers = flowerDAO.readAll();
        request.setAttribute("flowers", flowers);
        return url;
    }

    // Xử lý xem chi tiết hoa
    private String processViewDetail(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "flowerDetail.jsp";
        String flowerID = request.getParameter("flowerID");
        if (flowerID != null && !flowerID.isEmpty()) {
            FlowerDTO flower = flowerDAO.readById(flowerID);
            if (flower != null) {
                request.setAttribute("flower", flower);
            } else {
                request.setAttribute("message", "Hoa không tồn tại.");
            }
        } else {
            request.setAttribute("message", "Mã hoa không hợp lệ.");
        }
        return url;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String url = LOGIN_PAGE;
        try {
            String action = request.getParameter("action");
            if (action == null) {
                url = processHome(request, response); // Mặc định vào trang chủ
            } else {
                switch (action) {
                    case "login":
                        url = processLogin(request, response);
                        break;
                    case "logout":
                        url = processLogout(request, response);
                        break;
                    case "search":
                        url = processSearch(request, response);
                        break;
                    case "delete":
                        url = processDelete(request, response);
                        break;
                    case "add":
                        url = processAdd(request, response);
                        break;
                    case "addToCart":
                        url = processAddToCart(request, response);
                        break;
                    case "home":
                        url = processHome(request, response);
                        break;
                    case "viewDetail":
                        url = processViewDetail(request, response);
                        break;
                    default:
                        url = processHome(request, response);
                        break;
                }
            }
        } catch (Exception e) {
            log("Error in MainController: " + e.toString());
        } finally {
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Main controller for Desert Rose Shop";
    }
}
<%-- 
    Document   : flowerDetail
    Created on : Mar 24, 2025
    Author     : tungi
--%>
<%@page import="dto.FlowerDTO"%>
<%@page import="dto.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chi tiết Hoa - Desert Rose Shop</title>
    <link rel="stylesheet" href="css/flowerDetail.css">
</head>
<body>
    <jsp:include page="header.jsp"/>
    
    <div class="page-content">
        <%
            String message = (String) request.getAttribute("message");
            if (message != null) {
        %>
            <div class="message-container success">
                <p><%=message%></p>
            </div>
        <% } %>
        
        <!-- Breadcrumb Navigation -->
        <div class="breadcrumb">
            <a href="MainController?action=home">Trang chủ</a> >
            <span>Chi tiết Hoa</span>
        </div>
        
        <%
            FlowerDTO flower = (FlowerDTO) request.getAttribute("flower");
            if (flower == null) {
        %>
            <div class="error-container">
                <h1>Hoa Không Tồn Tại</h1>
                <p>Sản phẩm bạn tìm không tồn tại hoặc đã bị xóa.</p>
                <a href="MainController?action=home" class="back-link">Quay lại Trang chủ</a>
            </div>
        <% } else { %>
            <div class="flower-detail-container">
                <div class="flower-image">
                    <!-- Giả sử chưa có hình ảnh, dùng placeholder -->
                    <div class="no-image">
                        <span>Chưa có hình ảnh</span>
                    </div>
                </div>
                
                <div class="flower-info">
                    <h1><%=flower.getFlowerName()%></h1>
                    
                    <div class="flower-meta">
                        <p class="quality">Chất lượng: <strong><%=flower.getQuality()%></strong></p>
                        <p class="category">Danh mục: <strong><%=flower.getCategory()%></strong></p>
                    </div>
                    
                    <div class="flower-price-block">
                        <span class="price"><%=String.format("%,.0f", flower.getPrice())%> VNĐ</span>
                        <% if (flower.getQuantity() > 0) { %>
                            <span class="stock-info in-stock">Còn hàng</span>
                        <% } else { %>
                            <span class="stock-info out-of-stock">Hết hàng</span>
                        <% } %>
                    </div>
                    
                    <div class="flower-details">
                        <div class="detail-item">
                            <span class="label">Mã Hoa:</span>
                            <span class="value"><%=flower.getFlowerID()%></span>
                        </div>
                        <div class="detail-item">
                            <span class="label">Số lượng:</span>
                            <span class="value"><%=flower.getQuantity()%> bó</span>
                        </div>
                    </div>
                    
                    <% if (flower.getQuantity() > 0) { %>
                        <form action="MainController" method="post" class="cart-form">
                            <input type="hidden" name="action" value="addToCart">
                            <input type="hidden" name="flowerID" value="<%=flower.getFlowerID()%>">
                            
                            <div class="quantity-selector">
                                <label for="quantity">Số lượng:</label>
                                <div class="quantity-control">
                                    <button type="button" class="quantity-btn minus" id="decreaseQty">-</button>
                                    <input type="number" id="quantity" name="quantity" value="1" min="1" max="<%=flower.getQuantity()%>">
                                    <button type="button" class="quantity-btn plus" id="increaseQty">+</button>
                                </div>
                            </div>
                            
                            <div class="action-buttons">
                                <button type="submit" class="btn btn-primary add-to-cart">
                                    <span class="icon">🛒</span> Thêm vào Giỏ
                                </button>
                            </div>
                        </form>
                    <% } else { %>
                        <div class="out-of-stock-message">
                            <p>Sản phẩm này hiện đã hết hàng.</p>
                        </div>
                    <% } %>
                </div>
            </div>
            
            <!-- Thông tin thêm về hoa -->
            <div class="additional-info">
                <div class="info-tabs">
                    <button class="tab-btn active" data-tab="description">Mô tả</button>
                    <button class="tab-btn" data-tab="details">Chi tiết</button>
                </div>
                
                <div class="tab-content">
                    <div class="tab-pane active" id="description">
                        <h2>Mô tả</h2>
                        <p><%=flower.getFlowerName()%> là một sản phẩm <%=flower.getQuality()%> thuộc danh mục <%=flower.getCategory()%>. Phù hợp để tặng trong các dịp đặc biệt.</p>
                    </div>
                    
                    <div class="tab-pane" id="details">
                        <h2>Chi tiết Sản phẩm</h2>
                        <table class="details-table">
                            <tr>
                                <th>Mã Hoa</th>
                                <td><%=flower.getFlowerID()%></td>
                            </tr>
                            <tr>
                                <th>Tên Hoa</th>
                                <td><%=flower.getFlowerName()%></td>
                            </tr>
                            <tr>
                                <th>Chất lượng</th>
                                <td><%=flower.getQuality()%></td>
                            </tr>
                            <tr>
                                <th>Danh mục</th>
                                <td><%=flower.getCategory()%></td>
                            </tr>
                            <tr>
                                <th>Giá</th>
                                <td><%=String.format("%,.0f", flower.getPrice())%> VNĐ</td>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
        <% } %>
    </div>
    
    <jsp:include page="footer.jsp"/>
    
    <!-- Admin controls -->
    <%
        UserDTO user = (UserDTO) session.getAttribute("user");
        if (user != null && "AD".equals(user.getRoleID())) {
    %>
    <div class="admin-bar">
        <div class="admin-bar-container">
            <span class="admin-message">Bạn đang đăng nhập với vai trò Quản trị viên</span>
            <div class="admin-actions">
                <a href="MainController?action=delete&id=<%=flower.getFlowerID()%>" class="admin-btn">Xóa Hoa</a>
            </div>
        </div>
    </div>
    <% } %>
    
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="js/flowerDetail.js"></script>
</body>
</html>
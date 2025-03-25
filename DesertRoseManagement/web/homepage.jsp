<%-- 
    Document   : homepage
    Created on : Mar 24, 2025
    Author     : tungi
--%>
<%@page import="dto.FlowerDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Danh mục Hoa - Desert Rose Shop</title>
    <link rel="stylesheet" href="css/homepage.css">
</head>
<body>
    <jsp:include page="header.jsp"/>
    
    <div class="page-content">
        <div class="catalog-header">
            <h1>Danh mục hoa</h1>
            <div class="search-container">
                <form action="MainController" method="GET">
                    <input type="hidden" name="action" value="home">
                    <%
                        String searchTerm = request.getParameter("searchTerm");
                        if (searchTerm == null) searchTerm = "";
                    %>
                    <input type="text" name="searchTerm" placeholder="Tìm kiếm theo tên hoa..." value="<%=searchTerm%>">
                    <button type="submit" class="search-button">Tìm kiếm</button>
                </form>
            </div>
        </div>
        
        <%
            String message = (String) request.getAttribute("message");
            if (message != null) {
        %>
            <div class="message-container success">
                <p><%=message%></p>
            </div>
        <% } %>
        
        <div class="flowers-container">
            <%
                List<FlowerDTO> flowers = (List<FlowerDTO>) request.getAttribute("flowers");
                if (flowers == null || flowers.isEmpty()) {
            %>
                <div class="no-results">
                    <p>Không tìm thấy hoa nào. Vui lòng thử tìm kiếm khác hoặc quay lại sau.</p>
                </div>
            <% } else { %>
                <div class="flower-grid">
                    <% for (FlowerDTO flower : flowers) { 
                        if (searchTerm.isEmpty() || flower.getFlowerName().toLowerCase().contains(searchTerm.toLowerCase())) {
                    %>
                        <div class="flower-card">
                            <div class="flower-cover">
                                <div class="no-image">
                                    <span>Chưa có hình ảnh</span>
                                </div>
                            </div>
                            <div class="flower-info">
                                <h3 class="flower-title">
                                    <a href="MainController?action=viewDetail&flowerID=<%=flower.getFlowerID()%>">
                                        <%=flower.getFlowerName()%>
                                    </a>
                                </h3>
                                <p class="flower-quality">Chất lượng: <%=flower.getQuality()%></p>
                                <p class="flower-category">Danh mục: <%=flower.getCategory()%></p>
                                <div class="flower-price-container">
                                    <span class="flower-price"><%=String.format("%,.0f", flower.getPrice())%> VNĐ</span>
                                    <% if (flower.getQuantity() > 0) { %>
                                        <span class="stock in-stock"><%=flower.getQuantity()%> bó còn lại</span>
                                    <% } else { %>
                                        <span class="stock out-of-stock">Hết hàng</span>
                                    <% } %>
                                </div>
                                <% if (flower.getQuantity() > 0) { %>
                                    <form action="MainController" method="post" class="add-to-cart-form">
                                        <input type="hidden" name="action" value="addToCart">
                                        <input type="hidden" name="flowerID" value="<%=flower.getFlowerID()%>">
                                        <button type="submit" class="add-to-cart-btn">Thêm vào Giỏ</button>
                                    </form>
                                <% } %>
                            </div>
                        </div>
                    <% } } %>
                </div>
            <% } %>
        </div>
    </div>
    
    <jsp:include page="footer.jsp"/>
</body>
</html>
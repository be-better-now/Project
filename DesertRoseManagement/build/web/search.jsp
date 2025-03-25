<%-- 
    Document   : search
    Created on : Feb 13, 2025, 11:27:20 AM
    Author     : tungi
--%>
<%@page import="dto.FlowerDTO"%>
<%@page import="dto.UserDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tìm kiếm Hoa - Desert Rose Shop</title>
    <link rel="stylesheet" href="css/search.css"> <!-- Tách CSS ra file riêng -->
</head>
<body> 
    <%@include file="header.jsp" %>
    <div style="min-height: 500px; padding: 10px">
        <%
            UserDTO user = (UserDTO) session.getAttribute("user");
            if (user != null) {
        %>
        <h1>Chào mừng <%=user.getFullName()%> đến với trang quản lý</h1>
        <form action="MainController" class="logout-form">
            <input type="hidden" name="action" value="logout"/>
            <input type="submit" value="Đăng xuất" class="logout-btn"/>
        </form>

        <div class="search-section">
            <form action="MainController">
                <input type="hidden" name="action" value="search"/>
                <label for="searchInput">Tìm kiếm Hoa:</label>
                <%
                    String searchTerm = (String) request.getAttribute("searchTerm");
                    if (searchTerm == null) {
                        searchTerm = "";
                    }
                %>
                <input type="text" id="searchInput" name="searchTerm" value="<%=searchTerm%>" class="search-input" placeholder="Nhập tên hoa hoặc mã..."/>
                <input type="submit" value="Tìm kiếm" class="search-btn"/>
            </form>
        </div>

        <% if ("AD".equals(user.getRoleID())) { %>
            <a href="addFlower.jsp" class="add-btn">Thêm Hoa</a>
        <% } %>

        <%
            List<FlowerDTO> flowers = (List<FlowerDTO>) request.getAttribute("flowers");
            if (flowers != null && !flowers.isEmpty()) {
        %>
        <table class="flower-table">
            <thead>
                <tr>
                    <th>Mã Hoa</th>
                    <th>Tên Hoa</th>
                    <th>Chất lượng</th>
                    <th>Danh mục</th>
                    <th>Giá</th>
                    <th>Số lượng</th>
                    <% if ("AD".equals(user.getRoleID())) { %>
                        <th>Hành động</th>
                    <% } %>
                    <th>Thêm vào Giỏ</th>
                </tr>
            </thead>
            <tbody>
                <% for (FlowerDTO f : flowers) { %>
                <tr>
                    <td><a href="MainController?action=viewDetail&flowerID=<%=f.getFlowerID()%>"><%=f.getFlowerID()%></a></td>
                    <td><%=f.getFlowerName()%></td>
                    <td><%=f.getQuality()%></td>
                    <td><%=f.getCategory()%></td>
                    <td><%=String.format("%,.0f", f.getPrice())%> VNĐ</td>
                    <td><%=f.getQuantity()%></td>
                    <% if ("AD".equals(user.getRoleID())) { %>
                    <td>
                        <a href="MainController?action=delete&id=<%=f.getFlowerID()%>&searchTerm=<%=searchTerm%>">
                            <img src="assets/image/trash3.svg" style="height: 25px" alt="Xóa"/>
                        </a>
                    </td>
                    <% } %>
                    <td>
                        <% if (f.getQuantity() > 0) { %>
                        <form action="MainController" method="post">
                            <input type="hidden" name="action" value="addToCart"/>
                            <input type="hidden" name="flowerID" value="<%=f.getFlowerID()%>"/>
                            <button type="submit" class="cart-btn">🛒</button>
                        </form>
                        <% } else { %>
                            <span>Hết hàng</span>
                        <% } %>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>
        <% } else { %>
            <p>Không tìm thấy hoa nào phù hợp với "<%=searchTerm%>".</p>
        <% } %>

        <% } else { %>
            <p>Bạn không có quyền truy cập nội dung này.</p>
        <% } %>
    </div>
    <jsp:include page="footer.jsp"/>
</body>
</html>
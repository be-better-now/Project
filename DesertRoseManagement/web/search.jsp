<%-- 
    Document   : search
    Created on : Feb 13, 2025, 11:27:20 AM
    Author     : tungi
--%>

<%@page import="dto.FlowerDTO"%>
<%@page import="java.awt.print.Book"%>
<%@page import="java.util.List"%>
<%@page import="dto.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-16WWW">
        <title>JSP Page</title>

        <style>
            .flower-table {
                width: 100%;
                border-collapse: collapse;
                margin: 25px 0;
                font-size: 14px;
                font-family: Arial, sans-serif;
                box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            }

            .flower-table thead th {
                background-color: #009879;
                color: #ffffff;
                text-align: left;
                font-weight: bold;
                padding: 12px 15px;
            }

            .flower-table tbody tr {
                border-bottom: 1px solid #dddddd;
            }

            .flower-table tbody tr:nth-of-type(even) {
                background-color: #f3f3f3;
            }

            .flower-table tbody tr:last-of-type {
                border-bottom: 2px solid #009879;
            }

            .flower-table tbody td {
                padding: 12px 15px;
            }

            .flower-table tbody tr:hover {
                background-color: #f5f5f5;
                transition: 0.3s ease;
            }

            /* Responsive design */
            @media screen and (max-width: 600px) {
                .flower-table {
                    font-size: 12px;
                }

                .flower-table thead th,
                .flower-table tbody td {
                    padding: 8px 10px;
                }
            }
        </style> 
    </head>
    <body> 
        <%@include file="header.jsp" %>
        <div style="min-height: 500px; padding: 10px">
            <%                if (session.getAttribute("user") != null) {
                    UserDTO user = (UserDTO) session.getAttribute("user");
            %>
            <h1> Welcome <%=user.getFullName()%> </h1>
            <form action="MainController">
                <input type="hidden" name="action" value="logout"/>
                <input type="submit" value="Logout"/>
            </form>

            <br/>
            <%
                String searchTerm = request.getAttribute("searchTerm")+"";
                searchTerm = searchTerm.equals("null")?"":searchTerm;
            %>
            <form action="MainController">
                <input type="hidden" name="action" value="search"/>
                Search: <input type="text" name="searchTerm" value="<%=searchTerm%>"/>
                <input type="submit" value="Search"/>
                
            </form>
                
                <a href="addFlower.jsp">
                    Add
                </a>

            <%
                if (request.getAttribute("flowers") != null) {
                    List<FlowerDTO> flowers = (List<FlowerDTO>) request.getAttribute("flowers");

            %>
            <table class="flower-table">
                <thead>
                    <tr>
                        <th>FlowerID</th>
                        <th>FlowerName</th>
                        <th>Quality</th>
                        <th>Category</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Action</th>
                        <th>Add to Cart</th>
                    </tr>
                </thead>
                <tbody>
                    <%            for (FlowerDTO f : flowers) {
                    %>
                    <tr>
                        <td><%=f.getFlowerID()%></td>
                        <td><%=f.getFlowerName()%></td>
                        <td><%=f.getQuality()%></td>
                        <td><%=f.getCategory()%></td>
                        <td><%=f.getPrice()%></td>
                        <td><%=f.getQuantity()%></td>
                        <td><a href="MainController?action=delete&id=<%=f.getFlowerID()%>&searchTerm=<%=searchTerm%>">
                                <img src="assets/image/trash3.svg"  style="height: 25px"/>                              
                            </a></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
            <%    }
            } else { %>
            You do not have permission to access this content.
            <%}%>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
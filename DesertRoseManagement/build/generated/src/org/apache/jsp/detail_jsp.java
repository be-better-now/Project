package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.FlowerDTO;
import dto.UserDTO;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Chi tiết Hoa - Desert Rose Shop</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flowerDetail.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"page-content\">\n");
      out.write("        ");

            String message = (String) request.getAttribute("message");
            if (message != null) {
        
      out.write("\n");
      out.write("            <div class=\"message-container success\">\n");
      out.write("                <p>");
      out.print(message);
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- Breadcrumb Navigation -->\n");
      out.write("        <div class=\"breadcrumb\">\n");
      out.write("            <a href=\"MainController?action=home\">Trang chủ</a> >\n");
      out.write("            <span>Chi tiết Hoa</span>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

            FlowerDTO flower = (FlowerDTO) request.getAttribute("flower");
            if (flower == null) {
        
      out.write("\n");
      out.write("            <div class=\"error-container\">\n");
      out.write("                <h1>Hoa Không Tồn Tại</h1>\n");
      out.write("                <p>Sản phẩm bạn tìm không tồn tại hoặc đã bị xóa.</p>\n");
      out.write("                <a href=\"MainController?action=home\" class=\"back-link\">Quay lại Trang chủ</a>\n");
      out.write("            </div>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <div class=\"flower-detail-container\">\n");
      out.write("                <div class=\"flower-image\">\n");
      out.write("                    <!-- Giả sử chưa có hình ảnh, dùng placeholder -->\n");
      out.write("                    <div class=\"no-image\">\n");
      out.write("                        <span>Chưa có hình ảnh</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"flower-info\">\n");
      out.write("                    <h1>");
      out.print(flower.getFlowerName());
      out.write("</h1>\n");
      out.write("                    \n");
      out.write("                    <div class=\"flower-meta\">\n");
      out.write("                        <p class=\"quality\">Chất lượng: <strong>");
      out.print(flower.getQuality());
      out.write("</strong></p>\n");
      out.write("                        <p class=\"category\">Danh mục: <strong>");
      out.print(flower.getCategory());
      out.write("</strong></p>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"flower-price-block\">\n");
      out.write("                        <span class=\"price\">");
      out.print(String.format("%,.0f", flower.getPrice()));
      out.write(" VNĐ</span>\n");
      out.write("                        ");
 if (flower.getQuantity() > 0) { 
      out.write("\n");
      out.write("                            <span class=\"stock-info in-stock\">Còn hàng</span>\n");
      out.write("                        ");
 } else { 
      out.write("\n");
      out.write("                            <span class=\"stock-info out-of-stock\">Hết hàng</span>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"flower-details\">\n");
      out.write("                        <div class=\"detail-item\">\n");
      out.write("                            <span class=\"label\">Mã Hoa:</span>\n");
      out.write("                            <span class=\"value\">");
      out.print(flower.getFlowerID());
      out.write("</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"detail-item\">\n");
      out.write("                            <span class=\"label\">Số lượng:</span>\n");
      out.write("                            <span class=\"value\">");
      out.print(flower.getQuantity());
      out.write(" bó</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    ");
 if (flower.getQuantity() > 0) { 
      out.write("\n");
      out.write("                        <form action=\"MainController\" method=\"post\" class=\"cart-form\">\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"addToCart\">\n");
      out.write("                            <input type=\"hidden\" name=\"flowerID\" value=\"");
      out.print(flower.getFlowerID());
      out.write("\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"quantity-selector\">\n");
      out.write("                                <label for=\"quantity\">Số lượng:</label>\n");
      out.write("                                <div class=\"quantity-control\">\n");
      out.write("                                    <button type=\"button\" class=\"quantity-btn minus\" id=\"decreaseQty\">-</button>\n");
      out.write("                                    <input type=\"number\" id=\"quantity\" name=\"quantity\" value=\"1\" min=\"1\" max=\"");
      out.print(flower.getQuantity());
      out.write("\">\n");
      out.write("                                    <button type=\"button\" class=\"quantity-btn plus\" id=\"increaseQty\">+</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"action-buttons\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary add-to-cart\">\n");
      out.write("                                    <span class=\"icon\">🛒</span> Thêm vào Giỏ\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    ");
 } else { 
      out.write("\n");
      out.write("                        <div class=\"out-of-stock-message\">\n");
      out.write("                            <p>Sản phẩm này hiện đã hết hàng.</p>\n");
      out.write("                        </div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <!-- Thông tin thêm về hoa -->\n");
      out.write("            <div class=\"additional-info\">\n");
      out.write("                <div class=\"info-tabs\">\n");
      out.write("                    <button class=\"tab-btn active\" data-tab=\"description\">Mô tả</button>\n");
      out.write("                    <button class=\"tab-btn\" data-tab=\"details\">Chi tiết</button>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <div class=\"tab-pane active\" id=\"description\">\n");
      out.write("                        <h2>Mô tả</h2>\n");
      out.write("                        <p>");
      out.print(flower.getFlowerName());
      out.write(" là một sản phẩm ");
      out.print(flower.getQuality());
      out.write(" thuộc danh mục ");
      out.print(flower.getCategory());
      out.write(". Phù hợp để tặng trong các dịp đặc biệt.</p>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"tab-pane\" id=\"details\">\n");
      out.write("                        <h2>Chi tiết Sản phẩm</h2>\n");
      out.write("                        <table class=\"details-table\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Mã Hoa</th>\n");
      out.write("                                <td>");
      out.print(flower.getFlowerID());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Tên Hoa</th>\n");
      out.write("                                <td>");
      out.print(flower.getFlowerName());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Chất lượng</th>\n");
      out.write("                                <td>");
      out.print(flower.getQuality());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Danh mục</th>\n");
      out.write("                                <td>");
      out.print(flower.getCategory());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Giá</th>\n");
      out.write("                                <td>");
      out.print(String.format("%,.0f", flower.getPrice()));
      out.write(" VNĐ</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <!-- Admin controls -->\n");
      out.write("    ");

        UserDTO user = (UserDTO) session.getAttribute("user");
        if (user != null && "AD".equals(user.getRoleID())) {
    
      out.write("\n");
      out.write("    <div class=\"admin-bar\">\n");
      out.write("        <div class=\"admin-bar-container\">\n");
      out.write("            <span class=\"admin-message\">Bạn đang đăng nhập với vai trò Quản trị viên</span>\n");
      out.write("            <div class=\"admin-actions\">\n");
      out.write("                <a href=\"MainController?action=delete&id=");
      out.print(flower.getFlowerID());
      out.write("\" class=\"admin-btn\">Xóa Hoa</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    \n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/flowerDetail.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

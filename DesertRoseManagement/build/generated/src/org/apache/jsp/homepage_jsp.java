package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"vi\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Desert Rose Shop</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f8f9fa;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 1200px;\n");
      out.write("            margin: auto;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("        .title {\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: #008000;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("            font-size: 24px;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .product-card {\n");
      out.write("            background: white;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 15px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            transition: transform 0.3s;\n");
      out.write("        }\n");
      out.write("        .product-card:hover {\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("        .product-card img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: auto;\n");
      out.write("            border-radius: 10px;\n");
      out.write("        }\n");
      out.write("        .discount {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 10px;\n");
      out.write("            left: 10px;\n");
      out.write("            background: green;\n");
      out.write("            color: white;\n");
      out.write("            padding: 5px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        .product-title {\n");
      out.write("            font-size: 18px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .price {\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 16px;\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("        .old-price {\n");
      out.write("            text-decoration: line-through;\n");
      out.write("            color: gray;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"title\">BÓ HOA ??P SINH NH?T</div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3 mb-4\">\n");
      out.write("                <div class=\"product-card position-relative\">\n");
      out.write("                    <span class=\"discount\">-11%</span>\n");
      out.write("                    <img src=\"hoa1.jpg\" alt=\"Hoa 1\">\n");
      out.write("                    <p class=\"product-title\">Hoa Bó Sinh Nh?t Amethyst Aura</p>\n");
      out.write("                    <p class=\"price\"><span class=\"old-price\">950,000?</span> 850,000?</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 mb-4\">\n");
      out.write("                <div class=\"product-card position-relative\">\n");
      out.write("                    <span class=\"discount\">-14%</span>\n");
      out.write("                    <img src=\"hoa2.jpg\" alt=\"Hoa 2\">\n");
      out.write("                    <p class=\"product-title\">Bó Hoa H?ng Love Daily Rose</p>\n");
      out.write("                    <p class=\"price\"><span class=\"old-price\">350,000?</span> 300,000?</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 mb-4\">\n");
      out.write("                <div class=\"product-card position-relative\">\n");
      out.write("                    <span class=\"discount\">-18%</span>\n");
      out.write("                    <img src=\"hoa3.jpg\" alt=\"Hoa 3\">\n");
      out.write("                    <p class=\"product-title\">Hydrangea Muse Bouquet</p>\n");
      out.write("                    <p class=\"price\"><span class=\"old-price\">550,000?</span> 450,000?</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 mb-4\">\n");
      out.write("                <div class=\"product-card position-relative\">\n");
      out.write("                    <span class=\"discount\">-27%</span>\n");
      out.write("                    <img src=\"hoa4.jpg\" alt=\"Hoa 4\">\n");
      out.write("                    <p class=\"product-title\">Sweet Baby</p>\n");
      out.write("                    <p class=\"price\"><span class=\"old-price\">480,000?</span> 350,000?</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

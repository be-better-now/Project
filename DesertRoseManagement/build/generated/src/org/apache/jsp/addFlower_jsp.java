package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dto.FlowerDTO;
import java.awt.print.Book;

public final class addFlower_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Book Management</title>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            body {\n");
      out.write("                background-color: #f5f5f5;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                min-height: 100vh;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .container {\n");
      out.write("                background-color: white;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("                padding: 30px;\n");
      out.write("                width: 100%;\n");
      out.write("                max-width: 600px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h1 {\n");
      out.write("                color: #2c3e50;\n");
      out.write("                margin-top: 0;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .form-group {\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            label {\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 5px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"text\"],\n");
      out.write("            input[type=\"number\"] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 10px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                transition: border-color 0.3s;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"text\"]:focus,\n");
      out.write("            input[type=\"number\"]:focus {\n");
      out.write("                border-color: #3498db;\n");
      out.write("                outline: none;\n");
      out.write("                box-shadow: 0 0 5px rgba(52, 152, 219, 0.3);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .error-message {\n");
      out.write("                color: #e74c3c;\n");
      out.write("                font-size: 14px;\n");
      out.write("                margin-top: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .button-group {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            button, input[type=\"submit\"], input[type=\"reset\"] {\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: background-color 0.3s;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"submit\"] {\n");
      out.write("                background-color: #2ecc71;\n");
      out.write("                color: white;\n");
      out.write("                flex: 1;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"submit\"]:hover {\n");
      out.write("                background-color: #27ae60;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"reset\"] {\n");
      out.write("                background-color: #e74c3c;\n");
      out.write("                color: white;\n");
      out.write("                flex: 1;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=\"reset\"]:hover {\n");
      out.write("                background-color: #c0392b;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            FlowerDTO flower = new FlowerDTO();
            try {
                flower = (FlowerDTO) request.getAttribute("flower");
            } catch (Exception e) {
                flower = new FlowerDTO();
            }
            if (flower == null) {
                flower = new FlowerDTO();
            }
            // get error information
            String txtFlowerID_error = request.getAttribute("txtFlowerID_error") + "";
            txtFlowerID_error = txtFlowerID_error.equals("null") ? "" : txtFlowerID_error;
            String txtFlowerName_error = request.getAttribute("txtFlowerName_error") + "";
            txtFlowerName_error = txtFlowerName_error.equals("null") ? "" : txtFlowerName_error;
            String txtQuantity_error = request.getAttribute("txtQuantity_error") + "";
            txtQuantity_error = txtQuantity_error.equals("null") ? "" : txtQuantity_error;
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Flower Information</h1>\n");
      out.write("            <form action=\"MainController\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"add\"/>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txtFlowerID\">Flower ID:</label>\n");
      out.write("                    <input type=\"text\" id=\"txtFlowerID\" name=\"txtFlowerID\" value=\"");
      out.print(flower.getFlowerID());
      out.write("\"/>\n");
      out.write("                    ");
 if (!txtFlowerID_error.isEmpty()) { 
      out.write("\n");
      out.write("                        <div class=\"error-message\">");
      out.print(txtFlowerID_error);
      out.write("</div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txtFlowerName\">Flower Name:</label>\n");
      out.write("                    <input type=\"text\" id=\"txtFlowerName\" name=\"txtFlowerName\" value=\"");
      out.print(flower.getFlowerName());
      out.write("\"/>\n");
      out.write("                    ");
 if (!txtFlowerName_error.isEmpty()) { 
      out.write("\n");
      out.write("                        <div class=\"error-message\">");
      out.print(txtFlowerName_error);
      out.write("</div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txtQuality\">Quality:</label>\n");
      out.write("                    <input type=\"text\" id=\"txtQuality\" name=\"txtQuality\" value=\"");
      out.print(flower.getQuality());
      out.write("\"/>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txtCategory\">Category:</label>\n");
      out.write("                    <input type=\"number\" id=\"txtCategory\" name=\"txtCategory\" value=\"");
      out.print(flower.getCategory());
      out.write("\"/>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txtPrice\">Price:</label>\n");
      out.write("                    <input type=\"number\" id=\"txtPrice\" name=\"txtPrice\" value=\"");
      out.print(flower.getPrice());
      out.write("\"/>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txtQuantity\">Quantity:</label>\n");
      out.write("                    <input type=\"number\" id=\"txtQuantity\" name=\"txtQuantity\" value=\"");
      out.print(flower.getQuantity());
      out.write("\"/>\n");
      out.write("                    ");
 if (!txtQuantity_error.isEmpty()) { 
      out.write("\n");
      out.write("                        <div class=\"error-message\">");
      out.print(txtQuantity_error);
      out.write("</div>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"button-group\">\n");
      out.write("                    <input type=\"submit\" value=\"Save\" />\n");
      out.write("                    <input type=\"reset\" value=\"Reset\"/>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

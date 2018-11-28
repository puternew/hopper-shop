package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>HOPPER SHOP</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand active\" href=\"Home.jsp\">HOPPER</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li ><a href=\"#\">LIMITED</a></li>\n");
      out.write("                    <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">BRAND<span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">ADIDAS</a></li>\n");
      out.write("                            <li><a href=\"#\">CONVERSE</a></li>\n");
      out.write("                            <li><a href=\"#\">GUCCI</a></li>\n");
      out.write("                            <li><a href=\"#\">NEW BALANCE</a></li>\n");
      out.write("                            <li><a href=\"#\">NIKE</a></li>\n");
      out.write("                            <li><a href=\"#\">ONISUKA TIGER</a></li>\n");
      out.write("                            <li><a href=\"#\">PUMA</a></li>\n");
      out.write("                            <li><a href=\"#\">REBOX</a></li>\n");
      out.write("                            <li><a href=\"#\">UNDER ARMOR</a></li>\n");
      out.write("                            <li><a href=\"#\">VANS</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"Register-form\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row centered-form\">\n");
      out.write("                    <div class=\"col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h3 class=\"panel-title\">Please sign up to enjoy Hopping</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <form role=\"form\">\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"email\" name=\"email\" id=\"email\" class=\"form-control input-sm\" placeholder=\"Email Address\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"password\" name=\"accountPassword\" id=\"accountPassword\" class=\"form-control input-sm\" placeholder=\"Password\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"textbox\" name=\"accountName\" id=\"accountName\" class=\"form-control input-sm\" placeholder=\"Your Name\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"textbox\" name=\"telNo\" id=\"telNo\" class=\"form-control input-sm\" placeholder=\"Phone Number\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"comment\">Address:</label>\n");
      out.write("                                            <textarea name=\"address\" class=\"form-control input-sm\" rows=\"5\" id=\"Address\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"textbox\" name=\"province\" id=\"province\" class=\"form-control input-sm\" placeholder=\"Province\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-6 col-sm-6 col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"textbox\" name=\"postalCode\" id=\"postalCode\" class=\"form-control input-sm\" placeholder=\"Postal Code\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <input type=\"submit\" value=\"Register\" class=\"btn btn-info btn-block\">\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

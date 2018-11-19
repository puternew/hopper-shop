package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("        <title>HOPPER SHOP</title>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("       \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-default\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <a class=\"navbar-brand active\" href=\"Home.jsp\">HOPPER</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li ><a href=\"#\">LIMITED</a></li>\r\n");
      out.write("                    <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">BRAND<span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li><a href=\"#\">ADIDAS</a></li>\r\n");
      out.write("                            <li><a href=\"#\">CONVERSE</a></li>\r\n");
      out.write("                            <li><a href=\"#\">GUCCI</a></li>\r\n");
      out.write("                            <li><a href=\"#\">NEW BALANCE</a></li>\r\n");
      out.write("                            <li><a href=\"#\">NIKE</a></li>\r\n");
      out.write("                            <li><a href=\"#\">ONISUKA TIGER</a></li>\r\n");
      out.write("                            <li><a href=\"#\">PUMA</a></li>\r\n");
      out.write("                            <li><a href=\"#\">REBOX</a></li>\r\n");
      out.write("                            <li><a href=\"#\">UNDER ARMOR</a></li>\r\n");
      out.write("                            <li><a href=\"#\">VANS</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("     <div class=\"Login-form\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("         <div class=\"row centered-form\">\r\n");
      out.write("             <div class=\"col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4\">\r\n");
      out.write("                 <div class=\"panel panel-default\">\r\n");
      out.write("                     <div class=\"panel-heading\">\r\n");
      out.write("                          <h3 class=\"panel-title\">Please log in to enjoy Hopping</h3>\r\n");
      out.write("                      </div>\r\n");
      out.write("                         <div class=\"panel-body\">\r\n");
      out.write("                             <div class=\"form-group\">\r\n");
      out.write("                                    <input type=\"email\" name=\"email\" id=\"email\" class=\"form-control input-sm\" placeholder=\"Email Address\">\r\n");
      out.write("                             </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                        <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control input-sm\" placeholder=\"Password\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                 </div>\r\n");
      out.write("\r\n");
      out.write("                     <form action=\"Login\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"submit\" value=\"Login\" class=\"btn btn-info btn-block\">\r\n");
      out.write("\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

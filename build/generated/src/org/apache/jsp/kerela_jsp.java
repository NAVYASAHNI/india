package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kerela_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Explore Kerala</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #fff5e6;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .header {\n");
      out.write("                text-align: center;\n");
      out.write("                color:  #FFFFFF;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .flashcards-container {\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                gap: 20px;\n");
      out.write("                justify-content: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .flashcard {\n");
      out.write("                width: 300px;\n");
      out.write("                height: 200px;\n");
      out.write("                background-color: #4caf50;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                color: white;\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                transition: transform 0.3s;\n");
      out.write("                box-shadow: 0 4px 8px rgba(0,0,0,0.1);\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .flashcard:hover {\n");
      out.write("                transform: translateY(-5px);\n");
      out.write("            }\n");
      out.write("            .background-container {\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0;\n");
      out.write("            left: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100vh;\n");
      out.write("            /* Gradient background instead of image */\n");
      out.write("            background: linear-gradient(135deg, \n");
      out.write("                #FF9933, /* Saffron */\n");
      out.write("                #FFFFFF, /* White */\n");
      out.write("                 #FFFFFF  /* Green */\n");
      out.write("            );\n");
      out.write("            opacity: 0.8;\n");
      out.write("            z-index: -1;\n");
      out.write("          background: linear-gradient(rgba(0, 0, 0, 0.3), rgba(0, 0, 0, 0.3)), \n");
      out.write("                        url('kb.jpeg');\n");
      out.write("            background-size: cover;\n");
      out.write("            background-position: center;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <div class=\"background-container\"></div>\n");
      out.write("   \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Explore Kerala</h1>\n");
      out.write("            <p>Click on a region to discover its tourist destinations</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"flashcards-container\">\n");
      out.write("            <a href=\"kochi.jsp\" class=\"flashcard\"> Kochi</a>\n");
      out.write("            <a href=\"munnar.jsp\" class=\"flashcard\">Munnar</a>\n");
      out.write("            <a href=\"alleppey.jsp\" class=\"flashcard\">Alleppey</a>\n");
      out.write("            <a href=\"thekkady.jsp\" class=\"flashcard\">Thekkady</a>\n");
      out.write("            <a href=\"kumarakom.jsp\" class=\"flashcard\">Kumarakom</a>\n");
      out.write("            <a href=\"varkala.jsp\" class=\"flashcard\">Varkala</a>\n");
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

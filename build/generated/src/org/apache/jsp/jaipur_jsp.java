package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jaipur_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tourist Places in Jaipur</title>\n");
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
      out.write("                color: #b3003b;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .place-card {\n");
      out.write("                background-color: white;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin: 20px auto;\n");
      out.write("                max-width: 800px;\n");
      out.write("                box-shadow: 0 2px 5px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .place-card h2 {\n");
      out.write("                color: #ff6633;\n");
      out.write("                margin-top: 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .place-image {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 400px;\n");
      out.write("                object-fit: cover;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .details {\n");
      out.write("                margin: 15px 0;\n");
      out.write("                padding: 15px;\n");
      out.write("                background-color: #fff9f9;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .back-button {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #ff9966;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin: 20px 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .back-button:hover {\n");
      out.write("                background-color: #ff8844;\n");
      out.write("            }\n");
      out.write("       \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"jai.jsp\" class=\"back-button\">← Back to Regions</a>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Tourist Places in Jaipur</h1>\n");
      out.write("            <p>Discover the Pink City's most famous attractions</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Hawa Mahal</h2>\n");
      out.write("            <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"h.jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>Known as Palace of Winds, built in 1799. Famous for its unique honeycomb-like structure with 953 windows.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 9:00 AM - 4:30 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹50 for Indians, ₹200 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Hawa Mahal Rd, Badi Choupad, J.D.A. Market, Pink City, Jaipur</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning to avoid crowds and get the best photos</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Visit during sunrise for the best photography opportunities</li>\n");
      out.write("                    <li>The view from the opposite café is spectacular</li>\n");
      out.write("                    <li>Hire a local guide to learn about the historical significance</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Amber Fort</h2>\n");
      out.write("           <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"am.jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>UNESCO World Heritage site built in 1592. Known for its artistic Hindu style elements and large ramparts.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 8:00 AM - 5:30 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹100 for Indians, ₹500 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Devisinghpura, Amer, Jaipur</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning or late afternoon</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Book an elephant ride in advance during peak season</li>\n");
      out.write("                    <li>Light and sound show in the evening is recommended</li>\n");
      out.write("                    <li>Wear comfortable walking shoes</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
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

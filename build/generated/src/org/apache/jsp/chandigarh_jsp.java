package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chandigarh_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tourist Places in Chandigarh</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #fff9e6;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #ffcc00;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .place-card {\n");
      out.write("                background-color: white;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin: 20px auto;\n");
      out.write("                max-width: 800px;\n");
      out.write("                box-shadow: 0 2px 5px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .place-card h2 {\n");
      out.write("                color: #ff9900;\n");
      out.write("                margin-top: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .place-image {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 300px;\n");
      out.write("                object-fit: cover;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .details {\n");
      out.write("                margin: 15px 0;\n");
      out.write("                padding: 15px;\n");
      out.write("                background-color: #fff7d9;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back-button {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #ffcc00;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin: 20px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back-button:hover {\n");
      out.write("                background-color: #ffb300;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"punjab.jsp\" class=\"back-button\">← Back to Regions</a>\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Tourist Places in Chandigarh</h1>\n");
      out.write("            <p>Explore the beauty and modern architecture of Chandigarh</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Sukhna Lake -->\n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Sukhna Lake</h2>\n");
      out.write("            <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"s.jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>Sukhna Lake is a man-made reservoir at the foothills of the Himalayas, popular for boating and its scenic beauty.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 5:00 AM - 9:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹10 for Indians, ₹50 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Sector 1, Chandigarh</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early mornings and evenings for a peaceful experience</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Boating is a popular activity here, try it for a unique experience</li>\n");
      out.write("                    <li>Visit during sunset for beautiful views of the lake</li>\n");
      out.write("                    <li>Wear comfortable shoes if you plan to walk around the lake</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Rock Garden -->\n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Rock Garden</h2>\n");
      out.write("           <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"rr (1).jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>The Rock Garden of Chandigarh is a unique garden made entirely from industrial & home waste and thrown-away items.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 9:00 AM - 7:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹30 for Indians, ₹50 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Sector 1, Chandigarh</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Afternoon to enjoy the artistic sculptures</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Spend time exploring the various sections of the garden</li>\n");
      out.write("                    <li>Photography is allowed, so don’t forget to bring your camera</li>\n");
      out.write("                    <li>Visit on weekdays to avoid heavy crowds</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Elante Mall -->\n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Elante Mall</h2>\n");
      out.write("           <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"ee (1).webp\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>Elante Mall is one of the largest shopping malls in Chandigarh, offering a wide range of shopping, dining, and entertainment options.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 10:00 AM - 10:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> Free</p>\n");
      out.write("                <p><strong>Address:</strong> Industrial Area, Chandigarh</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Evening for shopping and dining</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Check out the entertainment zone for kids and families</li>\n");
      out.write("                    <li>Great place for shopping and enjoying delicious meals</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

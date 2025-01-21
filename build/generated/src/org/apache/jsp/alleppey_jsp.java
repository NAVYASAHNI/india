package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class alleppey_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tourist Places in Alleppey</title>\n");
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
      out.write("                height: 300px;\n");
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
      out.write("        <a href=\"kerela.jsp\" class=\"back-button\">← Back to Regions</a>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Tourist Places in Alleppey</h1>\n");
      out.write("            <p>Explore the serene backwaters and natural beauty of Alleppey</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Alleppey Backwaters</h2>\n");
      out.write("             <div class=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"aaa (1).jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>Alleppey is famous for its backwaters, houseboat cruises, and picturesque views of canals and lagoons.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> Open 24 hours (Best for houseboat cruises in the daytime)</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> Free (Houseboat cruise prices vary)</p>\n");
      out.write("                <p><strong>Address:</strong> Alleppey, Kerala</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> November to February for pleasant weather</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Book a houseboat in advance during peak season</li>\n");
      out.write("                    <li>Carry sun protection and comfortable clothing</li>\n");
      out.write("                    <li>Be sure to enjoy the local cuisine served on houseboats</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Alleppey Beach</h2>\n");
      out.write("            <div class=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"ap.jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>Alleppey Beach is a peaceful and beautiful destination, offering a serene atmosphere and lovely sunset views.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 9:00 AM - 6:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> Free</p>\n");
      out.write("                <p><strong>Address:</strong> Alleppey, Kerala</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning or late evening</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Take a walk along the beach and enjoy the cool breeze</li>\n");
      out.write("                    <li>Great spot for evening photography and watching sunsets</li>\n");
      out.write("                    <li>Do visit the nearby lighthouse for panoramic views</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Kuttanadu Backwaters</h2>\n");
      out.write("             <div class=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"an (1).jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>Kuttanadu is known as the 'Rice Bowl of Kerala' and is famous for its lush paddy fields and tranquil backwaters.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> Open 24 hours (Best for a visit in the morning or late afternoon)</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> Free</p>\n");
      out.write("                <p><strong>Address:</strong> Kuttanadu, Alleppey, Kerala</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> November to March for clear skies and pleasant weather</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Enjoy a boat ride through the backwaters for a peaceful experience</li>\n");
      out.write("                    <li>Take time to interact with local farmers and learn about paddy cultivation</li>\n");
      out.write("                    <li>Bring a camera to capture the serene landscape</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
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

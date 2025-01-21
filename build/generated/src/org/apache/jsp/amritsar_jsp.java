package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amritsar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tourist Places in Amritsar</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #fff5e6;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #b3003b;\n");
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
      out.write("                color: #ff6633;\n");
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
      out.write("                background-color: #fff9f9;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back-button {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #ff9966;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin: 20px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back-button:hover {\n");
      out.write("                background-color: #ff8844;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"punjab.jsp\" class=\"back-button\">← Back to Regions</a>\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Tourist Places in Amritsar</h1>\n");
      out.write("            <p>Explore the spiritual and historical beauty of Amritsar</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Golden Temple -->\n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Golden Temple</h2>\n");
      out.write("            <div class=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"g (1).webp\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>The Golden Temple, also known as Harmandir Sahib, is the holiest Gurdwara and the most important pilgrimage site of Sikhism.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 4:00 AM - 10:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> Free</p>\n");
      out.write("                <p><strong>Address:</strong> Golden Temple Rd, Amritsar, Punjab</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning or evening for peaceful surroundings and a serene experience</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Wear modest attire while visiting the temple</li>\n");
      out.write("                    <li>Visit the community kitchen (Langar) to experience the service</li>\n");
      out.write("                    <li>Be respectful to the traditions and practices of the Gurdwara</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Jallianwala Bagh -->\n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Jallianwala Bagh</h2>\n");
      out.write("           <div class=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"j (1).jpeg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>The Jallianwala Bagh is a public garden that is historically significant for the massacre that occurred here in 1919.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 6:30 AM - 7:30 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹15 for Indians, ₹100 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Near Golden Temple, Amritsar, Punjab</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early mornings or late evenings</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Visit the memorial to pay your respects to the martyrs</li>\n");
      out.write("                    <li>Take a guided tour to understand the significance of the site</li>\n");
      out.write("                    <li>Wear comfortable footwear as it involves walking around the garden</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Partition Museum -->\n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Partition Museum</h2>\n");
      out.write("           <div class=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"tt (1).jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>The Partition Museum is dedicated to the history and aftermath of the partition of India in 1947.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 10:00 AM - 6:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹10 for Indians, ₹50 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Town Hall, Amritsar, Punjab</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> During the day, as the museum provides a detailed account of history</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Explore the exhibitions to understand the impact of the partition on the region</li>\n");
      out.write("                    <li>Check the museum’s schedule for events or talks about the partition</li>\n");
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

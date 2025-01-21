package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bathinda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tourist Places in Bathinda</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #e8f5e9; /* Light Green */\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #388e3c; /* Dark Green for headings */\n");
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
      out.write("                color: #43a047; /* Slightly darker green for headings */\n");
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
      out.write("                background-color: #c8e6c9; /* Light green background for details */\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back-button {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #388e3c; /* Dark green for button */\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin: 20px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back-button:hover {\n");
      out.write("                background-color: #2e7d32; /* Darker green for hover effect */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"punjab.jsp\" class=\"back-button\">← Back to Regions</a>\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Tourist Places in Bathinda</h1>\n");
      out.write("            <p>Explore the historical and cultural gems of Bathinda</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Qila Mubarak -->\n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Qila Mubarak</h2>\n");
      out.write("<!--           <form class=\"image-upload-form\" id=\"imageUploadForm\">\n");
      out.write("                <input type=\"file\" id=\"imageInput\" class=\"file-input\" accept=\"image/*\">\n");
      out.write("                <button type=\"submit\" class=\"upload-btn\">Upload Image</button>\n");
      out.write("            </form>-->\n");
      out.write("            \n");
      out.write("            <!-- Image container where the uploaded image will be displayed -->\n");
      out.write("            <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"a.jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>Qila Mubarak is a historic fort in Bathinda, known for its ancient architecture and rich history. The fort is a landmark of the city and a must-visit for history enthusiasts.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹20</p>\n");
      out.write("                <p><strong>Address:</strong> Qila Mubarak Rd, Bathinda</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning or late afternoon to avoid the heat</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Explore the fort's history and architecture with a local guide</li>\n");
      out.write("                    <li>Carry water and wear comfortable shoes for walking</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bathinda Lake -->\n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Bathinda Lake</h2>\n");
      out.write("            <img src=\"images/bathinda-lake.jpg\" alt=\"Bathinda Lake\" class=\"place-image\">\n");
      out.write("            <p>Bathinda Lake is a serene spot located near the city's center, ideal for picnics and boat rides. The peaceful ambiance makes it a perfect escape from the bustling city life.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 9:00 AM - 6:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹30</p>\n");
      out.write("                <p><strong>Address:</strong> Bathinda Lake Rd, Bathinda</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Evening for a calm experience by the water</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Don't forget to bring your camera to capture the scenic views</li>\n");
      out.write("                    <li>Try the boat rides for a peaceful experience on the lake</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Rose Garden -->\n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Rose Garden</h2>\n");
      out.write("            <img src=\"images/rose-garden.jpg\" alt=\"Rose Garden\" class=\"place-image\">\n");
      out.write("            <p>The Rose Garden is a beautiful park with vibrant roses in full bloom. It's a great spot for nature lovers, photographers, and those looking for a relaxing walk.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 6:00 AM - 9:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> Free</p>\n");
      out.write("                <p><strong>Address:</strong> Rose Garden Rd, Bathinda</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning or late evening when the weather is pleasant</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Bring a hat and sunscreen for protection under the sun</li>\n");
      out.write("                    <li>Enjoy a peaceful stroll through the rose-filled pathways</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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

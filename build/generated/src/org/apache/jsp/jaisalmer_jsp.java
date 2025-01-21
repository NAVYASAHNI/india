package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jaisalmer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tourist Places in Jaisalmer</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #fff4e6;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .header {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #cc8400;\n");
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
      out.write("                color: #e68a00;\n");
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
      out.write("                background-color: #fff8f2;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .back-button {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #ffcc66;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin: 20px 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .back-button:hover {\n");
      out.write("                background-color: #ffb84d;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"jai.jsp\" class=\"back-button\">← Back to Regions</a>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Tourist Places in Jaisalmer</h1>\n");
      out.write("            <p>Experience the Golden City's rich heritage and desert charm</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Jaisalmer Fort</h2>\n");
      out.write("            <img src=\"images/jaisalmer-fort.jpg\" alt=\"Jaisalmer Fort\" class=\"place-image\">\n");
      out.write("            <p>Known as Sonar Quila (Golden Fort), this living fort built in 1156 is a UNESCO World Heritage site, famous for its stunning architecture and sandstone walls.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> Open 24 hours</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> Free (additional charges for museum)</p>\n");
      out.write("                <p><strong>Address:</strong> Fort Rd, Near Gopa Chowk, Jaisalmer, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning or sunset for spectacular views</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Explore the narrow lanes filled with shops and eateries</li>\n");
      out.write("                    <li>Visit the Jain temples within the fort</li>\n");
      out.write("                    <li>Stay overnight in one of the heritage accommodations</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Sam Sand Dunes</h2>\n");
      out.write("            <img src=\"images/sam-sand-dunes.jpg\" alt=\"Sam Sand Dunes\" class=\"place-image\">\n");
      out.write("            <p>A must-visit for an authentic desert experience, featuring camel safaris, jeep rides, and cultural performances under the starry sky.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> Open 24 hours</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> Free (charges for activities)</p>\n");
      out.write("                <p><strong>Address:</strong> Sam, Jaisalmer, Rajasthan (42 km from the city)</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Evening for sunsets and night for cultural shows</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Book your desert camp in advance during peak season</li>\n");
      out.write("                    <li>Carry warm clothes as it gets chilly at night</li>\n");
      out.write("                    <li>Try the Rajasthani traditional food served at the camps</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Patwon Ki Haveli</h2>\n");
      out.write("            <img src=\"images/patwon-ki-haveli.jpg\" alt=\"Patwon Ki Haveli\" class=\"place-image\">\n");
      out.write("            <p>A cluster of five havelis built in 1805, showcasing intricate architecture and beautiful frescoes, it is the oldest haveli in Jaisalmer.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹20 for Indians, ₹100 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Near Patwa Complex, Jaisalmer, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Morning for good lighting and fewer crowds</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Hire a guide to learn about the history of the havelis</li>\n");
      out.write("                    <li>Don’t miss the museum inside the haveli</li>\n");
      out.write("                    <li>Capture the intricate carvings on the sandstone walls</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Add more place cards as needed -->\n");
      out.write("        \n");
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

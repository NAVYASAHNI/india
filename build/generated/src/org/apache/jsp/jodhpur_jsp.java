package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jodhpur_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Tourist Places in Jodhpur</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #e6f7ff;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .header {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #003366;\n");
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
      out.write("                color: #00509e;\n");
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
      out.write("                background-color: #f2f9ff;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .back-button {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #3399ff;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin: 20px 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .back-button:hover {\n");
      out.write("                background-color: #0073e6;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"jai.jsp\" class=\"back-button\">← Back to Regions</a>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Tourist Places in Jodhpur</h1>\n");
      out.write("            <p>Explore the heritage and charm of the Blue City</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Mehrangarh Fort</h2>\n");
      out.write("            <img src=\"images/mehrangarh-fort.jpg\" alt=\"Mehrangarh Fort\" class=\"place-image\">\n");
      out.write("            <p>One of the largest forts in India, built in 1459. Famous for its impressive architecture and panoramic views of the Blue City.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹100 for Indians, ₹600 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Fort Rd, Jodhpur, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning for cool weather and fewer crowds</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Take the elevator to the top for stunning views</li>\n");
      out.write("                    <li>Visit the museum to learn about Jodhpur's royal history</li>\n");
      out.write("                    <li>Enjoy a meal at the rooftop café inside the fort</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Umaid Bhawan Palace</h2>\n");
      out.write("            <img src=\"images/umaid-bhawan-palace.jpg\" alt=\"Umaid Bhawan Palace\" class=\"place-image\">\n");
      out.write("            <p>A magnificent palace built between 1928 and 1943. Part of it still serves as the royal residence, while another part is a luxury hotel and museum.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 10:00 AM - 4:30 PM (Museum)</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹30 for Indians, ₹100 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Circuit House Rd, Jodhpur, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Morning hours for museum exploration</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Book a stay at the palace for a royal experience</li>\n");
      out.write("                    <li>Don’t miss the vintage car collection in the museum</li>\n");
      out.write("                    <li>Enjoy high tea at the palace hotel</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Jaswant Thada</h2>\n");
      out.write("            <img src=\"images/jaswant-thada.jpg\" alt=\"Jaswant Thada\" class=\"place-image\">\n");
      out.write("            <p>Known as the \"Taj Mahal of Marwar,\" this cenotaph is made of intricately carved marble and offers a peaceful ambiance.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹30 for Indians, ₹50 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Near Mehrangarh Fort, Jodhpur, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning or evening</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Combine your visit with Mehrangarh Fort</li>\n");
      out.write("                    <li>Capture the serene lake view nearby</li>\n");
      out.write("                    <li>Hire a guide for historical insights</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!-- Add more place cards as needed -->\n");
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

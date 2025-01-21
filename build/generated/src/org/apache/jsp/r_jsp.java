package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class r_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Rajasthan - Land of Kings</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: #fff5e6;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                max-width: 1200px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                background-color: white;\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                box-shadow: 0 0 15px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("            .header {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #b3003b;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: #ffe6e6;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            .section {\n");
      out.write("                margin: 20px 0;\n");
      out.write("                padding: 15px;\n");
      out.write("                border: 1px solid #ffcccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            .section h2 {\n");
      out.write("                color: #cc0044;\n");
      out.write("                border-bottom: 2px solid #ffcccc;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .city-card {\n");
      out.write("                background-color: #fff9f9;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border-left: 4px solid #ff6666;\n");
      out.write("            }\n");
      out.write("            .festival-card {\n");
      out.write("                background-color: #fff9f9;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border-left: 4px solid #ff9933;\n");
      out.write("            }\n");
      out.write("            .food-item {\n");
      out.write("                background-color: #fff9f9;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border-left: 4px solid #66cc66;\n");
      out.write("            }\n");
      out.write("            .craft-item {\n");
      out.write("                background-color: #fff9f9;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                border-left: 4px solid #6666ff;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("                list-style-type: none;\n");
      out.write("                padding-left: 0;\n");
      out.write("            }\n");
      out.write("            li {\n");
      out.write("                margin: 10px 0;\n");
      out.write("                padding-left: 20px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            li:before {\n");
      out.write("                content: \"•\";\n");
      out.write("                color: #cc0044;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <h1>Rajasthan - The Land of Kings</h1>\n");
      out.write("                <p>");
      out.print( "Last Updated: " + new java.text.SimpleDateFormat("dd-MM-yyyy").format(new java.util.Date()) );
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h2>Historical Cities</h2>\n");
      out.write("                \n");
      out.write("                <div class=\"city-card\">\n");
      out.write("                    <h3>Jaipur - The Pink City</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Founded in 1727 by Maharaja Sawai Jai Singh II</li>\n");
      out.write("                        <li>Famous for Hawa Mahal (Palace of Winds)</li>\n");
      out.write("                        <li>Home to City Palace and royal family</li>\n");
      out.write("                        <li>Known for grid-pattern streets and urban planning</li>\n");
      out.write("                        <li>Painted pink in 1876 to welcome Prince of Wales</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"city-card\">\n");
      out.write("                    <h3>Udaipur - The City of Lakes</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Founded by Maharana Udai Singh II in 1559</li>\n");
      out.write("                        <li>Features the magnificent Lake Palace on Lake Pichola</li>\n");
      out.write("                        <li>Known for its romantic setting and luxury palace hotels</li>\n");
      out.write("                        <li>Famous for miniature paintings and arts</li>\n");
      out.write("                        <li>Houses the largest palace complex in Rajasthan</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h2>Festivals & Cultural Events</h2>\n");
      out.write("                \n");
      out.write("                <div class=\"festival-card\">\n");
      out.write("                    <h3>Pushkar Camel Fair (November)</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Gathering of over 50,000 camels for trading</li>\n");
      out.write("                        <li>Cultural competitions and events</li>\n");
      out.write("                        <li>Traditional music and dance performances</li>\n");
      out.write("                        <li>Hot air balloon rides</li>\n");
      out.write("                        <li>Religious rituals at Pushkar Lake</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"festival-card\">\n");
      out.write("                    <h3>Desert Festival (February)</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Held in Jaisalmer</li>\n");
      out.write("                        <li>Features camel races and polo matches</li>\n");
      out.write("                        <li>Turban-tying competitions</li>\n");
      out.write("                        <li>Folk music by Manganiyar and Langa groups</li>\n");
      out.write("                        <li>Mr. Desert competition</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h2>Traditional Cuisine</h2>\n");
      out.write("                \n");
      out.write("                <div class=\"food-item\">\n");
      out.write("                    <h3>Dal Baati Churma</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Dal: Mix of five different lentils</li>\n");
      out.write("                        <li>Baati: Hard unleavened bread baked in traditional ovens</li>\n");
      out.write("                        <li>Churma: Sweetened crushed wheat balls with ghee</li>\n");
      out.write("                        <li>Served with local spices and garlic chutney</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"food-item\">\n");
      out.write("                    <h3>Other Signature Dishes</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Laal Maas (spicy meat curry)</li>\n");
      out.write("                        <li>Ker Sangri (desert beans and berries)</li>\n");
      out.write("                        <li>Gatte ki Sabzi (gram flour dumplings in curry)</li>\n");
      out.write("                        <li>Pyaaz Kachori (onion-filled deep-fried snack)</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"section\">\n");
      out.write("                <h2>Art & Craft Heritage</h2>\n");
      out.write("                \n");
      out.write("                <div class=\"craft-item\">\n");
      out.write("                    <h3>Textiles</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Bandhani tie-dye work</li>\n");
      out.write("                        <li>Block printing from Bagru and Sanganer</li>\n");
      out.write("                        <li>Lehariya patterns</li>\n");
      out.write("                        <li>Zari embroidery</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"craft-item\">\n");
      out.write("                    <h3>Handicrafts</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Blue pottery from Jaipur</li>\n");
      out.write("                        <li>Marble crafts from Makrana</li>\n");
      out.write("                        <li>Leather work from Jodhpur</li>\n");
      out.write("                        <li>Wooden furniture from Shekhawati</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer\" style=\"text-align: center; margin-top: 20px; color: #666;\">\n");
      out.write("               \n");
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

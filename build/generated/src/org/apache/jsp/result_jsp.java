package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Search Results</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Search Results</h1>\n");
      out.write("    ");
 
        try {
            // Define destinations
            HashMap<String, List<String>> destinations = new HashMap<>();
            destinations.put("rajasthan", Arrays.asList("Jaipur", "Udaipur", "Jaisalmer"));
            destinations.put("kerala", Arrays.asList("Munnar", "Alleppey", "Kochi"));
            destinations.put("himachal pradesh", Arrays.asList("Shimla", "Manali", "Dharamshala"));

            // Retrieve user input
            String state = request.getParameter("state");
            if (state != null) {
                state = state.trim().toLowerCase();
                List<String> places = destinations.get(state);

                if (places != null) {
    
      out.write("\n");
      out.write("    <h2>Tourist Destinations in ");
      out.print( state );
      out.write(":</h2>\n");
      out.write("    <ul>\n");
      out.write("        ");
 for (String place : places) { 
      out.write("\n");
      out.write("            <li>");
      out.print( place );
      out.write("</li>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </ul>\n");
      out.write("    ");
 
                } else { 
    
      out.write("\n");
      out.write("    <p>No destinations found for the state: ");
      out.print( state );
      out.write(".</p>\n");
      out.write("    ");
 
                }
            } else { 
    
      out.write("\n");
      out.write("    <p>State parameter is missing.</p>\n");
      out.write("    ");
 
            }
        } catch (Exception e) { 
    
      out.write("\n");
      out.write("    <p>Error: ");
      out.print( e.getMessage() );
      out.write("</p>\n");
      out.write("    ");

//            e.printStackTrace(out);
        }
    
      out.write("\n");
      out.write("    <a href=\"a.jsp\">Back to Search</a>\n");
      out.write("</body>\n");
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

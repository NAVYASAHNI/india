package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mountabu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tourist Places in Mount Abu</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #e0f7fa;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .header {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #004d40;\n");
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
      out.write("                color: #00796b;\n");
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
      out.write("            .place-card:hover {\n");
      out.write("            transform: translateY(-5px);\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .place-image {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 300px;\n");
      out.write("            object-fit: cover;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .place-info {\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .place-title {\n");
      out.write("            font-size: 24px;\n");
      out.write("            color: #036666;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .place-description {\n");
      out.write("            color: #444;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            line-height: 1.6;\n");
      out.write("        }\n");
      out.write("            .details {\n");
      out.write("                margin: 15px 0;\n");
      out.write("                padding: 15px;\n");
      out.write("                background-color: #e0f2f1;\n");
      out.write("                border-radius: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .back-button {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #009688;\n");
      out.write("                color: white;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                margin: 20px 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .back-button:hover {\n");
      out.write("                background-color: #00796b;\n");
      out.write("            }\n");
      out.write("            .place-image-container {\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 800px; /* Adjust this value based on your needs */\n");
      out.write("            margin: 20px 0;\n");
      out.write("            overflow: hidden;\n");
      out.write("            border-radius: 8px;\n");
      out.write("        }\n");
      out.write("         /* Optional: Add a max-height if needed */\n");
      out.write("        .place-image.with-max-height {\n");
      out.write("            max-height: 500px; /* Adjust this value based on your needs */\n");
      out.write("            object-position: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Container for the entire content */\n");
      out.write("        .content-container {\n");
      out.write("            max-width: 1200px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Styling for the place title */\n");
      out.write("        .place-title {\n");
      out.write("            color: #008080;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Styling for the description */\n");
      out.write("        .place-description {\n");
      out.write("            margin: 20px 0;\n");
      out.write("            line-height: 1.6;\n");
      out.write("        }\n");
      out.write("         .imageContainer {\n");
      out.write("            width: 100%;\n");
      out.write("            max-width: 800px; /* Adjust this value based on your needs */\n");
      out.write("            margin: 20px 0;\n");
      out.write("            overflow: hidden;\n");
      out.write("            border-radius: 8px;\n");
      out.write("        }\n");
      out.write(" .details-grid {\n");
      out.write("            display: grid;\n");
      out.write("            grid-gap: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .detail-item {\n");
      out.write("            display: grid;\n");
      out.write("            grid-template-columns: 100px 1fr;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .detail-label {\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: #0891b2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .detail-value {\n");
      out.write("            color: #444;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media (min-width: 768px) {\n");
      out.write("            .tourist-places {\n");
      out.write("                grid-template-columns: repeat(2, 1fr);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media (max-width: 767px) {\n");
      out.write("            .tourist-places {\n");
      out.write("                grid-template-columns: 1fr;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .place-image {\n");
      out.write("                height: 200px;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"index.jsp\" class=\"back-button\">← Back to Regions</a>\n");
      out.write("        \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>Tourist Places in Mount Abu</h1>\n");
      out.write("            <p>Explore the only hill station in Rajasthan</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Dilwara Temples</h2>\n");
      out.write("          <div class=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"t (1).webp\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>Famous for their stunning marble architecture, the Dilwara Temples are dedicated to Jain Tirthankaras and are an architectural marvel.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 12:00 PM - 5:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹10 for Indians, ₹50 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Dilwara Rd, Mount Abu, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early afternoon to avoid crowd</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Dress modestly as it is a religious site</li>\n");
      out.write("                    <li>Admire the intricate carvings and marble work</li>\n");
      out.write("                    <li>Hiring a guide is recommended to understand the history and architecture</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Nakki Lake</h2>\n");
      out.write("            <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"ab (1).jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>A serene lake located in the heart of Mount Abu, ideal for boating and enjoying the peaceful atmosphere surrounded by hills.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 8:00 AM - 8:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> Free</p>\n");
      out.write("                <p><strong>Address:</strong> Nakki Lake Rd, Mount Abu, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning or evening for a cool breeze and less crowd</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Go for a boat ride to explore the lake</li>\n");
      out.write("                    <li>Visit the nearby Sunset Point after boating</li>\n");
      out.write("                    <li>Don’t miss the surrounding gardens and local eateries</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Sunset Point</h2>\n");
      out.write("           <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"sunset_Main_800(1).jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>One of the best spots to view a stunning sunset with panoramic views of the surrounding mountains and valleys.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 4:00 PM - 7:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹20</p>\n");
      out.write("                <p><strong>Address:</strong> Sunset Point, Mount Abu, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Late afternoon to catch the sunset</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Arrive early to secure a good spot for viewing</li>\n");
      out.write("                    <li>Wear comfortable shoes as it’s a short walk uphill</li>\n");
      out.write("                    <li>Bring a light jacket, as it can get chilly in the evening</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Guru Shikhar</h2>\n");
      out.write("            <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"view-from-top (1).jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>At the highest point in Mount Abu, Guru Shikhar offers breathtaking views and is home to the Guru Dattatreya Temple.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 5:00 AM - 7:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> Free</p>\n");
      out.write("                <p><strong>Address:</strong> Guru Shikhar, Mount Abu, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning or evening for the best views</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Bring a camera for panoramic views of the entire region</li>\n");
      out.write("                    <li>Wear comfortable walking shoes as the path can be steep</li>\n");
      out.write("                    <li>Spend some time at the temple for a spiritual experience</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Achalgarh Fort</h2>\n");
      out.write("           <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"achala (1).jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>An ancient fort offering a glimpse into Mount Abu's history, featuring temples, ruins, and scenic surroundings.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹20</p>\n");
      out.write("                <p><strong>Address:</strong> Achalgarh, Mount Abu, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Early morning or late afternoon</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Explore the nearby Jain temples for a deeper cultural experience</li>\n");
      out.write("                    <li>Carry water, as the climb can be tiring</li>\n");
      out.write("                    <li>Be cautious around the ruins and ancient structures</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"place-card\">\n");
      out.write("            <h2>Mount Abu Wildlife Sanctuary</h2>\n");
      out.write("            <div id=\"imageContainer\">\n");
      out.write("                <img id=\"placeImage\" class=\"place-image\" src=\"park-sign (1).jpg\" alt=\"Qila Mubarak\">\n");
      out.write("            </div>\n");
      out.write("            <p>A sanctuary known for its diverse flora and fauna, offering nature walks and wildlife sightings like leopards, bears, and several species of birds.</p>\n");
      out.write("            <div class=\"details\">\n");
      out.write("                <p><strong>Timings:</strong> 7:00 AM - 5:00 PM</p>\n");
      out.write("                <p><strong>Entry Fee:</strong> ₹20 for Indians, ₹50 for foreigners</p>\n");
      out.write("                <p><strong>Address:</strong> Mount Abu, Rajasthan</p>\n");
      out.write("                <p><strong>Best Time to Visit:</strong> Winter months (October to March) for pleasant weather</p>\n");
      out.write("                <p><strong>Tips:</strong></p>\n");
      out.write("                <ul>\n");
      out.write("                    <li>Take a guided tour to spot wildlife</li>\n");
      out.write("                    <li>Wear appropriate clothing for a nature walk</li>\n");
      out.write("                    <li>Carry binoculars for birdwatching</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("     \n");
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

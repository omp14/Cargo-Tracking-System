package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeLogin
 */
@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	out.println("<html lang='en'>");
	out.println("<head>");
	out.println("<link href='design/css/bootstrap.min.css' rel='stylesheet'>");
	out.println("<link href='http://fonts.googleapis.com/css?family=Roboto+Slab:400,300,100,700' rel='stylesheet' type='text/css'>");
	out.println("<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic' rel='stylesheet' type='text/css'>");
	out.println("<link href='design/css/style.css' rel='stylesheet'>");
	out.println("<link rel='stylesheet' href='design/css/font-awesome.min.css'>");
	out.println("</head>");
	out.println("<body>");
	out.println("<div class='tp-header' id='tp-header'>");
	out.println("  <div class='container'>");
	out.println("    <div class='row'>");
	out.println("      <div class='col-md-4'> <a class='navbar-brand' href='#'><img src='design/images/logo.png' alt='Peace Insurance Logo' class='img-responsive'></a> </div>");
	out.println("      <div class='col-md-8 cta-box text-right'>    ");
//	out.println("        <a href='login-page.html' class='btn tp-btn tp-btn-blue'>Login</a>  ");
	out.println("    </div></div>");
	out.println("  </div>");
	out.println("</div>");
	out.println("<div class='tp-navbar'>");
	out.println("  <nav class='navbar navbar-default'>");
	out.println("    <div class='container'> ");
	out.println("      <div class='navbar-header'>");
	out.println("        <button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#bs-example-navbar-collapse-1'> <span class='sr-only'>Toggle navigation</span> <span class='icon-bar'></span> <span class='icon-bar'></span> <span class='icon-bar'></span> </button>");
	out.println("      </div>");
	out.println("      <div class='collapse navbar-collapse' id='bs-example-navbar-collapse-1'>");
	out.println("        <ul class='nav navbar-nav'>");
	out.println("          <li class='dropdown'> <a href='http://localhost:88/CargoTracking/EmployeeLogin' class='dropdown-toggle' > Employee Login </a></li>");
	out.println("          <li class='dropdown'> <a href='http://localhost:88/CargoTracking/AdminLogin' class='dropdown-toggle' >AdminLogin </a></li>");

	out.println("        </ul>");
	out.println("      </div>");
	out.println("    </div>");
	out.println("  </nav>");
	out.println("</div>");
	out.println("<div class='main-container' id='main-container'><!--Main container start-->");
	out.println("  <div class='form-page' id='form-page'><!-- form section -->");
	out.println("  	<div class='container'>");
	out.println("    	<div class='row'>");
	out.println("        	<div class='col-md-offset-1 col-md-10'>");
	out.println("            	<div class='row'>");
	out.println("                	<div class='col-md-6'>");
	out.println("                    	<div class='grey-box'><!-- greay box -->");
	out.println("                        	<h2 class='tp-title'>Employee Account Log In</h2>      ");
	out.println("<form action=CheckEmployeeLogin method=post>");
	out.println("                                <div class='form-group'>");
	out.println("                                  <label class='control-label' for='email'>Employee ID</label>  ");
	out.println("                                  <input  name='eid' type='text' placeholder='' class='form-control input-md' required>");
	out.println("                                </div>");
	out.println("                                <div class='form-group'>");
	out.println("                                  <label class='control-label' for='password'>Password</label>");
	out.println("                                  <input  name='password' type='password' placeholder='' class='form-control input-md' required>");
	out.println("                                </div>");
	out.println("                                <div class='form-group'>");
	out.println("                                  <label class='control-label' for='button'></label>");
	out.println("<input type=submit value='Sign In' class='btn tp-btn tp-btn-orange'>");
	out.println("                                </div>");

	out.println("                                </form>");
	out.println("                        </div><!-- /.greay box -->");
	out.println("                    </div>");
	out.println("                    <div class='col-md-6'>");
	out.println("                   <img src='design/images/virtual_classroom.jpg' class='img-responsive'>");
	out.println("                    </div>");
	out.println("                </div>");
	out.println("            </div>");
	out.println("        </div>");
	out.println("    </div>");
	out.println("  </div>");
	out.println("</div>");
	out.println("<div id='tp-footer-two' class='tp-footer-two'><!-- footer -->");
	out.println("  <div class='container'>");
	out.println("    <div class='row ft-section'> ");
	out.println("    </div>");
	out.println("    <div class='row'>");
	out.println("      <div class='col-md-6 copyright-text'><!-- copyright text --> ");
	out.println("      </div>");
	out.println("      <div class='col-md-6 tiny-ft-links'><!-- tiny ft links -->   ");
	out.println("      </div>");
	out.println("    </div>");
	out.println("  </div>");
	out.println("</div>");
	out.println("<script src='design/js/jquery-1.11.3.min.js'></script>  ");
	out.println("<script src='design/js/bootstrap.min.js'></script> ");
	out.println("<script src='design/js/nav-menu.js'></script> ");
	out.println("<script type='text/javascript' src='design/js/search.js'></script> ");
	out.println("<script type='text/javascript' src='design/js/font-size.js'></script> ");
	out.println("<script type='text/javascript' src='design/js/offset.js'></script> ");
	out.println("<script type='text/javascript' src='design/js/jquery.easing.min.js'></script>");
	out.println("</body>");
	out.println("</html>");
	

	out.flush();
}
}
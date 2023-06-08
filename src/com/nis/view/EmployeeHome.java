package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nis.model.Admin;
import com.nis.model.Employee;

/**
 * Servlet implementation class EmployeeHome
 */
@WebServlet("/EmployeeHome")
public class EmployeeHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	HttpSession ses=request.getSession();
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
	out.println("      <div class='col-md-4'> <a class='navbar-brand' href='index-2.html'><img src='design/images/logo.png' alt='Peace Insurance Logo' class='img-responsive'></a> </div>");
	out.println("      <div class='col-md-8 cta-box text-right'>    ");
	try{
		Employee E=(Employee)ses.getValue("SEMPLOYEE");
		String nav="<h5 style='color:#FFF;'><i>Employee Id:"+E.getEmployeeid()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;p;&nbsp;&nbsp;&nbsp;&nbsp;"+E.getEmployeename()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LTIME")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=images/"+E.getPhotograph()+" width=40 height=40></i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a class='btn btn-info btn-xs' href=EmployeeLogout>Logout</a></h5>";			
        out.println(nav);
		}
	catch(Exception e){
		response.sendRedirect("EmployeeLogin");
	}
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
	out.println("<li class='dropdown'><a class='dropdown-toggle' href=DispatchView target=mw>Dispatch Register</a></li>");
	out.println("<li class='dropdown'><a class='dropdown-toggle' href=TrackingView target=mw>Tracking View </a></li>");
	out.println("<li class='dropdown'><a class='dropdown-toggle' href=CRMView target=mw>CRM</a></li>");
	
/*	out.println("          <li class='dropdown'> <a href='#' class='dropdown-toggle' > Home </a></li>");
	out.println("          <li class='dropdown'> <a href='#' class='dropdown-toggle' >Insurance </a></li>");
	out.println("          <li class='dropdown'> <a href='#' class='dropdown-toggle' >Find An Agent </a></li>");
	out.println("          <li class='dropdown'> <a href='#' class='dropdown-toggle' >Claim Center</a></li>");
	out.println("          <li class='dropdown'> <a href='#' class='dropdown-toggle' >Pages</a> </li>");*/
	out.println("        </ul>");
	out.println("      </div>");
	out.println("    </div>");
	out.println("  </nav>");
	out.println("</div>");
	out.println("<div class='main-container' id='main-container'><!--Main container start-->");
	out.println("  <div class='form-page' id='form-page'><!-- form section -->");
	out.println("  	<div class='container'>");
	

	out.println("                    <div class='col-md-12'>");
	out.println("<iframe name=mw style='width:100%; height:1000px; background-image:url(design/images/iframe.png);' frameborder=0></iframe>");
	out.println("                    </div>");
	out.println("                </div>");

	out.println("        </div>");

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



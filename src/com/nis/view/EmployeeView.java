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

/**
 * Servlet implementation class EmployeeView
 */
@WebServlet("/EmployeeView")
public class EmployeeView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeView() {
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
		    try{
				 Admin A=(Admin)ses.getValue("SADMIN");	
				 String nav="<h5><i>Admin id:"+A.getAdminid()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+A.getAdminname()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LTIME")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=images/"+A.getPicture()+" width=35 height=35></i></h5>";	
			//	 out.println (nav);		 
					
				}catch(Exception e)
				{
			     response.sendRedirect("AdminLogin");		
				}
			   
			out.println("<script src='asset/jquery-2.2.1.min.js'></script>");
	        out.println("<script src='asset/csc.js'></script>");
	        out.println("<script src='asset/cnsCheck.js'></script>");
	        out.println("<link href='design/css/bootstrap.min.css' rel='stylesheet'>");
	        out.println("<html>");
	        out.println("<center><a class='btn btn-info' href=EmployeeDisplayAll>Display All Employee</a><br>");
	        
	        out.println("<form action=EmployeeSubmit method=post enctype='multipart/form-data'>");
	        out.println("<table class='table table-bordered' style='width:80%;'>");
	        out.println("<caption><b><i>Employee Registration</i></b></caption>");
	        out.println("<tr>");
	        out.println("<td><b><i>Employee Name:</i></b></td><td><input class='form-control' type=text name=employeename required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Dob:</i></b></td><td><input type=text class='form-control'  required name=dob size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Address:</i></b></td><td><input class='form-control' type=text name=address required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Country:</i></b></td><td><select class='form-control' id=country name=country></select></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>State:</i></b></td><td><select id=state class='form-control' name=state><option>-Select-</option></select></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>City:</i></b></td><td><select id=city class='form-control' name=city><option>-Select-</option></select></td>");
	        out.println("</tr>");
	        
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Phone No:</i></b></td><td><input class='form-control' type=text name=phoneno required size=30></td>");
	        out.println("</tr>");
	        
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Mobile No:</i></b></td><td><input class='form-control' type=text name=mobileno required size=30></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Qualification:</i></b></td><td><input class='form-control' type=text name=qualification required size=30></td>");
	        out.println("</tr>");
	        
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Designation:</i></b></td><td><input class='form-control' type=text name=designation required size=30></td>");
	        out.println("</tr>");
	        
			
	        out.println("<tr>");
	        out.println("<td><b><i>Photograph:</i></b></td><td><input class='form-control' type=file required name=photograph></td>");
	        out.println("</tr>");
	        
			
	        out.println("<tr>");
	        out.println("<td><b><i>Password:</i></b></td><td><input class='form-control' type=password required name=password size=30 id=password></td>");
	        out.println("</tr>");
	        
	        out.println("<tr>");
	        out.println("<td><b><i>Confirm Password:</i></b></td><td><input class='form-control' type=password required name=cpassword size=30 id=cpassword>&nbsp;&nbsp;&nbsp;<span id=msg></span></td>");
	        out.println("</tr>");
	    
		
	        out.println("<tr>");
	        out.println("<td><input type=submit class='btn btn-success' id=btn></td><td><input class='btn btn-danger' type=reset></td>");
	        out.println("</tr>");
	        out.println("</table></center></form></html>");
	        out.flush();
			

	
	
	}

}

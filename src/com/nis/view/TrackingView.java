package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nis.model.Employee;

/**
 * Servlet implementation class TrackingView
 */
@WebServlet("/TrackingView")
public class TrackingView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrackingView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	out.println("<script src='asset/jquery-2.2.1.min.js'></script>");
	out.println("<script src='asset/tracking.js'></script>");

	HttpSession ses=request.getSession();
	out.println("<html>");
	out.println("<link href='design/css/bootstrap.min.css' rel='stylesheet'>");
	String eid="";
	try{
		Employee E=(Employee)ses.getValue("SEMPLOYEE");	
	// String nav="<h5><i>Employee id:"+E.getEmployeeid()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+E.getEmployeename()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LTIME")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=images/"+E.getPhotograph()+" width=35 height=35></i></h5><hr>";	
	eid=E.getEmployeeid()+"";
	//out.println(nav);		 
		
	}catch(Exception e)
	{
     response.sendRedirect("EmployeeLogin");		
	}

	
	out.println("<html><center>");
	out.println("<input class='form-control' type=hidden id=eid value='"+eid+"'>");
	 out.println("<table class='table table-bordered' style='width:80%;'>");
	out.println("<tr><td><b><i>Tracking Id:</i></b></td><td><input class='form-control' type=text name=tid id=tid></td><td><input class='btn btn-info' type=button value='search' id=btn></tr>");
	out.println("</table><br>");
	out.println("<span id=result></span>");
	out.println("</center></html>");
	}

}

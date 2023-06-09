package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nis.Controller.ConsigneeController;
import com.nis.model.Consignee;

/**
 * Servlet implementation class ConsigneeDisplayById
 */
@WebServlet("/ConsigneeDisplayById")
public class ConsigneeDisplayById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsigneeDisplayById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Consignee C=ConsigneeController.displayById(Integer.parseInt(request.getParameter("cid")));
		if(C==null)
		{out.println("Not Found");
 		}
		else
		{out.println("<script src='asset/jquery-2.2.1.min.js'></script>");
        out.println("<script src='asset/csc.js'></script>");
        out.println("<script src='asset/cnsCheck.js'></script>");
        out.println("<html>");
    	out.println("<link href='design/css/bootstrap.min.css' rel='stylesheet'>");
    	out.println("<center><a class='btn btn-info' href=ConsigneeDisplayAll>Display All Consignee</a><br>");
        out.println("<form action=ConsigneeEditDelete method=post enctype='multipart/form-data'>");
        out.println("<table class='table table-bordered' style='width:80%;'><tr><td>");
        out.println("<table class='table table-bordered' style='width:80%;'>");
        
        
        out.println("<caption><b><i>Consingee Registration</i></b></caption>");
        out.println("<input type=hidden value='"+C.getId()+"' name=cid>");
        out.println("<tr>");
        out.println("<td><b><i>Firm Name:</i></b></td><td><input class='form-control' type=text name=firmname value='"+C.getFirmname()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Registration No:</i></b></td><td><input class='form-control' type=text   value='"+C.getRegistration_no()+"' name=registrationno size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Owner Name:</i></b></td><td><input type=text class='form-control' name=ownername  value='"+C.getOwnername()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Contact Person:</i></b></td><td><input type=text class='form-control'  value='"+C.getContactperson()+"' name=contactperson size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Mobile No:</i></b></td><td><input type=text class='form-control' name=mobileno  value='"+C.getMobileno()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Phone No:</i></b></td><td><input type=text class='form-control' name=phoneno  value='"+C.getPhoneno()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Email Id:</i></b></td><td><input type=text class='form-control' name=email   value='"+C.getEmail()+"'size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        out.println("<td><b><i>Address:</i></b></td><td><input type=text class='form-control' name=address  value='"+C.getAddress()+"' size=30></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        String cnt[]=C.getCountry().split(",");
        out.println("<td><b><i>Country:</i></b></td><td><input type=hidden class='form-control' value='"+cnt[0]+"' name=icountry><b>"+cnt[1]+"<b><br><select id=country name=country></select></td>");
        out.println("</tr>");
        
        out.println("<tr>");
        String st[]=C.getState().split(",");
        out.println("<td><b><i>State:</i></b></td><td><input type=hidden class='form-control' value='"+st[0]+"' name=istate><b>"+st[1]+"<b><br><select id=state name=state><option>-Select-</option></select></td>");
        out.println("</tr>");
        String ct[]=C.getCity().split(",");
        out.println("<tr>");
        out.println("<td><b><i>City:</i></b></td><td><input type=hidden class='form-control' value='"+ct[0]+"' name=icity><b>"+ct[1]+"<b><br><select id=city name=city><option>-Select-</option></select></td>");
        out.println("</tr>");
        
        
        out.println("<tr>");
        out.println("<td><b><i>Deals In:</i></b></td><td><input type=text class='form-control' name=dealsin  value='"+C.getDeals_in()+"' size=30></td>");
        out.println("</tr>");
        
        
        out.println("<tr>");
        out.println("<td><b><i>Website:</i></b></td><td><input type=text class='form-control' name=website  value='"+C.getWebsite()+"' size=30></td>");
        out.println("</tr>");
        
		
         
	
        out.println("<tr>");
        out.println("<td><input type=submit class='btn btn-success' name=btn value=Edit></td><td><input class='btn btn-info' type=Submit name=btn value=Delete></td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</td><td valign=top>");
        out.println("<img src=images/"+C.getFirmlogo()+" width=250 height=250><br><br><b><i>Update Picture:<i><br><input type=file name=firmlogo><br><br><input class='btn btn-success' type=submit name=btn value=Update></td></tr></table>");
        out.println("</center></form></html>");
         	
			
	
			
	
	
	
	}

	}
}

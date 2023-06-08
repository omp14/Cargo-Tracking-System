package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nis.Controller.ConsigneeController;
import com.nis.model.Admin;


/**
 * Servlet implementation class ConsigneeDisplayAll
 */
@WebServlet("/ConsigneeDisplayAll")
public class ConsigneeDisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsigneeDisplayAll() {
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
		ResultSet rs=ConsigneeController.displayAll();
		out.println("<html>");
		out.println("<link href='design/css/bootstrap.min.css' rel='stylesheet'>");
		out.println("<center><a class='btn btn-info' href=ConsigneeView>Add  New Consignee</a><br>");

		if(rs.next())
		{out.print("<table class='table table-bordered' style='width:80%;'>");
		out.print("<caption><i><b>List of Consingee</b></i></caption>");
		  out.println("<tr>");
		  out.println("<th>Sno</th><th>Id/Firm Name</th><th>Owner Name/<br>Registration</th><th>Contact Person</th><th>Deals In</th><th>Website</th><th>Update</th></tr>");
	 		int sn=1;
			do{
				out.println("<tr><td>"+sn+"</td><td>"+rs.getString(1)+"/<br>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"/<br>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"<br>"+rs.getString(9)+"<br>"+rs.getString(12)+","+rs.getString(11)+"<br>"+rs.getString(10)+"<br>"+rs.getString(8)+"<br>Mob:"+rs.getString(6)+" Ph:"+rs.getString(7)+"</td><td>"+rs.getString(13)+"</td><td><img src=images/"+rs.getString(15)+" width=45 height=45><br><a href="+rs.getString(14)+">"+rs.getString(14)+"</a></td><td><a class='btn btn-info btn-xs' href=ConsigneeDisplayById?cid="+rs.getString(1)+">Edit/Delete</a></td></tr>");
				
				
			sn++;
		}while(rs.next());
			out.println("</table></center></html>");
		}
		else
		{
		out.println("Record Not Found");	
		}
			
		}catch(Exception e){
			out.println(e);
			
		}
	
	}

}

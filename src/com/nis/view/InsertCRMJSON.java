package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.nis.Controller.CRMController;
import com.nis.Controller.TrackingController;
import com.nis.model.Crm;

/**
 * Servlet implementation class InsertCRMJSON
 */
@WebServlet("/InsertCRMJSON")
public class InsertCRMJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertCRMJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
			Crm C=new Crm();
			C.setTrackingId(Integer.parseInt(request.getParameter("tid")));
			C.setEmployeeId(Integer.parseInt(request.getParameter("eid")));
			C.setCurrdate(request.getParameter("tcd"));
			C.setCurrTime(request.getParameter("tct"));
			C.setConversation(request.getParameter("td"));
			C.setAction(request.getParameter("action"));
			
			boolean st=CRMController.addNewRecord(C);
			JSONObject obj=new JSONObject();
			if(st)
			{
				obj.put("message","<font color=Green><b><i>Record Submitted</i></b></font>");
			}
			else{
				obj.put("message","<font color=red><b><i>Record Not Submitted</i></b></font>");
			}
			out.println(obj);
			
			
			
			
			
			
			
		}
		catch(Exception e){
			out.println(e);
			}
	}

}

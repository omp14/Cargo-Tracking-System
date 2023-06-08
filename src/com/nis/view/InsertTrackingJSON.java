package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.nis.Controller.TrackingController;
import com.nis.model.Tracking;

/**
 * Servlet implementation class InsertTrackingJSON
 */
@WebServlet("/InsertTrackingJSON")
public class InsertTrackingJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTrackingJSON() {
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
			//tid eid tcd tct td lat lng
			Tracking T=new Tracking();
			T.setTrackingid(Integer.parseInt(request.getParameter("tid")));
			T.setEmployeeid(Integer.parseInt(request.getParameter("eid")));
			
			T.setTdate(request.getParameter("tcd"));
			T.setTtime(request.getParameter("tct"));
			T.setDiscription("td");
			T.setLat(request.getParameter("lat"));
			T.setLng(request.getParameter("lng"));
			
			boolean st=TrackingController.addNewRecord(T);
			JSONObject obj=new JSONObject();
			if(st)
			{
				obj.put("message","<font color=green><b><i>Record Submitted</i></b></font>");
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

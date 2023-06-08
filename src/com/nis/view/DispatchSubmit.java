package com.nis.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nis.Controller.ConsigneeController;
import com.nis.Controller.ConsignerController;
import com.nis.Controller.DispatchController;
import com.nis.Controller.TrackingController;
import com.nis.model.Consignee;
import com.nis.model.Consigner;
import com.nis.model.Dispatch;
import com.nis.model.Tracking;

/**
 * Servlet implementation class DispatchSubmit
 */
@WebServlet("/DispatchSubmit")
public class DispatchSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatchSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 
		 * http://localhost:88/CargoTracking/DispatchSubmit?
		 * &dispatchdate=ee&dispatchtime=ee&consigner=5&consignee=2&productdesc=ee&producttype=Liquid&totalbox=ee&quantInbox=e&amount=e&chargeofdispatch=e&dispatchfrom=e&dispa
		 * tchto=e&dispatchby=Sea+Route&veichelno=e&approxday=e	
		 */
		
	PrintWriter out=response.getWriter();
	Dispatch D=new Dispatch();
	D.setEmployeeid(Integer.parseInt(request.getParameter("employeeid")));
	D.setDispatchdate(request.getParameter("dispatchdate"));
	D.setDispatchtime(request.getParameter("dispatchtime"));
	D.setConsignerid(Integer.parseInt(request.getParameter("consigner")));
	D.setConsigneeid(Integer.parseInt(request.getParameter("consignee")));
	D.setProductdiscription(request.getParameter("productdisc"));
	D.setProducttype(request.getParameter("producttype"));
	D.setTotalbox(request.getParameter("totalbox"));
	D.setQuantity_in_box(request.getParameter("quantInbox"));
	D.setAmount(request.getParameter("amount"));
	D.setCharge_of_dispatch(request.getParameter("chargeofdispatch"));
	D.setDispatch_from(request.getParameter("dispatchfrom"));
	D.setDispatch_to(request.getParameter("dispatchto"));
	D.setBy_xyz(request.getParameter("byxyz"));
	D.setVehicleno(request.getParameter("vehicleno"));
	D.setApproxno_of_days(request.getParameter("approxnoofday"));
	boolean st=DispatchController.addNewRecord(D);
	out.println("<html>");
	if(st){
		out.println("<b><i>Record Submitted</i></b>");
		int tid=DispatchController.getTrackingId();
//trackingtransactionid, trackingid, employeeid, tdate, ttime, description, lat, lng		
		Tracking T=new Tracking();
		T.setTrackingid(tid);
		T.setEmployeeid(D.getEmployeeid());
		T.setTdate(D.getDispatchdate());
		T.setTtime(D.getDispatchtime());
		StringBuffer des=new StringBuffer();
		
		des.append("Dispatch From:"+D.getDispatch_from()+"\r");
		des.append("Dispatch To:"+D.getDispatch_to()+"\r");
		des.append("By_Xyz:"+D.getBy_xyz()+"\r");
		des.append("Vehicle No:"+D.getVehicleno()+"\r");
		T.setDiscription(des.toString());
		T.setLat("0");
		T.setLng("0");
		TrackingController.addNewRecord(T);
		
		//trackingtransactionid, trackingid, employeeid, tdate, ttime, description, lat, lng
		
		
		SmsServlet sms=new SmsServlet();
		Consigner Cr=new Consigner();
		Cr=ConsignerController.displayById(D.getConsignerid());
		System.out.print(Cr.getMobileno());
		sms.SendSms("COM4",Cr.getMobileno() ,"Your Product Has Been Dispatched..Ur Tracking Is is "+tid);
		Consignee Ce=new Consignee();
		Ce=ConsigneeController.displayById(D.getConsigneeid());
		sms.SendSms("COM4",Ce.getMobileno(),"Your Product Has Been Dispatched..Ur Tracking Is is"+tid);
	}
	else{
		out.println("<b><i>Fail To Submit Record</i></b>");
	}
		out.println("</html>");
		out.flush();
	}

}

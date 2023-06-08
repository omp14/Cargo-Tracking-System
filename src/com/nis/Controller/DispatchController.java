package com.nis.Controller;


import java.sql.Connection;
import java.sql.ResultSet;

import com.nis.model.Dispatch;

public class DispatchController {
	 public static boolean addNewRecord(Dispatch D){
	  	   try{
	  		   
	  		   Connection cn=DBHelper.openConnection();
	  	//employeeid, transactionid, dispatchdate, dispatchtime, consignerid, consigneeid, productdiscription, producttype, totalbox, quantity_in_box, amount, charge_of_dispatch, dispatch_from, dispatch_to, by_xyz, vehicleno, approxno_of_days	                                                                                
	    String q="Insert into Dispatch (employeeid, dispatchdate, dispatchtime, consignerid, consigneeid, productdiscription, producttype, totalbox, quantity_in_box, amount, charge_of_dispatch, dispatch_from, dispatch_to, by_xyz, vehicleno, approxno_of_days ) values ("+D.getEmployeeid()+",'"+D.getDispatchdate()+"','"+D.getDispatchtime()+"',"+D.getConsignerid()+","+D.getConsigneeid()+",'"+D.getProductdiscription()+"','"+D.getProducttype()+"','"+D.getTotalbox()+"','"+D.getQuantity_in_box()+"','"+D.getAmount()+"','"+D.getCharge_of_dispatch()+"','"+D.getDispatch_from()+"','"+D.getDispatch_to()+"','"+D.getBy_xyz()+"','"+D.getVehicleno()+"','"+D.getApproxno_of_days()+"')";
	             boolean st=DBHelper.executeUpdate(cn, q);
	             return (st);
	         }
	  	   catch(Exception e){
	  		   System.out.println("DispatchController:addNewRecord:"+e);
	  		   return false;	
	  	
}
}
	 public static int getTrackingId(){
		 try{
			 Connection cn=DBHelper.openConnection();
			 String q="select max(transactionid) from dispatch";
			 ResultSet rs=DBHelper.executeQuery(cn, q);
			 if(rs.next()){
			int tid=Integer.parseInt(rs.getString(1));
			return(tid);
			 }
			 else{
				return(-1); 
				 
			 }
			 }
		 catch(Exception e){
			System.out.println("DispatchController:addNewRecord:"+e); 
			 return -1;
			 
		 }
	 }
}
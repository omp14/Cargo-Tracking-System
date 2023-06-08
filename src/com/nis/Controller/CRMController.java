package com.nis.Controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.nis.model.Crm;

public class CRMController {
  public static ResultSet searchByTrackingId(int tid){
	  try{
		 Connection cn=DBHelper.openConnection();
		 String q="Select * from crm where trackingid="+tid;
		 System.out.println(q);
		 ResultSet rs=DBHelper.executeQuery(cn, q);
		 return(rs);
		   }
	  catch(Exception e){
		System.out.println("CrmController:searchTrackingByID:"+e);
		return null;
	  }
  }
  public static boolean addNewRecord(Crm C){
	  try{
		  Connection cn=DBHelper.openConnection();
		  //trackingid,Employeeid,Currdate,Currtime,Conversation,Action
		  String q="Insert into crm(trackingid, employeeid, currdate, currtime, conversation, action) values("+C.getTrackingid()+","+C.getEmployeeId()+","+C.getCurrdate()+",'"+C.getCurrTime()+"','"+C.getConversation()+"','"+C.getAction()+"')";
		  System.out.println(q);
		  boolean st=DBHelper.executeUpdate(cn,q);
		  return(st);
		  
	  }
	  catch(Exception e){
		  System.out.println("CrmController:addNewRecord:"+e);
		  return false;
		  }
  }
}

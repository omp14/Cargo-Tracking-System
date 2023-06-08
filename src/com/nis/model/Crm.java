package com.nis.model;

public class Crm {
  private int transactionid;
  private int trackingid;
  private int employeeid;
  private String currdate;
  private String currtime;
  private String conversation;
  private String action;
  public int getTransactionid(){
	  return transactionid;
	  }
  public void setTransactionid(int transactionid){
	  this.transactionid=transactionid;
  }
  public int getTrackingid(){
	  return trackingid;
  }
  public void setTrackingId(int trackingid){
	  this.trackingid=trackingid;
  }
  public int getEmployeeId(){
	  return employeeid;
  }
  public void setEmployeeId(int employeeid){
	  this.employeeid=employeeid;
  }
  public String getCurrdate(){
	  return currdate;
  }
  public void setCurrdate(String currdate){
	  this.currdate=currdate;
  }
  public String getCurrTime(){
	  return currtime;
  }
  public void setCurrTime(String currtime){
	  this.currtime=currtime;
  }
  public String getConversation(){
	  return conversation;
  }
  public void setConversation(String conversation){
	  this.conversation=conversation;
  }
  public String getAction(){
	  return action;
  }
  public void setAction(String action){
	  this.action=action;
  }
  
}
